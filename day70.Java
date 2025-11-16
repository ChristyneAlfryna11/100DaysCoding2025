import java.util.Scanner;
public class Day70 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan kolom: ");
        int kolom = input.nextInt();
        
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
