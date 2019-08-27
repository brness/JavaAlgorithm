package brness.pac25.MyList;

public class TestPriorityQueue {
    public static void main(String[] args) {
        Patient patient1=new Patient("John",2);
        Patient patient2=new Patient("Jim",1);
        Patient patient3=new Patient("Tim",5);
        Patient patient4=new Patient("Cindy",7);

        MyPriorityQueue<Patient> queue=new MyPriorityQueue<Patient>();
        queue.enqueue(patient1);
        queue.enqueue(patient2);
        queue.enqueue(patient3);
        queue.enqueue(patient4);

        while(queue.getSize()>0){
            System.out.print(queue.dequeue()+" ");
        }

        //MyPriorityQueue<Object> q1=new MyPriorityQueue<Object>();没有实现Comparable接口
        //MyPriorityQueue<Number> q2=new MyPriorityQueue<Number>();同样没有实现Comparable接口
    }

    public static class Patient implements Comparable<Patient>{//实现一个关于Patient类的Comparable比较方法
        private String name;
        private int priority;

        public Patient(String name,int priority){
            this.name=name;
            this.priority=priority;
        }

        @Override
        public int compareTo(Patient o) {
            return priority-o.priority;
        }

        @Override
        public String toString() {
            return name+"(priority:"+priority+")";
        }
    }
}
