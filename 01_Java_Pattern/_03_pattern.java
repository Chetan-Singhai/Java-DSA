/* Triangle pattern
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1 
               */
import java.util.Scanner;
public class _03_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        int j;
        for( i=1; i<=num; i++){
           for(j=1; j<=i; j++){
            int c = (i%2!=0 && j%2!=0 || i%2==0 && j%2==0 )? 1:0;
               System.out.print(c);
               
               }
           System.out.println(" ");
}
    }
}