package exceptionhandling;

public class Nullpointer {
	public static void main(String[] args) {
		System.out.println("main starts");
		Nullpointer s=null;
		try{
		System.out.println(s.hashCode());
		}
		catch(java.lang.NullPointerException e){
			System.out.println("handled");
		}
	}

}
