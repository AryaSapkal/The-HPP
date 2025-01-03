import java.util.ArrayList;
// CourseSection class
public class CourseSection {
    private String section_id;
    private String course;
    private String room;
    private String time;
    private String teacher;
    private ArrayList<String> students;


    CourseSection(String section_id, String course, String room, String time) {
        this.section_id = section_id;
        this.course = course;
        this.room = room;
        this.time = time;
        this.teacher = "TBA";
        this.students = new ArrayList<String>();
    }


    public void assignTeacher(String teacher) {
        this.teacher = teacher;
    }


    public void addStudent(String student) {
        students.add(student);
    }


    public String displayCourseSection() {
        return "Section ID: " + section_id + "\t\t\tCourse: " + course + "\t\t\tRoom: " + room + "\t\t\tTime: " + time + "\t\t\tTeacher: " + teacher;
    }


    // Getters and setters
    public String getSection_id() {
        return section_id;
    }


    public void setSection_id(String section_id) {
        this.section_id = section_id;
    }


    public String getCourse() {
        return course;
    }


    public void setCourse(String course) {
        this.course = course;
    }


    public String getRoom() {
        return room;
    }


    public void setRoom(String room) {
        this.room = room;
    }


    public String getTime() {
        return time;
    }


    public void setTime(String time) {
        this.time = time;
    }


    public String getTeacher() {
        return teacher;
    }


    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }


    public ArrayList<String> getStudents() {
        return students;
    }


    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }
}

