import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) throws IOException 
	{
		//ask how many new users we want to add
		 System.out.print("Enter number of new students to enroll: ");
		 Scanner input = new Scanner(System.in);
		 int size = input.nextInt();
		 Student[] students = new Student[size];
	
		//create n number of new students
		 for (int n = 0; n < size; n++) 
		 {
		 	students[n] = new Student();
		 	students[n].enroll();
		 	students[n].payTuition();
		 	System.out.println("\n" + students[n].toString() + "\n");	
		 }

		 //printing result to a file to be stored in a database
		 File myFile = new File("output.txt");
		 myFile.createNewFile();
		 PrintWriter myWriter = new PrintWriter(myFile);
		 for (int i = 0; i < size; i++) {
			myWriter.println(students[i].databaseRepresentation());
		 }
		 myWriter.close();
	}
}
