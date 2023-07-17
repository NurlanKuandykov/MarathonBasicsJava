import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int res_time = (h * 60 + m) * 60;
        if (res_time < x){
            System.out.println("Опоздал");
        }else{
            System.out.println("Успел");
        }
    }
}