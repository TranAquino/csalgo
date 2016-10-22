
package Activities;

public class Greedy {
    public static void main(String args[]){
        float toProduce = (float) 572.75;
        float remainder= 0;
        int bills10=0, peso5=0, peso1=0,  cents=0;
        if ((toProduce / 10) > 1){
            bills10 = (int) (toProduce/10);
            remainder= toProduce%10;
            System.out.println(remainder + "in 10 peso bill");
        }
        if ((remainder / 5) > 1){
            peso5 = (int) (remainder/5);
            remainder = remainder % 5;
        }
        if ((remainder / 1) > 1){
            peso1 = (int) (remainder/1);
            remainder = remainder % 1;
        }
        if ((remainder / .25) > 1){
            cents = (int) (remainder/.25 );
        }
        System.out.println("10 Peso: " + bills10 + "\n5 Peso: " + peso5+ "\n1 Peso: " + peso1 + "\n25 Cents: " + cents);
    }
}
