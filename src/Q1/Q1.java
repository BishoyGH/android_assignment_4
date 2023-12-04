package Q1;

public class Q1 {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123, Fictional St.");
        System.out.println(person.toString());

        System.out.println("\n" + "=".repeat(30)); // Separator

        Student student = new Student("Jane Doe", "456, Another Fictional St.");
        System.out.println(student.toString());
        System.out.println("Num Of Courses: " + student.getNumCourses());
        student.addCourse("Math 101");
        student.printGrades();
        student.addCourse("English 201");
        student.addCourseGrade("Math 101", 86);
        student.addCourseGrade("English 201", 95);
        student.addCourseGrade("Physics 101", 89);
        student.printGrades();
        System.out.println("Num Of Courses: " + student.getNumCourses());

        System.out.println("\n" + "=".repeat(30)); // Separator

        Teacher teacher = new Teacher("Albert Smith", "789, The Other Street");
        System.out.println(teacher.toString());
        teacher.addCourse("Math 101");
        teacher.addCourse("English 101");
        teacher.removeCourse("English 101");
        teacher.removeCourse("English 201");
        System.out.println("Num Of Courses: " + teacher.getNumCourses());
    }
}
