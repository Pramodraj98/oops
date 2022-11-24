package Methoveriding;

public class Subclass1 extends Subclass {
void seat(){
	System.out.println("Middle");
}
public static void main(String[] args) {
	Superclass s1=new Superclass();
	Subclass s2=new Subclass();
	Subclass1 s3=new Subclass1();
	
	s1=s2;
	s2.brake();
	s2=s3;
	s3.tyre();
}
}
