package NPtypecast;

public class Subclass extends Superclass{
	int c=30;
	int d=40;

public static void main(String[] args) {
	/*Superclass a1=new Subclass();//upcasting
	System.out.println(a1.b);
	Subclass b1=(Subclass)a1;//downcasting
	System.out.println(b1.d);*/
	
	//by using object class
	Object o1=new Superclass();
	System.out.println(o1.equals(o1));
	Superclass s1=(Superclass)o1;
	System.out.println(s1.a);
}
}