import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan a: ");
        int a = input.nextInt();
        
        if (a > 0) {
            System.out.println( a + " positif");
        }else if (a < 0) {
            System.out.println(a + " negatif");   
        }else{
            System.out.println("Nol");
        }
    }
    
}k
