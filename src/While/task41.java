package While;

import java.util.Scanner;

class MyClass41{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 0;
        while (a!=0){
            x+=a;
            a=sc.nextInt();
        }
        System.out.println(x);
    }
}
