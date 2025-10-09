import java.util.Scanner;
public class Day32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan angka1: ");
         int angka1 = input.nextInt();
         System.out.print("masukkan angka2: ");
         int angka2 = input.nextInt();
      
         if (angka1 > 50 || angka2 > 50){
             System.out.println("salah satu atau kedua angka lebih besar dari 50");
         }else{
             System.out.println("tidak ada angka yang lebih besar dari 50");
         }
        
         
         
    }
    
}
