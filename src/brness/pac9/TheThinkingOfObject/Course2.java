package brness.pac9.TheThinkingOfObject;

public class Course2 {
    private String courseName;
    private String[] students=new String[100];
    private int numberofStudents;

    public Course2(String courseName){
        this.courseName=courseName;
    }

    public void addStudent(String student){
        if(this.numberofStudents>=students.length) {
            String[] temp=new String[students.length*2+1];
            System.arraycopy(students,0,temp,0,students.length);
            students=temp;
        }
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

    public void clear(){
        String[] temp=new String[0];
        students=temp;
        numberofStudents=0;
    }
}
