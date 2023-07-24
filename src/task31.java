import java.util.Scanner;

class MyClass31{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 2; // 2 потому что делитель должен быть отличный от 1, а наименьшее число после 1 это 2.
        while (a % b != 0){
            b++;
        }
        System.out.println(b);
    }
}