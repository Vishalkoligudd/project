package collection;

import java.util.ArrayList;

public class arraylisttoarray {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	int[] arr=new int[a.size()];
	for(int i=0; i<a.size();i++){
		arr[i]=(int)a.get(i);
		System.out.println(arr[i]);
	}
	//System.out.println(arr[i]);
}
}
