package Day4;

import java.util.Scanner;

public class Employee {
	private int empId;
	private String empName;
	private String projectName;
	
	private int exp;
	
	private int salary;
	/*
	 *   trigger
	 *   if (exp is less than 3) :- salary should not be greater than 3000
	 *   
	 *   Salary > 20000 :- Error
	 * 
	 * */
	Scanner sc = new Scanner(System.in);
	/* Business Method / operation */
	public void workingOnProject()
	{
		// 1000 lines of code ...
		System.out.println("Enter salary:");
		salary=sc.nextInt();
		
		System.out.println("Enter experience:");
		exp=sc.nextInt();
		
		if(salary>20000) 
		{
			
			System.out.println("Error");
			
		}
		else
		{
			if(exp<=3 && salary>=3000 )
			{
			System.out.println("This Salary is not possible on having less then 3years of Experience");
			}
			else
			{
			System.out.println("Your Salary is Fine according to your experience");
			}
		}
	}
	public Employee() {
		empId = -1;
		empName = " No Name Set";
		salary = -1;
		projectName = " No Project Allocate";
	}
	
	public Employee(int id)
	{
		empId = id;
	}
	
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getProjectName() {
		return projectName;
	}



	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}



	

}
