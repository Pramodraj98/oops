package Inheritance;

public class Child extends Parent{
	int b=10;
	void multi() {
		System.out.println("multi");
	}
	
public static void main(String[] args) {
	System.out.println(brand);
	Child v1= new Child();
	v1.multi();
	v1.type();
	Parent v2=new Parent();
	v2.type();
}
}
