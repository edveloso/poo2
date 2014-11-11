package tiger;

public class DAO2<T> {

	public void salvar2(Object obj){
		
	}
	
  public void salvar(T pet){
	  System.out.println("salvou "+ pet.getClass().getName()); 
  }
	


  public void remover(T pet){
	  System.out.println("salvou "+ pet.getClass().getName()); 
  }


  public T listar(){
	  return null;
  }

  
  
}
