
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String netID;
	private String courses = "";
	private double tuitionbalance = 0;
	private double originalBalance = 0;
	private int creditHours;
	private static int costPerCreditHour = 140;
	private int fees = 75;
	private static int id = 2000;
	
	// Prompt messages to student to input their information and credit hours that plan to take
	public Student() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = input.nextLine();
		
		System.out.print("Enter student Last Name: ");
		this.lastName = input.nextLine();
		
		System.out.println("1 - Freshmen\n2- Sophomore\n3- Junior\n4 Senior\nEnter student class level: ");
		this.gradeYear = input.nextInt();

		System.out.println("Enter the number of credit hours you intent to take");
		this.creditHours = input.nextInt();

		setStudentNetID();
	}
	
	
	// Generating a random netID for student 
	private void setStudentNetID() 
	{
		id++;
		this.netID =  gradeYear + "" + id;
	}

	// Calculates total tuition cost based on credit hours
	private double getTuitionRate()
	{
		double totalCost = 0;
		totalCost = creditHours * costPerCreditHour;
		totalCost = totalCost + fees;
		return totalCost;
	}
	
	// enrolls student in a course and tabulates tuition cost
	public void enroll() {
	  	do 
		{
	 			System.out.print("Enter course to enroll (Q to quit): ");
	 			Scanner input = new Scanner(System.in);
	 			String course = input.nextLine();
	 			if(!course.equals("Q")) 
				{
	 				courses = courses + "\n  " + course;
	 				tuitionbalance = tuitionbalance + getTuitionRate();
	 			}
	 			else 
				{
	 				break;
	 			}
	 		} while (1 != 0);
	 	}
	 
	
	// Keeps track of students' balance in account
	public void viewBalance() 
	{
	 	System.out.println("Your Balance is: $" + tuitionbalance);
	}

	public double payment()
	{
		Scanner input = new Scanner(System.in);
	 	double payment = input.nextDouble();
		tuitionbalance -= payment;

		return payment;
	}
	
	// Processes payment from student
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
	
	// Displays complete status of students' account
	public String toString() 
	{
	 	return "Name: " + firstName + " " + lastName +
			   "\nStudent Year: " + gradeYear +
			   "\nStudent netID: " + netID +
	 		   "\nCourses Enrolled: " + courses +
	 		   "\nBalance: $" + tuitionbalance; 
	}

	public String databaseRepresentation()
	{
		return lastName + "," + firstName + "," + netID + "," + creditHours + "," + tuitionbalance;
	}
}
