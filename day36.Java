import java.util.Scanner;
public class Day36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan nilai ujian (0-100): ");
          int nilai = input.nextInt();
          
          if (nilai >= 0 && nilai <= 100) {
              if (nilai >= 80) {
                  System.out.println("kategori A (sangat baik) ");
                  
              }else if (nilai >= 60){
                  System.out.println("kategori B (baik)");
              }else if (nilai >= 40) {
                  System.out.println("kategori c (cukup)");
                  
              }else{
                  System.out.println("kategori D (kurang)");
              }
            
        }else{ 
              System.out.println("nilai tidak valid");
          }
    }
    
}
