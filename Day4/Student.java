package Day4;

import java.util.Scanner;

public class Student {
	String Name;
	int Roll;
	String Subject;
	int Section;
	int Marks;
	double Fees;
	Scanner sc=new Scanner(System.in);


	// add getters and setters

	public String getName() {
	return Name;
	}

	public void setName(String name) {
	this.Name = name;
	}

	public int getRoll() {
	return Roll;
	}

	public void setRoll(int roll) {
	this.Roll = roll;
	}

	public String getSubject() {
	return Subject;
	}

	public void setSubject(String subject) {
	this.Subject = subject;
	}
	public int getSection() {
	return Section;
	}

	public void setSection(int section) {
	this.Section = section;
	}
	public int getMarks() {
	return Marks;
	}

	public void setMarks(int marks) {
	this.Marks = marks;
	}

	public double getFees() {
	return Fees;
	}

	public void setFees(double fees) {
	this.Fees = fees;
	}
	public void calculateMarks()
	{
	// ......
	System.out.println("Enter subjects:");
	Subject = sc.nextLine();

	System.out.println("Enter marks:");
	Marks = sc.nextInt();
	if(Marks<=50)
	{
	calculateFees(500);
	}
	    }


	/*  trigger
	*  if student marks is less than 50
	*  ---->> fees += 50%
	* */
	public void calculateFees(double fees)
	{
	Fees= (0.5*fees)+fees ;
	System.out.println(Fees);

	}
}
