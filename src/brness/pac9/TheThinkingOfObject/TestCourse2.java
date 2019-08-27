package brness.pac9.TheThinkingOfObject;

public class TestCourse2 {
    public static void main(String[] args) {
        Course2 course1 = new Course2("Data Structure");
        Course2 course2 = new Course2("Database System");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        for(int i=0;i<100;i++){
            course1.addStudent("Anne Kennedy");
        }

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: " +
                course1.getNumberofStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberofStudents(); i++) {
            System.out.print(students[i] + ",");
        }
        course1.clear();
        System.out.println("Number of students in course1: " +
                course1.getNumberofStudents());
        for (int i = 0; i < course1.getNumberofStudents(); i++) {
            System.out.print(students[i] + ",");
        }

    }
}