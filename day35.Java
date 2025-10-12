import java.util.Scanner;
public class Day35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        System.out.print("nilai kehadiran: ");
        a = input.nextInt();
        System.out.print("nilai tugas: ");
        b = input.nextInt();
        System.out.print("nilai ujian akhir: ");
        c = input.nextInt();

        double d = (a * 0.2) + (b * 0.35) + (c * 0.45);

        if (d >= 90) {
            System.out.println("\nNilai akhir: " + d);
            System.out.println("kategori A");
        } else if (d >= 80 && d <= 89) {
            System.out.println("Nilai akhir: " + d);
            System.out.println("kategori B");
        }else if (d >= 70 && d <= 79) {
             System.out.println("Nilai akhir: " + d);
            System.out.println("kategori C");
        }else if (d >= 60 && d <= 69) {
             System.out.println("Nilai akhir: " + d);
            System.out.println("kategori D");
        }else{
             System.out.println("Nilai akhir: " + d);
            System.out.println("kategori E");
            
        }
            
        }
        


    }
