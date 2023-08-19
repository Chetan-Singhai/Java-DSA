/* 
    HOLLOW RHOMBUS
    *****
   *   *
  *   *
 *   *
*****
 */

import java.util.Scanner;
public class _15_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        int j;
        for(  i=1; i<=num; i++){
             System .out.print(" ".repeat(num-i));
           for(  j=1; j<=num; j++){
            if (i==1||j==1||i==num||j==num) {
          System .out.print("*");
           }
            else{
          System .out.print(" ");
            }
         }
          System.out.println();
        
        
    }
}
}

      