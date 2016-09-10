/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author braquino
 */
public class PogiLabidabs1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        System.out.println(theSum(num));
    }
    public static int theSum(int num){
        if (num == 1){
            return 1;
        }
        else 
            return num + theSum(num-1);
    }


}