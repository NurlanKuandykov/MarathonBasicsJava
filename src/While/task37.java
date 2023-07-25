package While;

import java.util.Scanner;

class MyClass37{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = a;
        int max2 = 0;
        while (a !=0){
            int b = sc.nextInt();
            if(max < b){
                max2 = max;
                max = b;
            }
            else if (max2 < b){
                max2 = b;
            }
            a = b;
        }
        System.out.println(max2);
    }
}