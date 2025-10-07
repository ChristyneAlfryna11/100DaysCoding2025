package christyne;
import java.util.Scanner;
public class Christyne {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan a = ");
        int a = in.nextInt();
        System.out.print("Masukkan b = ");
        int b = in.nextInt();

        System.out.println(a >= b);
        System.out.println(a <= b);

    }

}
