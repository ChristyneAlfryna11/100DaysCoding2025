
import java.util.Scanner;
public class Day73 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        
        int total = 0;
        
        while(true){
            System.out.print("masukkan angka (posotif): ");
            int angka = l.nextInt();
            total += angka;
            
            if (angka < 0) {
                System.out.println("Angka negatif!! program berhenti");
                System.out.println("Total: " + total);
                break;
                
                
            }
        }
    }
    
}
