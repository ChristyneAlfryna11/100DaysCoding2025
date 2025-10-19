import java.util.Scanner;
public class Day42 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Nama karyawan: ");
        String nk = input.nextLine();
        
        System.out.print("Gaji pokok: ");
        int gp = input.nextInt();
        System.out.print("Potongan pajak: ");
        int pp = input.nextInt();
        
        int a = gp - pp;
        System.out.println("=====================");
        System.out.println("Nama karyawan: " + nk);
        System.out.println("Gaji kotor: " + gp);
        System.out.println("Gaji bersih: " + a);
    }
    
}
