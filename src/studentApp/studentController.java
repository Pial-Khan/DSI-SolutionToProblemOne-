package studentApp;

public class studentController {
    private Student student;
    private studentViews view;

    public studentController(Student student, studentViews view){
        this.student = student;
        this.view = view;
    }

    public void setStudentInformations(String studentName, String subject, float marks, int days, int earnings, String Class){
        student.setStudent(studentName, subject, marks, days, earnings, Class);
    }

    public String getStudentName(){
        return student.getName();
    }

    public void showInformations(){
        view.showStudentInformations(student.getName(),student.getSubject(),student.getMarks(), student.getDays(), student.getEarnings(), student.getTheClass());
    }

}
