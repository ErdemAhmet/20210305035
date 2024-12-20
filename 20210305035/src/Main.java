import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KitapYonetimSistemi sistem = new KitapYonetimSistemi();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Kitap Yönetim Sistemi");
            System.out.println("1. Kitap Ekle");
            System.out.println("2. Kitapları Listele");
            System.out.println("3. Kitap Ara");
            System.out.println("4. Kitap Sil");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1 -> sistem.kitapEkle();
                case 2 -> sistem.kitaplariListele();
                case 3 -> sistem.kitapAra();
                case 4 -> sistem.kitapSil();
                case 0 -> {
                    System.out.println("Çıkış yapılıyor...");
                    return;
                }
                default -> System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }
    }
}
