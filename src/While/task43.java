package While;

import java.util.Scanner;

class MyClass43{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        String s = "*";
        while (a<=n){
            System.out.println(s);
            a++;
            s+="*";
        }
    }
}
