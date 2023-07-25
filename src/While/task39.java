package While;

import java.util.Scanner;

class MyClass39{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int x = k;
        while (x<=n){
            if (x % k == 0){
                System.out.println(x);
            }
            x++;
        }
    }
}