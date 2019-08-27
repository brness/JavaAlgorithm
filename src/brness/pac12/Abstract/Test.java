package brness.pac12.Abstract;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
//    public void m1(){
//        System.out.println("m1");
//    }

//    public static void main(String[] args) {
//        Person[] persons={new Person(8),new Person(4),new Person(6)};
//        Arrays.sort(persons);
//        for(int i=0;i<persons.length;i++){
//            System.out.println(persons[i].getId());
//        }
//    }
    public static void main(String[] args) {
        Edible stuff=new Chicken();
        eat(stuff);

        stuff=new Duck();
        eat(stuff);

        stuff=new Broccoli();
        eat(stuff);
    }

    public static void eat(Edible stuff){
        stuff.howToEat();
    }

    interface Edible{
        public String howToEat();
    }

    static class Chicken implements Edible{
        public String howToEat(){
            return "Fry it";
        }
    }

    static class Duck implements Edible{
        public String howToEat(){
            return "Roast it";
        }
    }

    static class Broccoli implements Edible{
        public String howToEat(){
            return "Stir-fry it";
        }
    }
}
//class Person implements Comparable<Person>{
//    private int id;
//    public Person(int id){
//        this.id=id;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public int compareTo(Person o){
//        if(this.getId()>o.getId())
//            return 1;
//        else if(this.getId()==o.getId())
//            return 0;
//        else return -1;
//    }
//}

//interface A{
//    void m1();
//}
