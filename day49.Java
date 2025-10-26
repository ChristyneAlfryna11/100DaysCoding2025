import java.util.Scanner;
public class Day49 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkkan umur: ");
        int umur = input.nextInt();
        int a = 18;
        String hasil = umur >= a? "Dewasa":"Anak-anak";
        System.out.println("Umur anda: " + umur + " Tahun");
        System.out.println("Anda di nyatakan " + hasil);
                
    }
    
}
