package Lambda_Expression;

public class Driver {
	/*
public static void main(String[] args) {
Int i=()->{
	System.out.println("Meth-1");
};
i.m();
}*/
	
	/*public static void main(String[] args) {
		Int i=(int a,int b)->{
			int e=a+b;
			System.out.println(e);
		};
		i.m(10,20);
		
	}*/
	
	public static void main(String[] args) {
		Int i=(int a,int b)->{
			int c=a+b;
			return c;
		};
		int result=i.m(10, 20);
		System.out.println(result);
	}
}
