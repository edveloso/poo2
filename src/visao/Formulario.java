package visao;
import java.io.RandomAccessFile;

import modelo.persistencia.ConexaoComBanco;


public class Formulario {

	
	public static void main(String[] args) {

		//Testar tipos de erros possíveis e 
		//fornecer tratamento, de acordo com o tipo de erro
		//explicar 
		
		try {
			RandomAccessFile raf = new RandomAccessFile("arquivo.txt", "r");
			raf.seek(raf.length());
			String line;
			while((line = raf.readLine()) != null){
				System.out.print(line);
			}
			raf.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		//Que tipo de erro é possível ser lançado nos dois métodos abaixo? 
		//Como deve ser tratado
		//-1
		try {
			String texto = null;
			texto.endsWith("c");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//-2
		int[] array = new int[3];
		for(int i=0; i <= 4; i++){
			System.out.println(array[i]);
		}
		
		
		//De que maneira o desenvolvedor pode estar ciente que este código
		//pode dar erro e que ele precisa tratar este erro
		ConexaoComBanco conex = new ConexaoComBanco();
		conex.conecta();
		
		
		

	}

}
