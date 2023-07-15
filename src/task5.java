import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print((h - b - 1) / (a - b) + 1);
    }
}
