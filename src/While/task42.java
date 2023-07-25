package While;

import java.util.Scanner;

class MyClass42{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 0;
        int c = 1;
        do{
            int z = sc.nextInt();
            c*=z;
            ++b;
        } while (c<n);

        System.out.println(b + " " + c);
    }
}