import java.util.Scanner;

class MyClass24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res0 = 1;
        int res1 = 1;
        while (res0 <= x) {
            System.out.println(res0);
            res1++;
            res0 = res1 * res1;
        }
    }
}