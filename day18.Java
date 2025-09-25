import java.util.Scanner;
public class Day18Coding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //konversi otomatis= tipe data kecil ke besar
        int a = input.nextInt();
        long b = a;
        System.out.println(b);
        
        byte f = input.nextByte();
        short e = f;
        System.out.printf("hasil konversi  %.2f " , e );
            
        float c = 10.2f;
        double d = c;
        System.out.printf("Hasil konversi  %.2f " , d);

       

    }

}
