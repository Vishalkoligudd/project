package collection;

import java.util.ArrayList;

public class arraylist {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add(30);
	System.out.println(a);
	ArrayList b=new ArrayList();
	b.add(30);
	b.add(40);
	b.add(50);
	//System.out.println(b);
	//a.add(2,b);
	//a.retainAll(b);
	//System.out.println(a);
	a.removeAll(b);
	//a.remove(0);
	//a.remove(1);
	System.out.println(a);
	
}
}
