import java.util.Scanner;

class MyClass33{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        int c = 1;
        while (a<b){
            a += a/10;
            ++c;
        }
        System.out.println(c);
    }
}