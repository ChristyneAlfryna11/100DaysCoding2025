import java.util.Scanner;
public class Day47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===OKTOBER 2025===");
        System.out.print("Masukkan tanggal: ");
        int tanggal = input.nextInt();
        
        switch (tanggal){
            case 6,13,20,27:
                System.out.println("Senin oktober 2025");
                break;
            case 7,14,21,28:
                System.out.println("Selasa oktober 2025");
                break;
            case 1,8,15,22,29:
                System.out.println("Rabu oktober 2025");
                break;
            case 2,9,16,23,30:
                System.out.println("Kamis oktober 2025");
                break;
            case 3,10,17,24,31:
                System.out.println("Jumat oktober 2025");
                break;
            case 11,18,25,4:
                System.out.println("Sabtu oktober 2025");
            case 12,19,26,5:
                System.out.println("Minggu oktober 2025");
                break;
            default:
                System.out.println("tanggal tidak valid");

            }
        }
        
    }
    

