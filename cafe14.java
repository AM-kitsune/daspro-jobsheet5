import java.util.Scanner;
public class cafe14 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    String menu;
    char ukuranCup;
    int jumlah;
    boolean keanggotaan;

    System.out.println("Masukan Menu: ");
    menu = sc.nextLine();
    System.out.println("Masukan Ukuran Cup: ");
    ukuranCup = sc.next().charAt(0);
    System.out.println("Masukan jumlah: ");
    jumlah = sc.nextInt();
    System.out.println("Masukan Keanggotaan (true/false): ");
    keanggotaan = sc.nextBoolean();

    double hargaMenu = 0;
    switch (menu.toLowerCase()) {
        case "kopi" :
            hargaMenu = 12000;
            break;
            case "teh" :
            hargaMenu = 7000;
            break;
            case "coklat" :
            hargaMenu = 20000;
            break;
    }
    double totalHarga = hargaMenu * jumlah;

    switch (ukuranCup) {
        case 'S':
            break;
            case 'M':
            totalHarga += 0.25 * totalHarga;
            break;
            case 'L':
            totalHarga += 0.4 * totalHarga;
            break;
        default:
            throw new AssertionError("Ukuran Cup Tidak tersedia");
    }
    double diskon = keanggotaan ? 0 : 0.1;
    double nominalBayar = totalHarga - (diskon * totalHarga);

    System.out.println("item Pembelian " + jumlah + "" + menu + "Dengan Ukuran Cup " + ukuranCup) ;
    System.out.println("Nominal Bayar" + nominalBayar);
}
}
