import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KitapYonetimSistemi implements KitapIslemleri {
    private List<Kitap> kitaplar;

    public KitapYonetimSistemi() {
        kitaplar = new ArrayList<>();
    }

    @Override
    public void kitapEkle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kitap İsmi:");
        String isim = scanner.nextLine();

        System.out.println("Yazar İsmi:");
        String yazar = scanner.nextLine();

        System.out.println("Kitap Türü (ör: Roman, Ansiklopedi, vb.):");
        String tur = scanner.nextLine();

        Kitap yeniKitap = new Kitap(isim, yazar, tur);
        kitaplar.add(yeniKitap);

        System.out.println("Kitap başarıyla eklendi!");
    }

    @Override
    public void kitaplariListele() {
        if (kitaplar.isEmpty()) {
            System.out.println("Hiç kitap bulunmamaktadır.");
            return;
        }

        kitaplar.forEach(Kitap::yazdir);
    }

    @Override
    public void kitapAra() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aramak istediğiniz kitabın ismini girin:");
        String aranan = scanner.nextLine();

        List<Kitap> bulunanKitaplar = kitaplar.stream()
                .filter(kitap -> kitap.getIsim().equalsIgnoreCase(aranan))
                .collect(Collectors.toList());

        if (bulunanKitaplar.isEmpty()) {
            System.out.println("Aradığınız kitap bulunamadı.");
        } else {
            bulunanKitaplar.forEach(Kitap::yazdir);
        }
    }

    @Override
    public void kitapSil() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Silmek istediğiniz kitabın ismini girin:");
        String silinecekIsim = scanner.nextLine();

        boolean silindi = kitaplar.removeIf(kitap -> kitap.getIsim().equalsIgnoreCase(silinecekIsim));

        if (silindi) {
            System.out.println("Kitap başarıyla silindi!");
        } else {
            System.out.println("Silmek istediğiniz kitap bulunamadı.");
        }
    }
}
