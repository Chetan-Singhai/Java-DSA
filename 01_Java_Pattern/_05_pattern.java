 /*
 
12345
1234
123
12
1 
    */
 import java.util.Scanner;
 public class _05_pattern {
    
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        //int numb=1;
        for(int line=n; line>=1; line--)
      // for(int line=1; line<=n; line++)yah bhi kar sakte hai
        {
           for ( int num=1; num<=line; num++)
         // for ( int num=1; num<=(n-line+1); num++)yah bhi kar sakte hai
            {
                System.out.print(num);
            
            }
            System.out.println();
        }
    }
}

