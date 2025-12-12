public Day96 {

    public int tambah(int a, int b) {
        return a + b;
    }

    public int kurang(int a, int b) {
        return a - b;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public double bagi(int a, int b) {
        return (double) a / b; 
    }

    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();

        int a = 20;
        int b = 5;

        System.out.println("Penjumlahan: " + k.tambah(a, b));
        System.out.println("Pengurangan: " + k.kurang(a, b));
        System.out.println("Perkalian: " + k.kali(a, b));
        System.out.println("Pembagian: " + k.bagi(a, b));
    }
}
