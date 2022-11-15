package OOP_Fundamentals.InheritanceEX;

public class Asistan extends Akademisyen{
    private String ofisSaati;

    public Asistan(String adSoyad, String telefon, String eposta, String unvan, String bolum, String ofisSaati) {
        super(adSoyad, telefon, eposta, unvan, bolum);
        this.ofisSaati = ofisSaati;
    }

    public String getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }

    public void quizYap(){
        System.out.println(this.getAdSoyad() + " tarafından quiz yapıldı!");
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
