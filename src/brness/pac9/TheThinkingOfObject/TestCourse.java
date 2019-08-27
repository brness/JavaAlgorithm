package brness.pac9.TheThinkingOfObject;

public class TestCourse {
    public static void main(String[] args) {
        Course course1=new Course("Data Structure");
        Course course2=new Course("Database System");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "+
        course1.getNumberofStudents());
        String[] students=course1.getStudents();
        for(int i=0;i<course1.getNumberofStudents();i++){
            System.out.print(students[i]+",");
        }

        course1.dropStudent("Peter Jones");
        System.out.println();
        System.out.println("Number of students in course1: "+
        course1.getNumberofStudents());
        String[] students2=course1.getStudents();
        for(int i=0;i<course1.getNumberofStudents();i++){
            System.out.print(students2[i]+",");
        }
    }
}
