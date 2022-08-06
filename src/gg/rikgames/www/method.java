package gg.rikgames.www;

class Human{
    String name;
    int age;

    void talk(){
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
    int calculate(int one, int two, int three){
        return one*two*three;
    }
}

public class method {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();

        human1.name = "Rik The Noob";
        human1.age = 15;

        human1.talk();
        System.out.println(human1.calculate(5,4,2));
        System.out.println(human2.calculate(7,8,9));
    }
}
