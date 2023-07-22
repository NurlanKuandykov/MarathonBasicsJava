import java.util.Scanner;

class MyClass24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = 1;
        int res1 = 1;
        while (res <= x) {
            System.out.println(res);
            res1++;
            res = res1 * res1;
        }
    }
}