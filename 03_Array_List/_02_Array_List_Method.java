
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class _02_Array_List_Method{
public static void main(String args[]){
ArrayList<Integer>list = new ArrayList<>();
ArrayList<Integer>list2 =new ArrayList<>();
Scanner sc = new Scanner(System.in);

// Simple type add a new element
list.add(1);
list.add(2);
list.add(3);
list.add(6);
list.add(12);
list2.add(15);
list2.add(36);
list2.add(58);
list2.add(10);

// Adding element at some index 
list.add(1,100);
System.out.println(list);

// Set element at some index 
list.set(2, 99);
System.out.println(list);

//Get element at some index 
list.get(2);
System.out.println(list);

// Print Array_List directiy
System.out.println(list);

//remove element at some index 
System.out.println(list.remove(4));

// Add all element at some index 
list.addAll(2,list2);
System.out.println(list);

// Removing an element e 
list.remove(Integer.valueOf(7));
System.out.println(list);

System.out.println(list.contains(12));

System.out.println(list.contains(5));

//Sorting
 Collections.sort(list);
 // Sorting in descending Order
 Collections.sort(list,Collections.reverseOrder());



}
}