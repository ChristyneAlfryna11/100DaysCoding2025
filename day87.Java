
import java.util.Scanner;
public class Day87 {
    public static void main(String[] args) {
        
        String [] buah = {"Apel", "jambu", "anggur", "pisang"};
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama buah: ");
        String namaBuah = input.nextLine().toLowerCase();
        
        boolean tersedia = false;
        
        for (String b : buah) {
            if (b.equalsIgnoreCase(namaBuah)) {
                tersedia = true;
                break;
                
            }
        }
           if (tersedia) {
               System.out.println("Buah tersedia");
        }else{
               System.out.println("Buah tidak tersedia");
           }
    }
    
}
