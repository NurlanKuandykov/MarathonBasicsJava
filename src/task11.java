import java.util.Scanner;
import java.lang.Math;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int min = Math.min(M, N);
        int max = Math.max(M, N);
        int a = max - y;
        int b = min - x;
        if (x < a && x < y && x < b) {
            System.out.print(x);
        } else if (y < x && y < a && y < b) {
            System.out.print(y);
        } else if (a < x && a < y && a < b)
            System.out.print(a);
        else {
            System.out.print(b);
        }
    }
}