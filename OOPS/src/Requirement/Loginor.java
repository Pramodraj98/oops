package Requirement;

public class Loginor extends Loginpage {
	public void cancel(){
		System.out.println("Name");
	}
	public static void main(String[] args) {
		Loginpage l1=new Loginor();
		
		Loginor l2=(Loginor)l1;
		l2.cancel();
	}
}
