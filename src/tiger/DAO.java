package tiger;

public class DAO<T> {
	
	private T t;
	
	public void add(T t){
		this.t = t;
		System.out.println(t);
	}
	
	public T retorna(){
		return t;
	}

}
