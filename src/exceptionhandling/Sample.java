package exceptionhandling;

public class Sample {
	public static void main(String[] args) {
		System.out.println("main starts");
		try{
		int i=1/0;
		}
		catch(java.lang.ArithmeticException e){
			
		}
		System.out.println("main ends");
	}

}
