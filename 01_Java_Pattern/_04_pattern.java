import java.util.Scanner;
public class _04_pattern {

    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
       // int num=1;
        for(int line=1; line<=n; line++){
          //  for ( int num=1; num<=line; num++)
          for ( int j=1; j<=line; j++)
          {
                System.out.print(j);
                
            }
            System.out.println();
        }
    }
}

/*enter the value of n
5
1
12
123
1234
12345 */