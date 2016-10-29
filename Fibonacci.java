package ewww;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(Fib(number-1));
    }
    public static int Fib(int n){
        if (n < 2)
            return 1;
        return ((Fib(n-1)) + (Fib(n-2)));        
    }
}
