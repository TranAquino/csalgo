package Activities;

import java.util.Scanner;

public class Karatsuba {
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter four digit number(X)");
        String x = scan.nextLine();
        System.out.println("Enter four digit number(Y)");
        String y = scan.nextLine();
        
        int a = Integer.parseInt(x.substring(0,2));
        int b = Integer.parseInt(x.substring(2, 4));
        int c = Integer.parseInt(y.substring(0, 2));
        int d = Integer.parseInt(y.substring(2, 4));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        int ac= a*c;
        int ad= a*d;
        int bc= b*c;
        int bd= b*d;
        System.out.println(ac + " "+ ad+ " "+ bc +" "+bd);
        int xy = (ac*10000) + ((ad + bc)*(100)) + bd ;
        System.out.println(xy);
        
    }
}
