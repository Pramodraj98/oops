package Encapsulation;

public class User {
public static void main(String[] args) {
	Account a1=new Account("Raaghu");
	System.out.println(a1.getName());
	a1.setName("Raghanna");
	System.out.println(a1.getName());
	System.out.println();
	System.out.println(a1.getBalance());
	a1.setBalance(9999);
	System.out.println(a1.getBalance());
}
}
