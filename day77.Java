import java.util.Scanner;
public class Day77 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat: ");
        String text = l.nextLine();
        
        String trimmed = text.trim();
        String substring = trimmed.substring(0, 5);
        String replace = trimmed.replace("a", "o");
        
        System.out.println("\n=====================");
        System.out.println("Original : [" + text + "]");
        System.out.println("Trimmed  : [" + trimmed + "]");
        System.out.println("Substring: " + substring);
        System.out.println("Replaced : " + replace);
        
                 
    }
    
}
