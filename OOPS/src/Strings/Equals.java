package Strings; //  Wap to find string reversed string is equals or not

import java.util.Scanner;

public class Equals {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string value");
	String s=sc.nextLine();
	String p=s;
	String s1="";
	for(int i=s.length()-1;i>=0;i--) {
		s1=s1+s.charAt(i);
	}
	System.out.println(" The reverse string is "+s1);
	System.out.println();
	if(s1.equals(p)) {
		System.out.println("Aguthe guru");
	}
	else {
		System.out.println("Agalla guru");
	}
}
}
