import java.util.Scanner;
public class Day28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan a: ");
        int a = input.nextInt();
        System.out.print("masukkan b: ");
        int b = input.nextInt();
        
        System.out.println(a == b ); //true
        System.out.println(a != b ); //false
    }
}
