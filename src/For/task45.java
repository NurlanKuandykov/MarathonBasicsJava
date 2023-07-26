package For;
import java.util.Scanner;

public class task45 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = "Введите 2 целых числа. Первое число должно быть меньше второго введенного числа.";
        int s = 0;
        for (int a = sc.nextInt(), b = sc.nextInt(); a<=b; a++){
            s+=a;
        }
        System.out.println(s);
    }
}
