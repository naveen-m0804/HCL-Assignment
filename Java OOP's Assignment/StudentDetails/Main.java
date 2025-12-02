package introductionToJava.oopsAssignment.student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student stud1 = new Student();
		
		System.out.println("--- Enter the student details ---\n");
		
		System.out.print("Enter the student roll number : ");
		int studRollNo = sc.nextInt();
		stud1.setRollNo(studRollNo);
		
		sc.nextLine();
		
		System.out.print("Enter the student name : ");
		String studName = sc.nextLine();
		stud1.setName(studName);
		
		System.out.print("Enter the subject name : ");
		String sub = sc.nextLine(); 
		stud1.setSubject(sub);
		
		System.out.print("Enter the mark : ");
		int studMark = sc.nextInt();
		stud1.setMark(studMark);
		
		sc.nextLine();
		
		System.out.print("Enter the student feedback : ");
		String studFeedBack = sc.nextLine();
		stud1.setFeedBack(studFeedBack);
		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("The entered student details\n");
		System.out.println("Roll number : " + stud1.getRollNo());
		System.out.println("Name : " + stud1.getName());
		System.out.println("Subject : " + stud1.getSubject());
		System.out.println("Mark : " + stud1.getMark());
		System.out.println("Feedback : " + stud1.getFeedBack());
		
		sc.close();
	}
}