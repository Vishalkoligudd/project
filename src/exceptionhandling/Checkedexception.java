package exceptionhandling;


class MarriagException extends Exception{
	String msg;
	MarriagException(String msg){
		this.msg=msg;
	}
	public String getMes(){
		return msg;
	}
}
public class Checkedexception {
  static void submit() throws MarriagException
  {
	  int age=16;
	  if(age>21){
		  System.out.println("major");
	  }else{
		  throw new MarriagException("invalid age");
	  }
  }
  public static void main(String[] args) {
	try {
		submit();
	} catch (MarriagException e) {
		
		System.out.println(e.getMes());
	}
}
}
