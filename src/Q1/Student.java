package Q1;

import java.util.ArrayList;

public class Student extends Person {
    private int numCourses;
    private ArrayList<String> courses;
    private ArrayList<Integer> grades;

    public Student(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    public void addCourseGrade(String course, int grade){
        int courseIndex = courses.indexOf(course);
        if(courseIndex != -1){
            grades.set(courseIndex, grade);
        }
    }

    public void printGrades(){
        for(int i=0; i < grades.size() ; i++){
            System.out.println(courses.get(i) + "\t=> " + ((grades.get(i) == null) ? "Not Graded" : grades.get(i)));
        }
    }

    public double getAverageGrade(){
        if(grades.isEmpty()) return 0;
        int total = 0;
        for(int grade: grades){
            total += grade;
        }
        return (double) total / grades.size();
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    // Not Provided In Diagram
    public boolean addCourse(String course){
        if(!courses.isEmpty() && courses.contains(course)) return false;
        numCourses++;
        grades.add(null);
        return courses.add(course);
    }
    public int getNumCourses() {
        return numCourses;
    }
}
