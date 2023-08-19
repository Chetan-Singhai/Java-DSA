import java.util.Scanner;

 class Animal{
    String color;
    int leg;
   void display(){
        System.out.println(color);
   }
   void sleep(){
        System.out.println("sleep");
   }
   void eat(){
        System.out.println("eat");
   }
   void walk(){
    System.out.println("walk");
   }
   
 }
 class Birds extends Animal{
void fly(){
    System.out.println("fly");
   }
 }

public class J02_Single_level_inheritance {
    public static void main(String args[]){
        Birds b=new Birds();
        b.eat();
        b.fly();
        b.color="black";
        b.display();
    }
    
}
