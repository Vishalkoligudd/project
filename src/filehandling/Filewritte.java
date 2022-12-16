package filehandling;

import java.io.File;
import java.io.IOException;

public class Filewritte {
public static void main(String[] args) throws Throwable {
	File f=new File("C:\\Users\\hp\\Desktop\\fashionshow.txt");
//	try {
		if(f.createNewFile()){
			System.out.println("file created");
		}else{
			System.out.println("file not created");
		}
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
}
}
