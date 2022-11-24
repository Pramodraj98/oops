package Encapsulation;

public class Student {
private String name;
private String std;
private int rollno;
private char section;

public Student(String name,String std,int rollno,char sec) {
	this.name=name;
	this.std=std;
	this.rollno=rollno;
	this.section=sec;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public String getStd() {
	return std;
}
public void setStd(String std) {
	this.std=std;
}
public int getRollno() {
	return rollno;
}
public void setStd(int std) {
	this.rollno=rollno;
}
public char getSection() {
	return section;
}
public void setSection(int Section) {
	this.section=section;
}
}
