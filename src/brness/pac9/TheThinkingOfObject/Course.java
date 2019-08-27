package brness.pac9.TheThinkingOfObject;

public class Course {
    private String courseName;
    private String[] students=new String[100];
    private int numberofStudents;

    public Course(String courseName){
        this.courseName=courseName;
    }

    public void addStudent(String student){
        students[numberofStudents]=student;
        numberofStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberofStudents(){
        return numberofStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student){
        int p=0;
        for(int i=0;i<student.length();i++){
            if(students[i]==student) {
                students[i]=null;
                p = i;
            }
        }
        while(students[p+1]!=null){
            students[p]=students[p+1];
            p++;
        }
        numberofStudents--;

    }
}
