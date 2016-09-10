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
public class Bruteforce {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word random string");
        String random = scan.nextLine();
        System.out.println("Enter string to search");
        String search = scan.nextLine();
        char rand[]= random.toCharArray();
        char search1[]= search.toCharArray();
        int count = 0;
        for (int x = 0; x<rand.length;x++){
            for(int y = 0; y<search1.length;y++){
                if (rand[y]==search1[x]){
                    for (int z = x; z<search1.length;z++){
                        if(rand[z]==search1[z]){
                            count++;
                        }
                    }
                }
            }
        }
        if (count == search1.length){
            System.out.println("found");
        }
        System.out.println(count);
    }
}
