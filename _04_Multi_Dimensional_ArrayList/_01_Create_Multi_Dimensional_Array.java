import java.util.Scanner;
import java.util.ArrayList;
public class _01_Create_Multi_Dimensional_Array{
 // type 1 Create_Multi_Dimensional_ArrayList
public static void main(String args[]) { 
// ArrayList<ArrayList<Integer>>mainlist = new ArrayList<>();
// ArrayList<Integer> list1 = new ArrayList<>();
// list1.add(1); list1.add(5);
// mainlist.add(list1);
// ArrayList<Integer> list2 = new ArrayList<>();
// list2.add(1); list2.add(4);
// mainlist.add(list2);
// //System.out.println(mainlist);

   //  take the list and store in currlist

// for(int i=0; i<mainlist.size();i++){
//     ArrayList<Integer> currlist = mainlist.get(i);
    // Print the element of currlist

//  for(int j=0; j<currlist.size();j++){
//   System.out.print(currlist.get(j)+ " ");
//   }
//    System.out.println();
// }
Scanner sc=new Scanner(System.in);
ArrayList<ArrayList<Integer>>mainlist = new ArrayList<>();
System.out.print( "Enter the value of how many list you creat in 'mainlist' ");
int input=sc.nextInt();
for(int i=0; i<input;i++){
    mainlist.add(new ArrayList<>());
}
 System.out.print( "Enter the value of how many element  you Enter in list of 'mainlist' ");
 int input2 = sc.nextInt();
for(int i=0; i<input;i++){
    for(int j=0; j<input2;j++){
        mainlist.get(i).add(sc.nextInt());
    }
}
for(int i=0; i<mainlist.size();i++){
  ArrayList<Integer> currlist = mainlist.get(i);

// Print the element of currlist

 for(int j=0; j<currlist.size();j++){
  System.out.print(currlist.get(j)+ " ");
  }
   System.out.println();
 }
 // System.out.println(mainlist);
}}