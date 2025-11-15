import java.util.Scanner;
public class Day69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        String username = "admin";
        String password = "12345";
        int percobaan = 3;
        
        for (int i = 1; i <= percobaan; i++) {
            System.out.print("Masukkan username: ");
            username = input.nextLine();
            System.out.print("Masukkan password: ");
            password = input.nextLine();
            
            if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("12345")) {
                System.out.println("Login berhasil! Selamat datang.");
                return;
            }else{
                System.out.println("Login gagal! Coba lagi");
                if (i >= percobaan) {
                    System.out.println("Akses ditolak");
                    
                }   
            }   
        }   
    }
    
}
