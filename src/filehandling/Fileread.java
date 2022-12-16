package filehandling;

import java.io.File;

public class Fileread {
	public static void main(String[] args) {
		
	
File f=new File("C:\\Users\\hp\\Desktop\\fashionshow");
if(f.mkdirs()){
	System.out.println("folder is created");
}
else{
	System.out.println("folder is not created");
}
if(f.exists()){
	System.out.println("exists");
}else{
	System.out.println("not exists");
}
if(f.delete()){
	System.out.println("deleted");
}else{
	System.out.println("not deleted");
}
}
}
