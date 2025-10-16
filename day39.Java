import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====MENU WARUNG SOLATA=====");
        System.out.println("1. Bakso Babi -> Rp 20.000 ");
        System.out.println("2. Pangsit Babi -> Rp 25.000 ");
        System.out.println("3. Babi kecap -> Rp 35.000 ");
        System.out.println("4. tidak ada");
        
        System.out.println("======================");
        System.out.print("Pilih menuu 1-4: ");
        
        int pilihanMenu = input.nextInt();
        
        
        if (pilihanMenu == 1) {
            System.out.println("Anda memesan Bakso babi. total bayar: Rp 20.000 ");
            
        }else if (pilihanMenu == 2){
            System.out.println("Anda memesan Pangsit babi. total bayar: Rp  Rp 25.000 ");
        }else if (pilihanMenu == 3){
            System.out.println("Anda memesan Babi kecap. total bayar: Rp 35.000 ");
        }else if (pilihanMenu == 4){
            System.out.println("Terimakasih atas kunjungan anda");
        }else{
            System.out.println("pilihan anda tidak tersedia");
        }
    }
    
}
