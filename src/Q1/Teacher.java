package Q1;

import java.util.ArrayList;

public class Teacher extends Person {
    private int numCourses;
    private ArrayList<String> courses;

    public Teacher(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new ArrayList<>();
    }

    public boolean addCourse(String course){
        if(!courses.isEmpty() && courses.contains(course)) return false;
        numCourses++;
        return courses.add(course);
    }

    public boolean removeCourse(String course){
        int courseIndex = courses.indexOf(course);
        if(courseIndex == -1) return false;
        courses.remove(courseIndex);
        numCourses--;
        return true;
    }

    // Not Provided In Diagram
    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }

    public int getNumCourses() {
        return numCourses;
    }
}
