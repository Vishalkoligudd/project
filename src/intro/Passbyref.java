package intro;

public class Passbyref {
	int a=10;
	static void add(){
		Passbyref c=new Passbyref();
		System.out.println(c.a);
		
	}
	public static void main(String[] args) {
//		Passbyref b=new Passbyref();
//		System.out.println(b.a);
		add();
	}
}
