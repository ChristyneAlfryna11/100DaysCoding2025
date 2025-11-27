import java.util.Scanner;
public class Day81 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [] nilai = {55, 50, 60, 80, 77};
        
        System.out.print("Masukkan indeks: ");
        int i = input.nextInt();
        System.out.println("Nilai pada indeks ke-" + i + " = " + nilai[i]);


    }
    
}
