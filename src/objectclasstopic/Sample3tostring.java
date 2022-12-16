package objectclasstopic;

public class Sample3tostring {
 String stdname;
 int stdid;
 char stdsec;
 Sample3tostring(String stdname,int stdid, char stdsec){
	  this.stdname=stdname;
	 this. stdid=stdid;
	this. stdsec=stdsec;
 }
 public String toString(){
	 return this.stdname+"\n"+this.stdid+"\n"+this.stdsec;
 }
 public static void main(String[] args) {
	 Sample3tostring s=new Sample3tostring("dinga",1234,'a');
	 System.out.println(s.toString());
}
}
