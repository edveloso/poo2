package colecoes;

import java.util.ArrayList;

public class Formulario {

	public static void main(String[] args) {
		//a)Crie um array com 3 posicoes
		//este array deve conter somente Strings
		//b)atribua valores para todas as posicoes
		//do array
		//c)altere o conteudo do array com a posicao
		//dois
		//d)remova o primeiro item do array e mova 
		//todas as posicoes acima fazendo com que 
		//a terceira posição tenha nulo
		//Exemplo: int[] array = new int[10];
        String[] array = {"jose", "maria", "joao"};
		array[1] = "pedro";
		
		for (int i = 1; i < array.length; i++) {
			array[i-1] = array[i];
			if(i == array.length-1)
				array[i] = null;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]); 
		}
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("joao");
		lista.add("antonio");
		lista.add("marcos");
		lista.add("maria");
		lista.remove(2);
		lista.set(2, "pedro");
		
		for (String string : lista) {
			
		}
		
		
		
		
	}
	
}
