/*  
 *****
  *****
   *****
    *****
     *****
*/

import java.util.Scanner;
public class _14_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for( int i=1; i<=num; i++){
           
          System.out.print(" ".repeat(i));
          System .out.print("*".repeat(num));
          System.out.println();
        }
        
    }
}