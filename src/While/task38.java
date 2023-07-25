package While;

import java.util.Scanner;

class MyClass38{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b){
            while (a>=b){
                System.out.println(a);
                --a;
            }
        }else{
            while (a<=b){
                System.out.println(a);
                ++a;
            }
        }
    }
}