package christyne;
import java.util.Scanner;
public class Christyne {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan sisi: ");
        int sisi = input.nextInt();
        int luas = sisi*sisi;
      
        System.out.println("luas = " + luas);
    }
    
}
