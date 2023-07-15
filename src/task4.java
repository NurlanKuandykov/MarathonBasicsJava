import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int t = sc.nextInt();
        System.out.println((109 + v * t % 109) % 109);
    }
}
