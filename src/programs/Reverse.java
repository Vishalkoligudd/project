package programs;

public class Reverse {
      public static void main(String[] args) {
		int[] a={1,2,3,5};
		
		
		for(int i=0;i<=a.length-1;i++){
			System.out.println(a[i]);
		}
		int[] b=a;
		for(int i=a.length-1;i>=0;i--){
			System.out.println(b[i]);
		}
//		for(int i)
//		if(a[i]==b[i]){
//			System.out.println("palindrome");
//	}else{
//			System.out.println("not palindrome");
//		}
	}
}
