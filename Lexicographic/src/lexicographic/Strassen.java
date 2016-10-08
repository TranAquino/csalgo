package lexicographic;

import java.util.Scanner;

public class Strassen {
    public static void main(String args[]){
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Input for matrix A");
        for (int i = 0; i <2; i++){
            for (int k = 0; k<2;k++){
                a[i][k] = scan.nextInt();
            }
        }
        System.out.println("Input for matrix B");
        for (int i = 0; i <2; i++){
            for (int k = 0; k<2;k++){
                b[i][k] = scan.nextInt();
            }
        }
        int m1= (a[0][0] + a[1][1]) + (b[0][0] +b[1][1]);
        int m2= (a[1][0] + a[1][1]) *b[0][0];
        int m3 = a[0][0] * (b[0][1] - b[1][1]);
        int m4 = a[1][1] * (b[1][0] - b[0][0]);
        int m5 = (a[0][0] + a[0][1]) * b[1][1];
        int m6 = (a[1][0] - a[0][0]) * (b[0][0] + b[0][1]);
        int m7 = (a[0][1] - a[1][1]) *(b[1][0] + b[1][1]);
        
        int c[][] = new int[2][2];
        c[0][0] = (m1 + m4) - (m5 + m7);
        c[0][1] = (m3 + m5);
        c[1][0] = m2 + m4;
        c[1][1] = (m1 + m3) - (m2 +m6);
        
        for (int i = 0; i <2; i++){
            for (int k = 0; k<2;k++){
                System.out.println("c["+ i +"]" + "[" +k +"] " + c[i][k]);
            }
        }
    }
}
