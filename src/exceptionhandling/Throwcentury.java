package exceptionhandling;

public class Throwcentury {

	static void century() throws MarriageException{
		int score=99;
		if(score==100){
			System.out.println("century");
		}else{
			throw new MarriageException("no century");
		}
	}
	public static void main(String[] args) {
		try {
			century();
		} catch (MarriageException e1) {
			System.out.println(e1.ddhetMsge());
			e1.printStackTrace();
		}
	}

}
