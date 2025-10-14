package christyne;
import java.util.Scanner;
public class Christyne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan a: ");
        int a = input.nextInt();
        
        if (a % 2==0){
            System.out.println(a + " Genap");
        }else{
            System.out.println(a + " Ganjil");
        }
    }
    
}
