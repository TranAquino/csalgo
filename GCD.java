/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ewww;

import java.util.Scanner;

/**
 *
 * @author braquino
 */
public class GCD {
        public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number to be added to 1.");
        System.out.print("Number: ");
        int num = input.nextInt();
        System.out.println("Sum is: "+sum(num));
               
    }
    
    public static int sum(int x){
      if (x == 1)
        return 1;
      else
        return x + sum(x-1);
    }
}
