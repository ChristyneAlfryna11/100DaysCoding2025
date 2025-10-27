package pkg9daysofcoding;
public class Main {
    public static void main(String[] args) {
        // DEKLARASI 
        String Nama; 
        int tinggiBadan;        
        float beratBadan;
        
        // INISIALISASI 
        Nama = "Christyne alfryna vernanda";
        tinggiBadan = 155;        
        beratBadan= 47.0f;
                
        System.out.println("Nama : " + Nama);
        System.out.println("tinggiBadan : " + tinggiBadan + " cm");
        System.out.println("beratBadan : " + beratBadan + " kg");
        
        // UPDATE VARIABEL
        Nama = "titinn";
        tinggiBadan = 156;
        beratBadan = 47.1f;
        
        System.out.println("\nsetelah update variable");
        System.out.println("Nama : " + Nama);
        System.out.println("tinggiBadan : " +tinggiBadan+ " cm");
        System.out.println("beratBadan : " + beratBadan + " kg");
    
    }
    
}
