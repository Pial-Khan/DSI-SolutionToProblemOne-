package studentApp;

import java.util.Scanner;

public class Student {
	private String studentName;
	private String subject;
	private String Class;
	private static float marks = 0;
	private int days = 0;
	private int earnings = 0 ;
	private static int totalDays = 0;
	private static int totalEarnings= 0;
	private static String Math = "Math";
	private static String English = "English";
	private static String Bangla = "Bangla";
	private static int totalEarningsInClassMath = 0;
	private static int totalEarningsInClassEnglish = 0;
	private static int totalEarningsInClassBangla = 0;
	private static String Eight = "Eight";
	private static String Nine = "Nine";
	private static String Ten = "Ten";
	private static int totalEarningsInClassEight = 0;
	private static int totalEarningsInClassNine = 0;
	private static int totalEarningsInClassTen = 0;
	private static int totalDaysInClassEight = 0;
	private static int totalDaysInClassNine = 0;
	private static int totalDaysInClassTen = 0;
	private static float totalMarksOfAllStudents = 0;
	private static float totalNumOfStudents = 0;
	private static Student studentObj;
	private static float counter = 1;
	private float newAverage;
	
	public void setStudent(String studentName, String subject, float marks, int days, int earnings, String Class){ 
        this.studentName = studentName;
        this.subject = subject;
        this.marks = marks;
        this.days = days;
        this.earnings = days*1;
        this.Class = Class;
        
        this.totalEarnings += this.earnings;
        this.totalDays += days;
        this.totalMarksOfAllStudents += marks;
        totalNumOfStudents++;
        
        
        if(Class.equals(Eight)) {
        	this.totalDaysInClassEight += days;
        	this.totalEarningsInClassEight += this.earnings;
        }
        
        else if(Class.equals(Nine)) {
        	this.totalDaysInClassNine += days;
        	this.totalEarningsInClassNine += this.earnings;
        }
        else if(Class.equals(Ten)) {
        	this.totalDaysInClassTen += days;
        	this.totalEarningsInClassTen += this.earnings;
        }
        
        if(subject.equals(Math)) {
        	this.totalEarningsInClassMath += this.earnings;
        }
        else if(subject.equals(English)) {
        	this.totalEarningsInClassEnglish += this.earnings;
        }
        else if(subject.equals(Bangla)) {
        	this.totalEarningsInClassBangla += this.earnings;
        }
        
        
    }
	public static Student editStudent(Student student, int addDays, float addMarks){ 
		studentObj = student;
        studentObj.days += addDays;
        studentObj.marks += addMarks;
		studentObj.counter++;
		studentObj.marks = marks/counter ;
		return studentObj;
    }
	public String getName(){
        return studentName;
    }
	public String getSubject(){
        return subject;
    }
	public float getMarks(){
        return marks;
    }
	public int getDays(){
        return days;
    }
	public int getEarnings() {
		return earnings;
	}
	public float getAvgMarks() {
		return marks;
	}
	public String getTheClass() {
		return Class;
	}
	public float newAvgMarks(float marks, float newMarks) {
		float counter = 1;
		counter++;
		float newAverage = (marks + newMarks)/counter ;
		return newAverage;
	}
	public int addDays(int days) {
		this.days += days;
		return this.days;
	}
	public static int getTotalDays() {
		for(Student student: studentApp.studentList){
            totalDays += student.days;
            }
		return totalDays;
    }
		
	
	public static int getDaysTotalInclassEight() {
		for(Student student: studentApp.studentList){
			String className = student.Class;
            if(className.equals(Eight)) {
            	totalDaysInClassEight += student.days;
            }
            	
            }
		return totalDaysInClassEight;
	}
	public static int getDaysTotalInclassNine() {
		for(Student student: studentApp.studentList){
			String className = student.Class;
            if(className.equals(Nine)) {
            	totalDaysInClassNine += student.days;
            }
            	
            }
		return totalDaysInClassNine;
	}
	public static int getDaysTotalInclassTen() {
		for(Student student: studentApp.studentList){
			String className = student.Class;
            if(className.equals(Ten)) {
            	totalDaysInClassTen += student.days;
            }
            	
            }
		return totalDaysInClassTen;
	}
	public static int getTotalEarnings() {
		for(Student student: studentApp.studentList){
			totalEarnings += student.earnings;
            }
		return totalEarnings;
	}
	public static int getTotalEarningsInclassEight() {
		for(Student student: studentApp.studentList){
			String className = student.Class;
            if(className.equals(Eight)) {
            	totalEarningsInClassEight += student.earnings;
            }
            	
            }
		return totalEarningsInClassEight;
	}
	public static int getTotalEarningsInclassNine() {
		for(Student student: studentApp.studentList){
			String className = student.Class;
            if(className.equals(Nine)) {
            	totalEarningsInClassNine += student.earnings;
            }
            	
            }
		return totalEarningsInClassNine;
	}
	public static int getTotalEarningsInclassTen() {
		for(Student student: studentApp.studentList){
			String className = student.Class;
            if(className.equals(Ten)) {
            	totalEarningsInClassTen += student.earnings;
            }
            	
            }
		return totalEarningsInClassTen;
	}
	public static int getTotalEarningsInMath() {
		for(Student student: studentApp.studentList){
			String className = student.subject;
            if(className.equals(Math)) {
            	totalEarningsInClassMath += student.earnings;
            }
            	
            }
		return totalEarningsInClassMath;
	}
	public static int getTotalEarningsInEnglish() {
		for(Student student: studentApp.studentList){
			String className = student.subject;
            if(className.equals(English)) {
            	totalEarningsInClassEnglish += student.earnings;
            }
            	
            }
		return totalEarningsInClassEnglish;
	}
	public static int getTotalEarningsInBangla() {
		for(Student student: studentApp.studentList){
			String className = student.subject;
            if(className.equals(Bangla)) {
            	totalEarningsInClassBangla += student.earnings;
            }
            	
            }
		return totalEarningsInClassBangla;
	}
	public static float getTotalAvgMarks() {
		totalNumOfStudents = studentApp.studentList.size();
		float totalAvgOfAllStudents = 0;
		for(Student student: studentApp.studentList){
			 totalMarksOfAllStudents += Student.marks;
			 totalAvgOfAllStudents = (totalMarksOfAllStudents/totalNumOfStudents);
            	
            }
		return totalAvgOfAllStudents;
	}
	

}



