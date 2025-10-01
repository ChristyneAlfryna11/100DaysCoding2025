import java.util.Scanner;
public class Day24 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final double phi = 3.14;
        double luas, keliling, r;
        System.out.print("Masukkan jari-jari: ");
        r = input.nextDouble();
        
        luas = phi * r * r;
        System.out.println("luas lingkaran: " + luas);
        
        
    }
    
}
