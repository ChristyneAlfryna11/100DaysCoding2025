package pkg14daysofcoding;
public class Main {
    public static void main(String[] args) {
        // Data awal dalam bentuk String
        String nama = "CHRISTYNE ALFRYNA VERNANDA";
        String usia = "18";
        String tempatLahir = "MAJENE";
        String bulanlahir = "4";
        String tanggallahir = "11";
        String nomorwa = "085825269465";
        String tinggiBadan = "155";
        String beratBadan = "45.5";
        String jeniskelamin = "p";
        String status = "true"; 

        // Konversi String ke tipe data primitif
        byte umur = Byte.parseByte(usia);
        short bl = Short.parseShort(bulanlahir);
        int tglLahir = Integer.parseInt(tanggallahir);
        long nomor = Long.parseLong(nomorwa);
        int tb = Integer.parseInt(tinggiBadan);
        float bb = Float.parseFloat(beratBadan);
        char jk = jeniskelamin.charAt(0);
        boolean lulus = Boolean.parseBoolean(status);

        // Output Biodata
        System.out.println("==== BIODATA MAHASISWA ====");
        System.out.println("NAMA               : " + nama);
        System.out.println("UMUR               : " + umur + " TAHUN");
        System.out.println("TEMPAT LAHIR       : " + tempatLahir);
        System.out.println("BULAN LAHIR        : " + bl + " (APRIL)");
        System.out.println("TANGGAL LAHIR      : " + tglLahir);
        System.out.println("NOMOR WHATSAPP     : " + nomor);
        System.out.println("TINGGI BADAN       : " + tb + " cm");
        System.out.println("BERAT BADAN        : " + bb + " kg");
        System.out.println("JENIS KELAMIN      : " + jk);
        System.out.println("STATUS KELULUSAN   : " + lulus);
        System.out.println("===========================");
    

    }
    
}
