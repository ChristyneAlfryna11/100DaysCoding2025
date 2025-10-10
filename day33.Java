import java.util.Scanner;
public class Day33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();

        boolean nilai = (angka > 5) && (angka < 20);
        System.out.println(!nilai);
    }
}
