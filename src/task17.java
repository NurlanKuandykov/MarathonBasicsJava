import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if ((a == c || a == d) || (b == c || b == d)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}