class Animal{
    String color;
     int leg;
   void display(){
       System.out.println(color);
   }
   void display1(){
    System.out.println(leg);
   }
   void sleep(){
        System.out.println("sleep");
   }
   void eat(){
        System.out.println("eat");
   }
   
 }
 class Birds extends Animal{
void fly(){
    System.out.println("fly");
   }
 }
  class Peacock extends Birds{
void fly(){
    System.out.println(" Peacock fly");
   }
 }
class Fish extends Animal{
void swim (){
    System.out.println("swim");
   }
 }
 class Tuna extends Fish{
void swim (){
    System.out.println(" Tuna swim");
   }
 }
class Shark extends Fish{
void swim (){
    System.out.println(" Shark swim");
   }
 }
 class Mammal extends Animal{
void walk (){
    System.out.println(" Mammal walk");
   }
 }
 class Dog extends Mammal{
void walk (){
    System.out.println(" Dog walk");
   }
 }
 class Cat extends Mammal{
void walk (){
    System.out.println(" Cat walk");
   }
 }
 class Human extends Mammal{
void walk (){
    System.out.println(" Human walk");
   }
 }

public class J04_Hibrid {
    public static void main(String args[]) {
        Mammal m = new Mammal();
        m.eat();
        m.walk();
        Fish f = new Fish();
        f.swim();
        f.eat();
        Birds b =new Birds();
        b.sleep();
        b.eat();
        b.fly();
    }
}
