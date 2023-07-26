package While;

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 0;
        while (a>0){
            int b = sc.nextInt();
            if (b % 2 == 0){
                ++x;
            }
            --a;
        }
        System.out.println(x);
    }
}