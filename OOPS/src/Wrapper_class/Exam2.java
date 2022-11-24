package Wrapper_class;
// to find the sum of num present in string 
public class Exam2 {
public static void main(String[] args) {
	String s="ELF39OCT15";
	int sum=0;
	char c[]=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		if(c[i]>='0' && c[i]<='9') {
			sum=sum+Integer.parseInt(c[i]+"");
		}
	}
	System.out.println(sum);
}
}
