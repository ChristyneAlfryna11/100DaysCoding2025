import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int a = input.nextInt();
        
        if (a % 3==0 && a % 5==0) {
            System.out.println("Angka adalah kelipatan 3 dan 5");
        }else if (a % 3==0) {
            System.out.println("Angka adalah kelipatan 3");
        }else if (a % 5==0) {
            System.out.println("Angka adalah kelipatan 5");
        }else{ 
            System.out.println("Angka tersebut bukan kelipatan 3 dan 5");
        }
        
    }
    
}
