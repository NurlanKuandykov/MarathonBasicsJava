package For;
import java.util.Scanner;

public class task46 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s=0;
        for (int a = sc.nextInt(); true; a=sc.nextInt()){
            if (a % 7 == 0){
                break;
            }
            if (a % 10 == 7){
                s+=a;
            }
        }
        System.out.println(s);
    }
}
