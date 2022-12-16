package exceptionhandling;

public class Nestedexceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try{
		int i=18/2;
      
       int[] arr={1,2,3,4,5};
       try{
       System.out.println(arr[i]);
       }
       catch(java.lang.ArrayIndexOutOfBoundsException e1){
    	   System.out.println("caught");
       }
      }
      catch(ArithmeticException e){
    	  System.out.println("handled");
      }
	}

}
