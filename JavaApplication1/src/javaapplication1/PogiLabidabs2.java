/* * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates * and open the template in the editor. */ package selectionsort;

import java.util.Scanner;

/**
 * * * @author Trannie
 */
public class PogiLabidabs2 {
// HELLO
    /**
     * * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int[] arr = new int[5];
        for (int x = 0; x < arr.length; x++) {
            arr[x] = a.nextInt();
        }
        int small = 999, count = 0, temp;
        while (count < 5) {
            for (int y = count; y < arr.length; y++) {
                if (arr[y] <= small) {
                    small = arr[y];
                }
            }
            for (int z = count; z < arr.length; z++) {
                if (arr[z] == small) {
                    temp = arr[z];
                    arr[z] = arr[count];
                    arr[count] = temp;
                    for (int k = 0; k < arr.length; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println("");
                }
            }
            count++;
            small = 999;
        }
    }
}
