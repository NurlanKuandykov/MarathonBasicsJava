import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double res = a / b;
        if (b != 0){
            System.out.println(res);
        }else{
            System.out.println("Error");
        }
    }
}