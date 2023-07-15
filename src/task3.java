import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int a1 = a * n;
        int b1 = (b * n) % 100;
        System.out.println(a1 + (b*n)/100 + " " + b1);
    }
}