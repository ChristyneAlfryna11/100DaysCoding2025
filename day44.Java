package christyne;
import java.util.Scanner;
public class day44 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int a = in.nextInt();

        if (a >= 85 && a <= 100) {
            System.out.println("Predikat A");
              
        } else if (a >= 75 && a <= 85) {
            System.out.println("Predikat B");
              
        } else if (a >= 60 && a <= 75) {
            System.out.println("Predikat C");
              
        } else if (a >= 40 && a <= 60) {
            System.out.println("Predikat D");
              
        } else if (a >= 0 && a <= 40) {
            System.out.println("Predikat E");
              
        } else {
            System.out.println("Nilai Yang anda masukkan tidak valid");

        }

    }

}
