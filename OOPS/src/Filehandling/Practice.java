package Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice {
public static void main(String[] args) throws IOException {
	File f1=new File("C:\\Java programs\\OOPS/New.txt");
	if(!f1.exists()) {
		f1.createNewFile();
		System.out.println("Done");
	}
	else {
		System.out.println("Damar");
	}
	
	FileOutputStream f2=new FileOutputStream(f1);
	String s1="Naanu punithanna shivanna abhimani"+"\nhii";	
	f2.write(s1.getBytes());
	
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
