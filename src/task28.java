import java.util.Scanner;

class MyClass28{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = 0;
        int c = 0;
        while (a != 0){
            c += a;
            a = sc.nextInt();
            b++;
        }
        System.out.println(c/b);
    }
}