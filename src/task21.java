import java.util.Scanner;

class MyClass21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int t1 = t % 10;
        if (t1 == 1 && t != 11){
            System.out.println(t + " корова");
        }else{
            if (t1 >= 2 && t1 <= 4 && t / 10 != 1){
                System.out.println(t + " коровы");
            }else{
                System.out.println(t + " коров");
            }
        }
    }
}