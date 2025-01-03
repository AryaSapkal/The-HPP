public class Course {
    private String course_id;
    private String name;
    private String subject;


    Course(String course_id, String name, String subject) {
        this.course_id = course_id;
        this.name = name;
        this.subject = subject;
    }


    public String displayCourse() {
        return "Course ID: " + course_id + "\t\t\tName: " + name + "\t\t\tSubject: " + subject;
    }


    // Getters and setters
    public String getCourse_id() {
        return course_id;
    }


    public void setCourse_id(String course_id) {
        this.course_id = course_id;
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
}

