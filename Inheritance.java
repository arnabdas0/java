public class Inheritance{
    public static void main(String args[]) {
        Dog dogu = new Dog();
        dogu.eat();
        dogu.legs=4;
        System.out.println(dogu.legs);
    }
}

//Base class
class Animal{
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}
class Mamal extends Animal{
    int legs;
}

class Dog extends Mamal{
    String breed;
}
//Derived class/subclass
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("swims in water.");
//     }
// }