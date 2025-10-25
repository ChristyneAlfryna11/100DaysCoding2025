import java.util.Scanner;
public class Day48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double angka1, angka2, hasil;
        char operator;
        
        System.out.println("===KALKULATOR SEDERHANA===");
        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();
        
        System.out.print("Masukkan operator (+, -, /, *): ");
        operator = input.next().charAt(0);
        
        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();
        
        switch (operator){
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil penjumlahan: " + hasil);
                break;
             
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil pengurangan: " + hasil);
                break;
                
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil perkalian: " + hasil);
                break;
                
           case '/':
                hasil = angka1 / angka2;
                System.out.println("Hasil pembagian: " + hasil);
                break;
                
           default:
               System.out.println("erorr");
               break;
                
                
        }
        
        
    }
    
}
