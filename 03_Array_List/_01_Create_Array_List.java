import java.util.ArrayList;
import java.util.Scanner;
public class _01_Create_Array_List{
public static void main(String args[]){
ArrayList<Integer>list = new ArrayList<>();
Scanner sc = new Scanner(System.in);

// // Simple type add a new element
// list.add(1);
// list.add(2);
// list.add(3);
// list.add(4);

// // Print Array_List directiy
// System.out.println(list);

// Type Second add a new element
 for(int i=0; i<list.size(); i++){
     list.add(sc.nextInt());
 }
 // Print Array_List with for loop
 for(int i=0; i<list.size(); i++){
     System.out.print(list.get(i));
 }
   

}
}