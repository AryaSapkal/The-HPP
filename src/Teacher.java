import java.util.ArrayList;


// Teacher class
public class Teacher {
    private String teacher_id;
    private String name;
    private String subject;
    private ArrayList<String> courses;


    Teacher(String teacher_id, String name, String subject) {
        this.teacher_id = teacher_id;
        this.name = name;
        this.subject = subject;
        this.courses = new ArrayList<String>();
    }


    public void assignToSection(String course_section) {
        courses.add(course_section);
    }


    public ArrayList<String> getAssignedSections() {
        return courses;
    }


    public String displayTeacher() {
        return "Teacher ID: " + teacher_id + "\t\t\tName: " + name + "\t\t\tSubject: " + subject;
    }


    // Getters and setters
    public String getTeacher_id() {
        return teacher_id;
    }


    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSubject() {
        return subject;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }


    public ArrayList<String> getCourses() {
        return courses;
    }


    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
}

