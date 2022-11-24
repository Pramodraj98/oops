package Strings; // remove  A from array

public class Removing {
public static void main(String[] args) { /*
	String s="ABCAABCAABC";
	String s1="";
	for(int i=0;i<s.length()-1;i++) {
		if(s.charAt(i)!='A') {
			s1=s1+s.charAt(i);	
		}
	}
	System.out.println(s1); */
	
	/* //get ABC from AABBCC
	
	String s="AABBCC";
	String s1="";
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(s1.indexOf(c)==-1) {
			s1=s1+c;
		}
	}
	System.out.println(s1); */
	
	String s="AYYAAYYOO";
	String s1="";
	char[] c=s.toCharArray();
	for(int i=c.length-1;i>=0;i--) { 
		System.out.print(c[i]+" ");
	}
	
}
}
