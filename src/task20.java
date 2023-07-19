import java.util.Scanner;

class MyClass20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int a1 = Math.abs(a-c);
        int b1 = Math.abs(b-d);
        System.out.println((a1==b1) || (a == c) || (b == d) ? "YES":"NO");
    }
}