import java.util.Scanner;

public class KategoriUsia14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan usia Anda: ");
        int usia = scanner.nextInt();

      
        if (usia < 0) {
            System.out.println("Usia tidak boleh negatif.");
        } else {
            if (usia <= 12) {
                System.out.println("Anda termasuk kategori Anak.");
            } else if (usia <= 19) {
                System.out.println("Anda termasuk kategori Remaja.");
            } else if (usia <= 64) {
                System.out.println("Anda termasuk kategori Dewasa.");
            } else {
                System.out.println("Anda termasuk kategori Lansia.");
            }
        }
    }
}