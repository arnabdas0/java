public class OOPS {
    public static void main(String[] args) {
        
    }
}

class Animals{
    int color;

    void breath(){
        System.out.println("Breaths");
    }
}

class Fish extends Animals{
    int fins;

    void swim(){
        System.out.println("Swims");
    }
}

class Tuna extends Fish{
    int size;
}

class Shark extends Fish{
    int size;
}

class Bird extends Animals{
    int legs;

    void fly(){
        System.out.println("Fly");
    }
}

class Mammal extends Animals{
    int legs;

    void walk(){
        System.out.println("walks");
    }
}


