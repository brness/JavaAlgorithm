package brness.pac12.Abstract;

public class TestEdible {
    public static void main(String[] args) {
        Object[] objects={new Tiger(),new Chicken(),new Apple()};
        for(int i=0;i<objects.length;i++){
            if(objects[i] instanceof Edible)
                System.out.println(((Edible)objects[i]).howToEat());
            if(objects[i] instanceof Animal)
                System.out.println(((Animal)objects[i]).sound());
        }
    }
}

abstract class Animal{
    public abstract String sound();
}

class Chicken extends Animal implements Edible{
    public String howToEat(){
        return "Chicken :Fry it";
    }

    public String sound(){
        return "Chicken:cock-a-doodle-doo";
    }
}

class Tiger extends Animal{
    public String sound(){
        return "Tiger:Roar";
    }
}

interface Edible{
    String howToEat();
}
abstract class Fruit implements Edible{

}

class Apple extends Fruit{
    public String howToEat(){
        return "Apple:make a pie";
    }
}

class Orange extends Fruit{
    public String howToEat(){
        return "Orange: Make orange juice";
    }
}