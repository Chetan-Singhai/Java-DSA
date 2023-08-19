  /*NUMBER PYRAMID pattern
    1 
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5      
  */

import java.util.Scanner;
public class _16_pattern{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int value=sc.nextInt();
        int num = 1;
        for( int i=1; i<=value;i++){
            System.out.print(" ".repeat(value-i));
            for(int j=1;j<=i;j++){
                System.out.print(num +" ");
            }
            num ++;
            
            System.out.println();
        }
    }
}