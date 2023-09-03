package _08_Sorting;

import java.util.Arrays;

public class S_01_Bubble_Sort {
public static int [] bubble_Sort( int arr[]){
    for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i]<arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    
    }
     return arr;
    
}
   public static void main(String[] args) {
        int arr[] = {3,5,8,4,9,5};
        int sort_Array[] = bubble_Sort(arr) ;  
        System.out.println(Arrays.toString(sort_Array));
}
}