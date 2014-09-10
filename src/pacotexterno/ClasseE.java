package pacotexterno;

import pacoteinterno.ClasseA;

public class ClasseE extends ClasseA{

	void acessa(){
		atrPrivado = 10;
		atrPublico = 20;
		atrProtegido = 20;
		atrDefault = 30;

		metodoPrivado();
		metodoPublico();
		metodoProtegido();
		metodoDefault();
	}
	
}
