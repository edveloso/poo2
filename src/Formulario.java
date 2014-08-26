import java.io.RandomAccessFile;


public class Formulario {

	
	public static void main(String[] args) {

		//Testar tipos de erros possíveis e 
		//fornecer tratamento, de acordo com o tipo de erro
		//explicar 
		
		RandomAccessFile raf = new RandomAccessFile("arquivo.txt", "r");
		raf.seek(raf.length());
		String line;
		while((line = raf.readLine()) != null){
			System.out.print(line);
		}
		raf.close();
		
		
		
		
		//Que tipo de erro é possível ser lançado nos dois métodos abaixo? 
		//Como deve ser tratado
		//-1
		String texto = null;
		texto.endsWith("c");
		
		//-2
		int[] array = new int[3];
		for(int i=0; i <= 3; i++){
			System.out.println(i);
		}
		
		
		//De que maneira o desenvolvedor pode estar ciente que este código
		//pode dar erro e que ele precisa tratar este erro
		ConexaoComBanco conex = new ConexaoComBanco();
		conex.conecta();
		
		
		

	}

}
