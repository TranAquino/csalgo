/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ewww;

/**
 *
 * @author braquino
 */
public class FibonacciWithMemo {
    public static long fibArray[] = new long[31];
    public static long fibonacci(long n) {
        long fibValue = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (fibArray[(int) n] != 0) {
            return fibArray[(int) n];
        } else {
            fibValue = fibonacci(n - 1) + fibonacci(n - 2);
            fibArray[(int) n] = fibValue;
            return fibValue;
        }
    }

    public static void main(String args[]) {
        fibArray[0] = 1;
        fibArray[1] = 1;
        long before = System.currentTimeMillis();
        System.out.println("30th Fib: " + fibonacci(30));
        long after = System.currentTimeMillis();
        System.out.println("Time taken(ms): " + (after - before));
    }
}

