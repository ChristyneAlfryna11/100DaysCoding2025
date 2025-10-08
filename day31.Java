import java.util.Scanner;
public class Day31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan umur: ");
        int umur = input.nextInt();
        System.out.print("masukkan nilai: ");
        int nilai = input.nextInt();
        
        if (umur >= 18 && nilai >= 70){
            System.out.println("lulus dan cukup umur");
        }else{
            System.out.println("tidak memenuhi syarat");
        }
    }
    
}
