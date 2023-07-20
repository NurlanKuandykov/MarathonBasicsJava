import java.util.Scanner;

class MyClass22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // сколько умещается в сковороде
        int m = sc.nextInt(); // время обжарки с одной стороны
        int n = sc.nextInt(); // всего котлет надо пожарить
        if (n <= k){
            System.out.println(m * 2);
        }else{
            if (n * 2 % k == 0){
                int x = n * 2 / k * m;
                System.out.println(x);
            }else{
                System.out.println(n * 2 / k * m + m);
            }
        }
    }
}