
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String netID;
	private String courses = "";
	private double tuitionbalance = 0;
	private int creditHours;
	private static int costOfCourse = 600;
	private static int id = 2000;
	
	
	//constructor: prompt user to enter sudent's name and year
	public Student() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = input.nextLine();
		
		System.out.print("Enter student Last Name: ");
		this.lastName = input.nextLine();
		
		System.out.println("1 - Freshmen\n2- Sophomore\n3- Junior\n4 Senior\nEnter student class level: ");
		this.gradeYear = input.nextInt();

		setStudentNetID();
	}
	
	
	// Generate an id 
	
	private void setStudentNetID() 
	{
		//grade level  + ID
		id++;
		this.netID =  gradeYear + ""+id;
	}

	private void setCreditHours()
	{
		Character creditNum = courses.charAt(1);

		if(creditNum.equals("1"))
			creditHours = 1;
		else if(creditNum.equals("2"))
			creditHours = 2;
		else if(creditNum.equals("3"))
			creditHours = 3;
		else if(creditNum.equals("4"))
			creditHours = 4;

	}
	
	//enroll in courses
	public void enroll() {
	 	//get inside a loop, user hits 0	
	  	do 
		{
	 			System.out.print("Enter course to enroll (Q to quit): ");
	 			Scanner input = new Scanner(System.in);
	 			String course = input.nextLine();
	 			if(!course.equals("Q")) 
				{
	 				courses = courses + "\n  " + course;
	 				tuitionbalance = tuitionbalance + costOfCourse;
	 			}
	 			else 
				{
	 				break;
	 			}
	 		} while (1 != 0);
	 	}
	 
	
	//view balance
	public void viewBalance() 
	{
	 	System.out.println("Your Balance is: $"+ tuitionbalance);
	}
		
		
	
	//pay tuition
	public void payTuition() 
	{
		viewBalance();
		System.out.print("Enter your payment: $");
	 	Scanner input = new Scanner(System.in);
	 	double payment = input.nextDouble();
	    tuitionbalance = tuitionbalance - payment;
	 	System.out.println("Thank you for your payment ");
	 	viewBalance();
	}
	
	//show status
	public String toString() 
	{
	 	return "Name: " + firstName + " " + lastName +
			   "\nStudent Status: " + gradeYear +
			   "\nStudent netID: " + netID +
	 		   "\nCourses Enrolled: " + courses +
	 		   "\nBalance: $" + tuitionbalance; 
	}
	
}