
public class TestFinally {

	
	public static void main(String[] args) {
	
		//Responda as seguintes questões:
		//quando o catch é executado?
		//quando o finally é executado?
		
		try {
			int soma = 2+3;
		} catch (Exception e) {
			System.out.println("impressão do finnaly do primeiro try");
		}
		
		try {
			double divisao = 3/0;
		} catch (Exception e) {
			System.out.println("impressão do catch do segundo try " + e.getMessage());
		}
		finally{
			System.out.println("impressão do finnaly do segundo try");
		}
		
	}
	
	
	
	
}
