package tiger;

public class Formulario {

	public static void main(String[] args) {
		
		int[] inteiros = {43, 24, 3, 756, 6};
		
		for (int i = 0; i < inteiros.length; i++ ) {
			System.out.println(inteiros[i]);
		}

		System.out.println("novo for");
		//novo for
		for( int element  : inteiros  ){
			   System.out.println(element);
		}
		
		
		String[] strings = {"ola", "mundo", "do", "for", "each"};
		for(String x : strings){
			System.out.println(x); 
		}
		
		
		

		
	}
	
	
}






