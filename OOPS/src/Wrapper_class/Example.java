package Wrapper_class;

public class Example {
public static void main(String[] args) {
	// Boxing
	/*int a=10;
	Integer b=Integer.valueOf(a); // or Integer b=a;
	System.out.println(a);
	System.out.println(b.toString());// to verify
	*/
	
	/*//Unboxing 
	Integer a=12;
	int b=a;
	System.out.println(b);
	*/
	
	//String to integer
	String s1="10";
	System.out.println(s1+20);
	int a=Integer.parseInt(s1);
	System.out.println(a+20);
}
}
