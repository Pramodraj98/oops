package Strings;

public class CharAt {
public static void main(String[] args) {
	/*String s="JAAVAA"; // to count nor of a & v in string
	int count=0; 
	int count1=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='A') {
			count++;
		}
		else if(s.charAt(i)=='V') {
			count1++;
		}
	}
	System.out.println(count+" Nor of a ");
	System.out.println(count1+" nor of v");*/
	
	//to reverse the string
	String s="JAVA";
	String s1="";
	for(int i=s.length()-1;i>=0;i--) {
		s1=s1+s.charAt(i);
	}
	System.out.println(s1);
}
}
