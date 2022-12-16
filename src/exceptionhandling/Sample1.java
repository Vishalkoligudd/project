package exceptionhandling;

public class Sample1 {
	public static void main(String[] args) {
		System.out.println("main starts");
		int[] arr={1,2,3,4};
		try{
		System.out.println(arr[8]);
		}
		catch(java.lang.ArrayIndexOutOfBoundsException e){
			
		}
		System.out.println("main ends");
	}

}
