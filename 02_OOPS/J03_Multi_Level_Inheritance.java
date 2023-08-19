class Animal {
    String color;
    int leg;

    void display() {
        System.out.println(this.color);
    }

    void display1() {
        System.out.println(this.leg);
    }

    void sleep() {
        System.out.println("sleep");
    }

    void eat() {
        System.out.println("eat");
    }

    void walk() {
        System.out.println("walk");
    }
}

class Birds extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

class Peacock extends Birds {
    void fly() {
        System.out.println("Peacock fly");
    }
}

public class J03_Multi_Level_Inheritance {
    public static void main(String args[]) {
        Peacock pea = new Peacock();
        pea.eat();
        pea.fly();
        pea.color = "green and brown";
        pea.display();
        pea.leg = 4;
        //pea.display1();
        System.out.println(pea.leg);
    }
}