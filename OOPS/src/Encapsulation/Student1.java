package Encapsulation;

public class Student1 {
public static void main(String[] args) {
	Student s1=new Student("Nimmi","Twins ha",1,'C');
	System.out.println(s1.getName());
	s1.setName("next year agthale mummy");
	System.out.println(s1.getName());
	System.out.println(s1.getStd());
	s1.setStd("Illa triplets ha");
	System.out.println(s1.getStd());
	
	System.out.println();
	Student s2=new Student("Nimmi","vayas adhru",2,'B');
	System.out.println(s2.getName());
	s2.setName("agidhale dummy");
	System.out.println(s2.getName());
	System.out.println(s2.getStd());
	s2.setStd("mathadalla kammi");
	System.out.println(s2.getStd());
	
	System.out.println();
	Student s3=new Student("Hello Addhu","Mathadana phone ethu",2,'B');
	System.out.println(s3.getName());
	s3.setName("Helu mudhu");
	System.out.println(s3.getName());
	System.out.println(s3.getStd());
	s3.setStd("Illa bega bus hathu");
	System.out.println(s3.getStd());
	s3.setStd("1st floor mane irodhu");
	System.out.println(s3.getStd());
	s3.setStd("Bandhu baglu thattu");
	System.out.println(s3.getStd());
}
}
