package Shadowing;

public class m2 extends m1 {
void zero() {
	System.out.println("2nd");
}
static void one() {
	System.out.println("2nd");
}
public static void main(String[] args) {
	m1 a1=new m1();
	m2 a2=new m2();
	a1=a2;
	a1.one();
	m2 a3=(m2)a1;
	a3.one();
}
}
