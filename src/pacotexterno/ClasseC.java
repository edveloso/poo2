package pacotexterno;

import pacoteinterno.ClasseA;

public class ClasseC {

	public static void main(String[] args) {
		
		ClasseA classeA = new ClasseA();
		classeA.atrPrivado = 10;
		classeA.atrPublico = 20;
		classeA.atrProtegido = 30;
		classeA.atrDefault = 40;
		
		classeA.metPrivado();
		classeA.metodoPublico();
		classeA.metodoProtegido();
		classeA.metodoDefault();
		
	}
}
