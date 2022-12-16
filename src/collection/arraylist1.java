package collection;

import java.util.ArrayList;

public class arraylist1 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	System.out.println(a.size());
	System.out.println(a.toString());
	for(int i=0;i<a.size();i++){
		System.out.println(a.get(i));
	}
	
}
}
