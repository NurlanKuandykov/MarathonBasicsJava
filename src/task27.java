import java.util.Scanner;

class MyClass27{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = 0;
        while (a<=b){
            if (a%3==0 && a%5!=0){
                r += 1;
            }
            ++a;
        }
        System.out.println(r);
    }
}