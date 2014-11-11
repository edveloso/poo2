package colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Form4 {

	
	public static void main(String[] args) {
		
		IGrafic grafic = new Retangulacion();
		grafic.metodo();
		
		grafic = new Quadradacion();
		grafic.metodo();
		
		Retangulacion rect = new  Retangulacion();
		rect.metodo();
		
		List<String> lista = new ArrayList<String>();
		lista = new Vector<String>();
		lista = new LinkedList<String>();
		
		Set<String> setS = new TreeSet<String>();
		setS = new HashSet<String>();
		
		Collection<String> col = new ArrayList<String>();
		col = new TreeSet<String>();
		col = new Vector<String>();
		
		col.size();
		
		Map<String, String> mapa = new HashMap<String, String>();
		mapa.put("chave", "meu valor");
		mapa.put("chave2", "meu valor 2");
		
		for(String k : mapa.keySet()){
			System.out.println(mapa.get(k));
		}
		
		
	}

}
