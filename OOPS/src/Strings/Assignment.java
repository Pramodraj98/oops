package Strings;

public class Assignment {
public static void main(String[] args) {
	
	/*
	//[1] to count vowels Apples mango grapes
	String s="Apple mango grapes";
	s=s.toLowerCase();
	int count=0;
	for(int i=0;i<s.length()-1;i++) {
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ) {
			count++;
		}
	}
	System.out.println(count); */
	
	/*
	//[2] 	check nor of THE
	String s="hi helo the hi the hi the";
	int count=0;
	String s1[]=s.split(" ");
	for(int i=0;i<s1.length;i++) {
		if(s1[i].equals("the")) {
			count++;
		}
	}
	System.out.println(count); */
	
	//[3] Print rev  string
	/*
	String s1="Bha maga sitting hakana";
	String s2[]=s1.split(" ");
	for(int i=s2.length-1;i>=0;i--) {
		System.out.println(s2[i]+" ");
	} */
	
	//[3] to rev particular word 
	String s1="Bha maga sitting hakana";
	String s2[]=s1.split(" ");
	for(int i=0;i<s2.length;i++) {
		if(s2[i].equals("hakana")) {
			String s=s2[i];
			String rev="";
			for(int j=s.length()-1;j>=0;j--) {
				rev=rev+s.charAt(j);
			}
			s2[i]=rev;
		}
	}
	for(int i=0;i<s2.length;i++) {
		System.out.println(s2[i]+" ");
	}
}
}
