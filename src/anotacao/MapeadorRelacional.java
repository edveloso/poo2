package anotacao;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MapeadorRelacional {

	public void tranform(Object objeto){
		List nomeCampos = new ArrayList();
		List valoresCampos = new ArrayList();
		Class clazz = objeto.getClass();
		Entidade enti = (Entidade) clazz.getAnnotation(Entidade.class);
		System.out.format("insert into %s (", enti.nome());
		for(Method metodo : clazz.getDeclaredMethods()){
				try {
					if(metodo.isAnnotationPresent(Coluna.class)){
						if(valoresCampos.add(metodo.invoke(objeto, null))){
							Coluna col = metodo.getAnnotation(Coluna.class);
							nomeCampos.add(col.nome());
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		
		for (int j = 0; j < nomeCampos.size(); j++) {
			System.out.print(nomeCampos.get(j));
			if(j < (nomeCampos.size() - 1))
				System.out.print(", ");
		}
		
		
		System.out.format(") values %s, ", valoresCampos.get(0));
		for (int j = 1; j < valoresCampos.size(); j++) {
			System.out.print(valoresCampos.get(j));
			if(j < (valoresCampos.size() - 1))
				System.out.print(", ");
		}

		System.out.println(";");
	}
	
	public static void main(String[] args) {
		MapeadorRelacional mapper = new MapeadorRelacional();
		mapper.tranform(new Professor("VELOSO", 123, "234987"));
	}
	
}
