package soalpemrogramanjavadasar;
import java.util.Scanner ;
//untuk menggunakan Scanner kita harus memanggil atau mingimportnya yang sudah disediakan di library

public class Mentor {
    
    
     public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         /* 
         sesudah kita memanggil Scanner dari library kita harus memasukkan kode seperti diatas 
         kode itu berfungsi agar kita bisa mengetik langsung di tampilan output 
         sehingga memudahkan kita
         */
         
         String nama, prodi;
         System.out.print("nama saya :");
         nama = input.nextLine();
         
         System.out.print("prodi : ");
         prodi = input.nextLine();
         /*
         untuk penggunaan tipe data string kita menggunakan nextLine, kita juga sebenarnya menggunakan next saja 
         tapi bedanya jika kita menggunakan next saja teks yang kita input hanya satu kata 
         sedangkan nextLine bisa lebih dari satu kata 
         */
         System.out.println("haii, nama saya :" + nama + " prodi saya :" + prodi);
         
         /*
         Untuk setiap penggunaan next kita sesuaikan dengan isi atau tipe data yang kita pakai
         dan setiap menggunakan next dan tipe data apa yang dipakai kita harus menggunakan huruf kapital
         */
         
    
}
}
