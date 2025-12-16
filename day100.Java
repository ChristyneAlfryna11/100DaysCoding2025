import java.util.*;

public class Day100 {

    static int[] newArr;
    static int n;

    static int retas(int[] arr) {
        n = arr.length;
        newArr = new int[n];
        Arrays.fill(newArr, Integer.MIN_VALUE);

        int totalShift = 0;

        for (int x : arr) {
            int idx = x % n;
            int shift = 0;

            while (newArr[idx] != Integer.MIN_VALUE) {
                idx = (idx + 1) % n;
                shift++;
            }

            newArr[idx] = x;
            totalShift += shift;
        }

        return totalShift;
    }

    static String susunKode(int p) {
        int len = newArr[p % n];
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (sb.length() < len) {
            sb.append(newArr[i % n]);
            i++;
        }

        return sb.substring(0, len);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int nInput = sc.nextInt();

        int[] arr = new int[nInput];
        System.out.print("Masukkan elemen array: ");
        for (int i = 0; i < nInput; i++) {
            arr[i] = sc.nextInt();
        }

        int p = retas(arr);
        String result = susunKode(p);

        System.out.println("Hasil kode sandi: " + result);
    }
}
