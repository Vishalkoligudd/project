package constructoroverloading;
class Sample{
	Sample(int a){
		super();
		System.out.println("hi");
	}
	
}
class Demo extends Sample{
	Demo(double b){
		super(10);
		System.out.println("hello");
	}
}
class Test extends Demo{
	Test(){
	super(20.50);
	System.out.println("ok");
	}
}
public class Supercalling {
	public static void main(String[] args) {
		
	
	new Test();

}
}