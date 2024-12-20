public class Kitap {
    private String isim;
    private String yazar;
    private String tur;

    public Kitap(String isim, String yazar, String tur) {
        this.isim = isim;
        this.yazar = yazar;
        this.tur = tur;
    }

    public String getIsim() {
        return isim;
    }

    public String getYazar() {
        return yazar;
    }

    public String getTur() {
        return tur;
    }

    public void yazdir() {
        System.out.println("Kitap İsmi: " + isim);
        System.out.println("Yazar: " + yazar);
        System.out.println("Tür: " + tur);
    }
}
