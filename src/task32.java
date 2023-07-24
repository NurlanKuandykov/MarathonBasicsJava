import java.util.Scanner;

class MyClass32{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 1;
        int c1 = 0;
        while (b<=n){
            int c = b * b;
            c1 += c;
            ++b;
        }
        System.out.println(c1);
    }
}