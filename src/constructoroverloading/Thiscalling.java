package constructoroverloading;
class Calling
 {

	Calling(int a){
	
		System.out.println("hi");
	}
	Calling(double a){
		this(80);
		System.out.println("hello");
	}
	Calling(int a,double b){
		this(5.8);
		System.out.println("cool");
	}
	Calling(double b,int a){
		this(10,5.8);
		System.out.println("hot");
	}



	
}
 public class Thiscalling{
	 public static void main(String[] args) {
		new Calling(20.50,10);
	}
 }

