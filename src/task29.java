import java.util.Scanner;

class MyClass29{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 0;
        while (a != 0){
            if (c<a){
                c = a;
            }
            a = sc.nextInt();
        }
        System.out.println(c);
    }
}