package day13evaluasi;
import java.util.Scanner;
public class Day13Evaluasi {
  
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("=====SELAMAT DATANG DI PROGRAM EVALUASI JAVA=====");
        
        String Nama, Nim, Hobi;
        int Usia = 0;
        float tinggiBadan;
        boolean StatusMahasiswa;
        
        System.out.print("Nama \t: ");
        Nama = input.nextLine();
        System.out.print("Nim \t: ");
        Nim = input.nextLine();
        System.out.print("Hobi \t: ");
        Hobi = input.nextLine();
        System.out.print("tinggiBadan \t: ");
        tinggiBadan = input.nextFloat();
        System.out.print("StatusMahasiswa: ");
        StatusMahasiswa = input.nextBoolean();
        
        int tabungan = 1000000;
        System.out.println("\ntabungan: Rp." + tabungan);
        
        tabungan += 500000;
        System.out.println("tabungan setelah di tambah: Rp." + tabungan);
        
        tabungan -= 200000;
        System.out.println("tabungan setelah di kurang: Rp.:" + tabungan);
        System.out.println("tabungan saat ini: Rp.:" + tabungan);
        
        final double PHI = 3.14159;
        System.out.print("\nmasukkan jari-jari : ");
        float r = input.nextFloat();
        double luas = PHI * r * r;
        System.out.println("luas lingkaran= "+ luas);
        
        System.out.println("\n=====BIODATA MAHASISWA=====");
        System.out.println("Nama lengkap \t: " + Nama);
        System.out.println("Nim \t\t: " + Nim);
        System.out.println("Usia \t\t: " + Usia + " Tahun");
        System.out.println("Tinggi Badan \t: " + tinggiBadan + "Cm");
        System.out.println("Hobi \t\t: " + Hobi);
        System.out.println("Status mahasiswa: " + StatusMahasiswa);
        System.out.println("Tabungan \t: " + tabungan);
        System.out.printf("luas lingkaran :%.2f ", luas);
        
       
    }
    
}
