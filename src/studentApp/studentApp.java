package studentApp;

import java.util.Scanner;
import java.util.ArrayList;

public class studentApp {
	public static ArrayList<Student> studentList = new ArrayList<>();

	public static void main(String[] args) {
		
		int selected = 1;
		Scanner in = new Scanner(System.in);
		
		String studentName;
		boolean math = false;
		boolean english = false;
		boolean bangla = false;
		float avgMarks = 0;
		int totalDaysTaught = 0;
		int totalEarnings = 0;
		String Class = null;
		String subject = null;
		Student student;
		boolean continuous = true;
		
		init();
		while(continuous) {
			System.out.println("Choose an option: ");
			System.out.println("1. Add a student.");
			System.out.println("2. Edit a student.");
			System.out.println("3. Delete a student.");
			System.out.println("4. See the list of students individually.");
			System.out.println("5. See overall info.");
			System.out.println("6. Exit.");
			System.out.println("Enter your option: ");
			selected = in.nextInt();
			
			if(selected == 1) {
				System.out.println("Add a student.");
				System.out.println("Choose a class");
				System.out.println("1. Class 8.");
				System.out.println("2. Class 9.");
				System.out.println("3. Class 10.");
				System.out.println("Enter your option: ");
				int classInput = in.nextInt();
				if(classInput == 1) {
					Class = "Eight";
		
				}
				if(classInput == 2) {
					Class = "Nine";
					
				}
				if(classInput == 3) {
					Class = "Ten";
				}
				System.out.println("Student Name: ");
				studentName = in.next();
				System.out.println("Choose a subject to teach.");
				System.out.println("1. Math.");
				System.out.println("2. English.");
				System.out.println("3. Bangla.");
				int subjectInput = in.nextInt();
				if(subjectInput == 1) {
					math = true;
					subject = "Math";
		
				}
				if(subjectInput == 2) {
					english = true;
					subject = "English";
		
				}
				if(subjectInput == 3) {
					bangla = true;
					subject = "Bangla";
		
				}
				System.out.println("Average of the student got in the exam: ");
				avgMarks = in.nextFloat();
				
				System.out.println("Total days taught: ");
				totalDaysTaught = in.nextInt();
				
				System.out.println("Total earnings: ");
				totalEarnings = in.nextInt();
				
				Student stu = new Student();
                stu.setStudent(studentName, subject, avgMarks , totalDaysTaught, totalEarnings, Class);
                studentList.add(stu);
                System.out.println(studentName + " is added.");
				
				continue;
				
			}
			else if(selected == 2) {
				System.out.println("Enter the student name to edit.");
                System.out.print("Student name: ");
                studentName = in.next();
                System.out.println("Add days to the number of days taught: ");
				int addDays = in.nextInt();
				
				System.out.println("Add marks the student got in the Exam: ");
				int addMarks = in.nextInt();

                student = searchStudent(studentName);
                if(student != null){
                    studentList.remove(student);
                    student = Student.editStudent(student ,addDays, addMarks);
                    studentList.add(student);
                }
				
				
                continue;
				
			}
			else if(selected == 3) {
				System.out.println("Enter the student name you want to delete.");
                System.out.print("Student name: ");
                studentName = in.next();

                student = searchStudent(studentName);
                if(student != null){
                    studentList.remove(student);
                    System.out.println(studentName + " is deleted.");
                }
                continue;
				
			}
			else if(selected == 4) {
				displayStudentList();
				System.out.println("Choose a student to see full information");
				continue;
			}
			else if(selected == 5) {
				studentViews.seeOverallInformation();
				continue;
			}
			else {
				in.close();
				continuous = false;
			}
			
			
			
		}
		
		
		
		
		
//		Student stu1 = new Student();
//		stu1.enroll();
//		stu1.payTuition();
//		System.out.println(stu1.toString());
//		
//		System.out.println("Enter number of new students to enroll: ");
//		//Scanner in = new Scanner(System.in);


	}
    private static void init(){
        Student stu1 = new Student();
        stu1.setStudent("Rahim", "Bangla", 80 , 5, 5, "Eight");
        studentList.add(stu1);
        
        Student stu2 = new Student();
        stu2.setStudent("Karim", "English", 80 , 50, 50, "Nine");
        studentList.add(stu2);
        
        Student stu3 = new Student();
        stu3.setStudent("Abir", "Math", 80 , 40, 40, "Ten");
        studentList.add(stu3);
        
        Student stu4 = new Student();
        stu4.setStudent("Arnab", "English", 80 , 30, 30,  "Nine");
        studentList.add(stu4);
        
        Student stu5 = new Student();
        stu5.setStudent("Anim", "Math", 80 , 30, 30, "Ten");
        studentList.add(stu5);
        
        Student stu6 = new Student();
        stu6.setStudent("Kabir", "Math", 80 , 30, 30, "Ten");
        studentList.add(stu6);
        Student stu7 = new Student();
        stu7.setStudent("Samin", "Math", 80 , 30, 30, "Ten");
        studentList.add(stu7);
        Student stu8 = new Student();
        stu8.setStudent("Ashik", "Math", 80 , 30, 30, "Ten");
        studentList.add(stu8);
        Student stu9 = new Student();
        stu9.setStudent("Afif", "Math", 80 , 30, 30, "Ten");
        studentList.add(stu9);
        Student stu10 = new Student();
        stu10.setStudent("Sakib", "Math", 80 , 30, 30, "Ten");
        studentList.add(stu10);

    }
    private static Student searchStudent(String name){
        for(Student student: studentList){
            studentViews view = new studentViews();
            studentController controller = new studentController(student, view);
            if(controller.getStudentName().equals(name)){
                return student;
            }
        }
        System.out.println("Student is not found.");
        return null;
    }

    private static void displayStudentList(){
        if(studentList.isEmpty()){
            System.out.println("No student in that name.");
            return;
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-13s%-13s%-13s%-13s%-13s%-13s\n" , "Student", "Subject" , "Avg. ", "Days", "Total" , "Class");
        System.out.printf("%-13s%-13s%-13s%-13s%-13s%-13s\n" , "Name", "" , "Marks", "Taught", "Earnings" , "");
        System.out.println();
        for(Student student: studentList){
            studentViews view = new studentViews();
            studentController controller = new studentController(student, view);
            System.out.println("--------------------------------------------------------------------------------\n");
            controller.showInformations();  
        }
        System.out.println("----------------------------------------------------------------------------------");

    }

}
