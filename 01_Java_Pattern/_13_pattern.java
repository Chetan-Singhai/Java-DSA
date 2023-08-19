/*
    DIAMOND pattern
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
 */

import java.util.Scanner;
public class _13_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        int j;
        int space;
        int star;
        for( i=1; i<=2*num; i++){
            space=(i<num)? num-i:i-num-1;
        for( j=1; j<=space; j++){
            System.out.print( " ");
        }
          star=(i<=num)? i :2*num-i+1;
          for(j=1; j<=star;j++){
              System.out.print("*");
          }
          star=(i<=num)? i :2*num-i+1;
          for(j=1; j<star;j++){
              System.out.print("*");
          }
        space=(i<num)? num-i:i-num-1;
        for( j=1; j<=space; j++){
            System.out.print( " ");
               }
           System.out.println();

    }
    }}
