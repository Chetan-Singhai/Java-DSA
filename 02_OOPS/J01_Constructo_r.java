import java.util.Scanner;
   class Student
   {
        String name;
        int rollNum;
        String passward;
        int marks[];
        //  shallow copy constructor
       /*  Student(Student s1){
           marks=new int[3]
            this.name=s1.name;
            this.rollNum=s1.rollNum;
            this.marks=s1.marks;
         }
         */
        // deep copy constructor
         Student(Student s1){
            marks = new int[3];
            this.name=s1.name;
            this.rollNum=s1.rollNum;
            for(int i=0; i<3; i++){
                this.marks[i] = s1.marks[i];
            }
         }

        Student(){
            marks = new int[3];
             System.out.println("Student");
            }
        Student(String name){
             marks = new int[3];
                this.name=name;
             
            } 
        Student(int rollNum){
             marks = new int[3];
             this.rollNum=rollNum;
            }
             
        }
public class J01_Constructo_r {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        Student s1 =  new Student(); 
        s1.name = "chetan";
        s1.rollNum = 12;
        s1.passward = "abc"; 
        s1.marks[0]=100;
        s1.marks[1]=100;
        s1.marks[2]=100;
       Student s2 =new Student(s1);
        s2.passward="xyz";
        // shallow copy mai marks ki value copy karne ke bad bhi change ho jati hai but deep copy mai isha nahi hota
        s1.marks[2]=80;
        for(int i=0; i<3; i++){
         System.out.println(s2.marks[i]) ;
        }
        System.out.println(s2.name + " " + s2.rollNum + " " + s2.passward);

    }
    
     
    }

    
     
    