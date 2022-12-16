package filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewritt {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\hp\\Desktop\\fashionshow.txt");
	FileWriter f1=new FileWriter(f);
	f1.write("hello");
	f1.write("hi");
	f1.flush();
	
	System.out.println("data is written");
}
}
