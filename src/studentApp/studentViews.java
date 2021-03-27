package studentApp;

public class studentViews {
    public void showStudentInformations(String studentName, String subject, float marks, int days , int earnings, String Class){
        System.out.format("%-13s%-13s%-13.2f%-13d%-13d%-13s\n" , studentName, subject, marks , days , earnings, Class);
    }

    public static void seeOverallInformation(){
        System.out.println("The total days taught across all classes: " + Student.getTotalDays());
        System.out.println("Individual days taught in each class: \n" + "	Class 8: " + Student.getDaysTotalInclassEight() +"\n" + "	Class 9: " + Student.getDaysTotalInclassNine() +"\n"+"	Class 10: "+ Student.getDaysTotalInclassTen());             
        System.out.println("Total earnings: " + Student.getTotalEarnings());
        System.out.println("Individual earnings in each class: \n" + "	Class 8: " + Student.getTotalEarningsInclassEight() +"\n" + "	Class 9: " + Student.getTotalEarningsInclassNine() +"\n"+"	Class 10: "+ Student.getTotalEarningsInclassTen());
        System.out.println("Individual earnings in each subject: \n" + "	Math: " + Student.getTotalEarningsInMath() +"\n" + "	English: " + Student.getTotalEarningsInEnglish() +"\n"+"	Bangla: "+ Student.getTotalEarningsInBangla());
        System.out.println("Average marks of all students: " + Student.getTotalAvgMarks());
    }

}
