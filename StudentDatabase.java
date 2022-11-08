import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) 
	{
		//ask how many new users we want to add
		 System.out.println("Enter number of new students to enroll: ");
		 Scanner input = new Scanner(System.in);
		 int size = input.nextInt();
		 Student[] students = new Student[size];
	
		//create n number of new students
		 for (int n = 0; n < size; n++) 
		 {
		 	students[n] = new Student();
		 	students[n].enroll();
		 	students[n].payTuition();
		 	System.out.println(students[n].toString());	
		 }
	}
}