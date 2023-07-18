import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a > 9) && (a < 100)){
            System.out.println(2);
        }else{
            if (a <= 9){
                System.out.println(1);
            }else{
                System.out.println(3);
            }
        }
    }
}