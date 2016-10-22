package ewww;
public class Ewww {
    public static void main(String[] args) {
        float num = (float) 572.75;
        System.out.println("Tens: " + (int)(num/10));
        num = num%10;
        System.out.println("Fives: " + (int)(num/5));
        num = num%5;
        System.out.println("Ones: " + (int)(num/1));
        num = num%1;
        System.out.println("Cents: " + (int)(num/.25));
    }
}
