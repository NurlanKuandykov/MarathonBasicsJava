import java.util.Scanner;

class MyClass34{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 0;
        while (N>0){
            res += N%10;
            N = N/10;
        }
        System.out.println(res);
    }
}