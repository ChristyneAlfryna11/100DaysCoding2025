
import java.util.Scanner;
public class Day67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan angka: ");
        int n =input.nextInt();
        System.out.println("POLA HORIZONTAL");
        for (int i = 1; i <= n; i++) {
            System.out.print("**");
        }
        System.out.println();
       
    }
     
}
