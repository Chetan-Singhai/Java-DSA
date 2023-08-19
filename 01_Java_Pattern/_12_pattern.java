/*
    *
   ***
  *****
 *******
*********
 */
import java.util.Scanner;
public class _12_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        int j;
        int space;
        for( i=1; i<=num; i++){
            space=(i<num)? num-i:0;
        for( j=1; j<=space; j++){
            System.out.print( " ");
        }
          for(j=1; j<=i;j++){
              System.out.print("*");
          }
          for(j=1; j<i;j++){
              System.out.print("*");
          }
          space=(i<num)? num-i:0;
        for( j=1; j<=space; j++){
            System.out.print( " ");
               }
           System.out.println();

    }
    }}
