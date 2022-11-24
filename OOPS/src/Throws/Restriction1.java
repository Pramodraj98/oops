package Throws;

import java.util.Scanner;

public class Restriction1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Estu age");
	int age=sc.nextInt();
	if(age<18) {
		throw new Restriction("Hogo childu");
	}
	else {
		System.out.println("Bha haku");
	}
}
}
