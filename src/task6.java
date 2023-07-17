import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        int k = sc.nextInt();
        int n = sc.nextInt();
        int pir = n * x;
        double x1 = (int) x;
        double tea = (x1 * 10) / 1000;
        double tea1 = tea * t;
        int tea2 = (int) tea1;
        int pir1 = pir * k;
        System.out.println(tea2 + pir1);
    }
}
