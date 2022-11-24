package Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Create { //to create file
public static void main(String[] args) throws IOException {
	File f1=new File("New doc.xlsx");
	if(!f1.exists()) {
		f1.createNewFile();
		System.out.println("Create aithappa");
	}
	else {
		System.out.println("Aglilla guru");
	}



// to give the input in text file
FileOutputStream f2=new FileOutputStream(f1);
String msg="Nan friend nimmi, agidhale dummy";
f2.write(msg.getBytes());
// f2.close();----- to close the file

//TO TAKE THE INPUT & DISPLAY THE ELEMENTS
FileInputStream f3=new FileInputStream(f1);
int i=f3.read();
while(i!=-1) {
	System.out.print((char)i);
	i=f3.read();
}

}
}
