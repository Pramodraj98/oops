package Shadowing;

public class v2 extends v1 {
static int a=20;
static void one() {
	System.out.println("2nd");
}
public static void main(String[] args) {
	v1 a1=new v2();
	a1.one();
	v2 a2=(v2)a1;
	a2.one();
	System.out.println(a);
}
}
