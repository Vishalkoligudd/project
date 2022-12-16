package encapsulation;

class ICICI{
	private int a=20;
	public int getabs(){
		return a;
	}
	public void setpwd(int a){
		this.a=a;
	}
	
}
public class Gettersetter {

	public static void main(String[] args) {
		ICICI s=new ICICI();
		System.out.println(s.getabs());
		s.setpwd(143);
		System.out.println(s.getabs());

	}

}
