package exceptionhandling;

public class Finallyblock {
	public static void main(String[] args) {
		try{
		int a=1/0;
		}
		catch(java.lang.ArithmeticException e){
			System.out.println("handled");
		}
		finally{
			System.out.println("i am finally block");
		}
		
	}

}
