package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.String;
class Sdent implements Serializable{  
	 transient int id;  
	 String name;  
	 public Sdent(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 } } 
public class Student{  
public static void main(String args[])throws Exception{  
	Sdent s1 =new Sdent(211,"ravi");  
	  
	  FileOutputStream fout=new FileOutputStream("D://hii.ser");  
	  ObjectOutputStream out=new ObjectOutputStream(fout);  
	  
	  out.writeObject(s1);  
	  out.flush();  
	  System.out.println("success");  
  
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("D://hii.ser"));  
			  Sdent s=(Sdent)in.readObject();  
			  System.out.println(s.id+" "+s.name);  
			  
			  in.close();  
			 }  
	}  

