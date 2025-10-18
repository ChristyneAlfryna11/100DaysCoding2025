import java.util.Scanner;
public class Day41_EvaluasiMentor {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         
         System.out.println("===Program Evaluasi Mentor===");
         System.out.print("masukkan nilai teori= ");
         int nilaiTeori = input.nextInt();
         System.out.print("masukkan nilai praktik= ");
         int nilaiPraktik = input.nextInt();
        
         
             System.out.println("==================================");
             System.out.println("Nilai Teori: " + nilaiTeori);
             System.out.println("Nilai Praktik: " + nilaiPraktik);
             
             
         if (nilaiTeori >= 90 && nilaiTeori <= 100 && nilaiPraktik >= 90 && nilaiPraktik <= 100) {
             System.out.println("Predikat: A ");
             System.out.println("Keterangan: Lulus dengan Predikat Baik");
             
        }else if (nilaiTeori >= 80 && nilaiTeori <= 100 && nilaiPraktik >= 75 && nilaiPraktik <= 100 ) {
             System.out.println("Predikat: B");
             System.out.println("Keterangan: Lulus dengan Predikat Baik");
            
        }else if (nilaiTeori >= 70 && nilaiTeori <= 100 && nilaiPraktik >= 70 && nilaiPraktik <= 100){
             System.out.println("Predikat: C");
             System.out.println("Keterangan: Lulus dengan Predikat Cukup");
            
        }else if (nilaiTeori <= 70 && nilaiTeori > 0) {
             System.out.println("Predikat: D");
             System.out.println("Keterangan: Tidak Lulus");
            
        }else{
             System.out.println("Nilai tidak valid! Harus rentang 0-100.");
            
        }
             
             
        } 
    }
