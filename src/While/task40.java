package While;

import java.util.Scanner;

class MyClass40{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        while (a!=0){
            a=sc.nextInt();
            ++b;
        }
        System.out.println(b);
    }
}