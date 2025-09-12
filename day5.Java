package pkg5daysofcoding;
public class Main {
    public static void main(String[] args) {
        //byte: untuk menghemat memori saat menyimpan data kecil, misalnya data dalam array besar
        byte umur = 18;
        
        //short: cocok untuk aplikasi yang membutuhkan data lebih besaar dari byte tapi masih ingin hemat memor
        short tahunLahir = 2007;
        
        //int: tipe data bilangan bulat yang paling sering digunakan secara default
        int jumlahPenduduk = 2800000;
        
        //long: menyimpan angka yang sangat besar (lebih besar dari int)
        long jumlahBintang = 99876543211L;
        
        System.out.println(umur);
        System.out.println(tahunLahir);
        System.out.println(jumlahPenduduk);
        System.out.println(jumlahBintang);
        
    }
    
}
