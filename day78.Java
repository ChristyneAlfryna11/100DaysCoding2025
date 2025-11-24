
import java.util.Scanner;
public class Day78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();
        
        System.out.println("Lenght: " + kalimat.length());
        System.out.println("Touppercase: " + kalimat.toUpperCase());
        System.out.println("Tolowercase: " + kalimat.toLowerCase());
        System.out.println("Trimed: " + kalimat.trim());
        System.out.println("Substring: " + kalimat.substring(0, 5));
        System.out.println("Replaced: " + kalimat.replace("a", "o"));
        System.out.println("Contain 'a': " + kalimat.contains("a"));
        System.out.println("StartsWith: " + kalimat.startsWith("a"));
        System.out.println("EndsWith 'a': " + kalimat.endsWith("a"));
                 
    }
    
}
