import java.util.ArrayList;
import java.util.List;
public class Student {


    private String student_id;
    private String name;
    private int grade_level;
    private ArrayList<String> courses;


    Student(String student_id, String name, int grade_level){
        this.student_id = student_id;
        this.name = name;
        this.grade_level = grade_level;
        courses = new ArrayList<String>();
    }


    public void enroll(String course_section){
        courses.add(course_section);


    }


    public void getCourseList(){
        List<String> courseList = new ArrayList<String>();
    }


    public String displayStudent(){
        return "Student ID: " + student_id + "\t\t\tName: " + name + "\t\t\tGrade Level: " + grade_level;
    }




    // Getters and setters
    public String getStudent_id() {
        return student_id;
    }


    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getGrade_level() {
        return grade_level;
    }


    public void setGrade_level(int grade_level) {
        this.grade_level = grade_level;
    }


    public ArrayList<String> getCourses() {
        return courses;
    }


    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
}
