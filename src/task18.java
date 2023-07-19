import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int a = Math.abs(x1-x2);
        int b = Math.abs(y1-y2);

        String x = a==b? "YES":"NO";

        System.out.println(x);
    }
}