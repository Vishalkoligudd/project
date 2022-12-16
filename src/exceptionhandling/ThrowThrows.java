package exceptionhandling;
class MarriageException extends Exception{
	String msg;
	MarriageException(String msg){
		this.msg=msg;
	}
	public String ddhetMsge(){
		return msg;
	}
}
public class ThrowThrows {
static void submit() throws MarriageException
{
	int age=16;
	if(age>=21){
		System.out.println("happy life");
	}else{
		throw new MarriageException("invalid age");
	}
}
public static void main(String[] args) {
	try{
	submit();
	}
	catch(MarriageException e){
		System.out.println(e.ddhetMsge());
	}
}
}
