public class Day76 {
    public static void main(String[] args) {
        
        
        String kalimat = "Haloo Dunia";
        
        System.out.println("apakah sama dengan 'Haloo Dunia'? " + kalimat.equals("Haloo Dunia"));
        System.out.println("apakah sama dengan 'haloo dunia' (tanpa peduli case)? " + kalimat.equalsIgnoreCase("haloo dunia"));
        System.out.println("apakah mengandung kata 'Dunia'? " + kalimat.contains("Dunia"));
        System.out.println("apakah string kosong? " + kalimat.isEmpty());
        
        //contoh dengan string kosong
        String kosong = "";
        System.out.println("\nApakah String kosong? " + kosong.isEmpty());
    }
    
}
