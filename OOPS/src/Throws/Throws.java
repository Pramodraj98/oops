
package Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Throws {
public static void m() throws FileNotFoundException {
	FileInputStream fis=new FileInputStream("C://Java programs\\OOPS/New doc.txt");
	System.out.println("First");
}

public static void m1() throws SQLException{
	System.out.println("Second");
}
public static void main(String[] args) throws Exception {
	m1();
	m();
}
}
