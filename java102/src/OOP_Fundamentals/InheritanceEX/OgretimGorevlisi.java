package OOP_Fundamentals.InheritanceEX;

public class OgretimGorevlisi extends Akademisyen{
    private String kapiNo;

    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String unvan, String bolum, String kapiNo) {
        super(adSoyad, telefon, eposta, unvan, bolum);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    @Override
    public void derseGir(){
        System.out.println(this.getAdSoyad() + " akedemisyeni derse girdi! ");
    }
    @Override
    public void giris() {
        System.out.println(this.getAdSoyad() + " Üniversiteye giriş yaptı!!");
    }

    @Override
    public void cikis() {
        System.out.println(this.getAdSoyad() + " Üniversiteden çıkış yaptı!!");
    }

    @Override
    public void yemekhane() {
        System.out.println(this.getAdSoyad() + " Yemekhaneye giriş yaptı!!");
    }
}
