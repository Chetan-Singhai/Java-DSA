package _07_Array;

public class A_01_Sub_Array_Sum {

    public static void maxSubArraySum(int arr[] ){
    int maxSum=0;
    int currSum;
    int start;
    int end;
    int ts=0;
    for(int i=0; i< arr.length; i++){
         start=i;
        for(int j=i; j < arr.length; j++){
             end = j;
             currSum=0;
            for(int k=start; k < end;k++ ){
                System.out.print(arr[k]);
                currSum = currSum + arr[k];
                   
            }
                 ts++;
             System.out.println("=" + currSum );
             if(maxSum < currSum){
                maxSum =currSum;
             }
        }
        

    }
    System.out.println(maxSum);
    System.out.println(ts);
}
public static void main (String args []){
    int arr[]={1,2,3,4,5,6};
     maxSubArraySum(arr);
}
}