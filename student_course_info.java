import java.util.ArrayList;
import java.util.List;

public class student_course_info {
    private String name;
    private List<Course> courses;

    public student_course_info(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displayCourses() {
        System.out.println("Student Name: " + name);
        for (Course course : courses) {
            System.out.println("Semester: " + course.getSemester() + ", Course: " + course.getName() + ", Marks: "
                    + course.getMarks());
        }
    }

    // Getters and setters for name and courses
}

class Course {
    public Course(String name, int semester, double marks) {
    }

    public String getMarks() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMarks'");
    }

    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    public String getSemester() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSemester'");
    }

    // Getters and setters for name, semester, and marks
}
