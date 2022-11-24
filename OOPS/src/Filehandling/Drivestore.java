package Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Drivestore {
public static void main(String[] args) throws IOException {
	File f1=new File("C:\\Users\\Dell\\OneDrive\\Documents\\JAVA Practise\\File creation/sample.txt");
	if(!f1.exists()) {
		f1.createNewFile();
		System.out.println("File created");
	}
	else {
		System.out.println("Not created");
	}
	FileOutputStream f2=new FileOutputStream(f1);
	String s="Hi macha";
	f2.write(s.getBytes());
	FileInputStream f3=new FileInputStream(f1);
	int i=f3.read();
	while(i!=-1) {
		System.out.print((char)i);
		i=f3.read();
		}
	f2.close();
	f3.close();
	}
}
