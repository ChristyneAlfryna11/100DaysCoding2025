import java.util.Scanner;
public class Day27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int C = input.nextInt();
        
        double fahrenheit = (C*9/5)+32;
        double kelvin = C + 273.15;
        
        System.out.println("fahrenheit: " + fahrenheit);
        System.out.println("kelvin: " + kelvin);
        
                
    }
    
}
