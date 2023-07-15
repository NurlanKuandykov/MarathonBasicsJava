import java.util.Scanner;

class MyClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n % 2;
        int n2 = n - n1 + 2;
        System.out.println(n2);
    }
}
