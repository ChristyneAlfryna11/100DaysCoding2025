import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan (int): ");
        int n = input.nextInt();

        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        System.out.println("Faktorial (int) dari " + n + " = " + hasil);
    }
}
