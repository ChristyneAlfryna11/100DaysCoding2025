public class Day25 {
    public static void main(String[] args) {
   
        int x = 5;
        
        System.out.println("=== Increment (penambahan) ===");
        System.out.println("Nilai awal x = " + x);
        System.out.println("Pre-increment (++x) = " + (++x)); // tambah dulu, lalu tampil
        System.out.println("\nPost-increment (x++) = " + (x++)); // tampil dulu, lalu tambah
        System.out.println("Nilai akhir x = " + x);
        
       
        int y = 5;
        
        System.out.println("\n=== Decrement (pengurangan) ===");
        System.out.println("Nilai awal y = " + y);
        System.out.println("Pre-decrement (--y) = " + (--y)); // kurang dulu, lalu tampil
        System.out.println("\nPost-decrement (y--) = " + (y--)); // tampil dulu, lalu kurang
        System.out.println("Nilai akhir y = " + y);   
    }
    
}
