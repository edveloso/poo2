package view;

public class Formulario {

	public static void main(String[] args) {
		
		Disciplina mat = new Disciplina();
		mat.setNome("matematica");
		mat.setConceito(Conceito.BOM);
		
		Disciplina port = new Disciplina();
		port.setNome("Portugues");
		port.setConceito(Conceito.MUITO_BOM);
		
		Disciplina hist = new Disciplina();
		hist.setNome("historia");
		hist.setConceito(Conceito.REGULAR);
		
		System.out.println("========");
	System.out.println(mat.getNome() + " " + mat.getConceito()) ;
	System.out.println(port.getNome() + " " + port.getConceito()) ;
	System.out.println(hist.getNome() + " " + hist.getConceito()) ;
		
		
	}
	
	
}
