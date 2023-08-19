/*
*
**
***
****
*****
****
***
**
*
 */
import java.util.Scanner;
public class _08_pattern{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int j;
     int i;
     int num = sc.nextInt();
     for( i=1; i<2*num; i++ ){
        int star=(i<num)? i :2*num-i;
        for( j=1; j<=star;j++){
        System.out.print("*");
        }
        
     System.out.println();
}
    }}