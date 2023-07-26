package For;
import java.util.Scanner;

public class task47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean is_kube = false;
        for(String s = sc.nextLine(); true; s = sc.nextLine()){
            if(s.equals("СТОП")) break;
            if(s.equals("Куб")) is_kube = true;
        }
        if(is_kube) System.out.println("YES");
        else System.out.println("NO");
    }
}
