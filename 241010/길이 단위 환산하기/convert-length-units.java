import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        double ft = 30.48;
        double a = sc.nextDouble();
        System.out.printf("%.1f",a*ft);
    }
}