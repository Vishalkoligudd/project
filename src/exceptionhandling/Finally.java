package exceptionhandling;

public class Finally {
	public static void main(String[] args) {
		try{
		int i=1/0;
		}
		finally{
			System.out.println("i am finally block");
		}
		
	}

}
