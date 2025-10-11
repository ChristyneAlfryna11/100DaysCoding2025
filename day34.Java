public class Day34 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai X: ");
        int x = input.nextInt();
        System.out.print("Masukkan nilai Y: ");
        int y = input.nextInt();


        if (x == y && x > 50) {                         
            System.out.println("Nilai sama dan besar!");
        } else if (x == 100 || y == 100) {                
            System.out.println("salah satu nilainya 100.");
        } else if (x != 0 && y != 0) {                   
            System.out.println("Tidak ada angka nol.");
        } else {
            System.out.println("Tidak memenuhi kondisi manapun.");
        }
    }

}
