import java.util.Scanner;
import static java.lang.Math.*;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double a1 = Math.pow(a,2);
        double b1 = Math.pow(b,2);
        double c = a1 + b1;
        System.out.println(Math.sqrt(c));
    }
}