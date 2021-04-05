package Day4;

import java.util.Scanner;

public class Student {
	String name;
	int roll;
	String subject;
	int section;
	int marks;
	double fees;
	Scanner sc=new Scanner(System.in);


	// add getters and setters

	public String getName() {
	return name;
	}

	public void setName(String n) {
	this.name = n;
	}

	public int getRoll() {
	return roll;
	}

	public void setRoll(int r) {
	this.roll = r;
	}

	public String getSubject() {
	return subject;
	}

	public void setSubject(String s) {
	this.subject = s;
	}
	public int getSection() {
	return section;
	}

	public void setSection(int sec) {
	this.section = sec;
	}
	public int getMarks() {
	return marks;
	}

	public void setMarks(int m) {
	this.marks = m;
	}

	public double getFees() {
	return fees;
	}

	public void setFees(double f) {
	this.fees = f;
	}
	public void calculateMarks()
	{
	// ......
	System.out.println("Enter subjects:");
	subject = sc.nextLine();

	System.out.println("Enter marks:");
	marks = sc.nextInt();
	if(marks<=50)
	{
	calculateFees(500);
	}
	    }


	/*  trigger
	*  if student marks is less than 50
	*  ---->> fees += 50%
	* */
	public void calculateFees(double f)
	{
	fees= (0.5*f)+f ;
	System.out.println(fees);

	}
}
