public class Day21 {
    public static void main(String[] args) {
        int a = 14;
        int b = 28;
      
        System.out.println("NILAI SEBELUM DITUKAR");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        
        //PERTUKARAN NILAI MENGGUNAKAN OPERASI ARITMATIKA
        a = a + b; // a sekarang menyimpan jumlah keduanya
        b = a - b; // b jadi nilai awal a
        a = a - b; // a jadi nilai awal b
        
        System.out.println("\nNILAI SETELAH DITUKAR");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        
                
    }
    
}
