/*
A
BC
DEF
GHIJ
 */
import java.util.Scanner;
public class _02_pattern{

    public static void main(String args[]){
        char alp = 'A';
        for( int i=1; i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(alp);
                alp++;
            }
            
            System.out.println();
        }
    }
}