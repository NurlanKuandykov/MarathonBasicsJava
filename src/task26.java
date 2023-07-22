import java.util.Scanner;

class MyClass26{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int c = a++;
        while(a <= b){
            c += a++;
        }
        System.out.print(c);
    }
}