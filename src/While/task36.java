package While;

import java.util.Scanner;

class MyClass36{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
        int c = 0;
        while (a>0){
            a = sc.nextInt();
            if (a>b){
                ++c;
                b = a;
            }
        }
        System.out.println(c);
    }
}