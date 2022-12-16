package exceptionhandling;

public class Sample2 {
	public static void main(String[] args) {
		System.out.println("main starts");
		Object o1=new Integer(10);
		try{
		Character ch=(Character)o1;
		System.out.println(ch);
		}
		catch(java.lang.ClassCastException e){
			System.out.println("handled");
		}
	}

}
