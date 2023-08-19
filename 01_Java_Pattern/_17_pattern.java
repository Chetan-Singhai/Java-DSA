 /* 
     PALINDROMIC Pattern with Numbers pattern 
    1
   212
  32123
 4321234
543212345
           */
import java.util.Scanner;
public class _17_pattern{
     static int Reverse (int num){
        int rev=0;
           while(num > 0){
            int last_num = num % 10;
             rev = rev*10+last_num;
             num=num/10;
       }
       return(rev);
           

    }
    public static void main(String args[]){
        int i;
        int j;
    
       Scanner sc = new Scanner(System.in);
        int value=sc.nextInt();
       for( i=1; i<=value;i++){
            System.out.print(" ".repeat(value-i));
            for( j=i;j>=2;j--){
                System.out.print(j);
            }
            for(j=1;j<=i;j++){
                System.out.print(j);

            }
            System.out.println();
        }
        }
    }

