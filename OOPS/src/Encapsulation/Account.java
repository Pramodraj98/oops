package Encapsulation;

public class Account {
private String name;
private double balance=10.0;

public Account(String name) {
	this.name=name;
}
public String getName() {
	return this.name;
}
public void setName(String name) {
	this.name=name;
}
public double getBalance() {
	return balance;
}
public void setBalance(double amt) {
	balance=balance+amt;
}
}
