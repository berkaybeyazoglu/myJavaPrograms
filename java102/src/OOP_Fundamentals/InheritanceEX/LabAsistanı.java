package OOP_Fundamentals.InheritanceEX;

public class LabAsistanı extends Asistan{
    public LabAsistanı(String adSoyad, String telefon, String eposta, String unvan, String bolum, String ofisSaati) {
        super(adSoyad, telefon, eposta, unvan, bolum, ofisSaati);
    }

    public void lablaraGir(){
        System.out.println(this.getAdSoyad() + " tarafından lab asistanlığı yapılmıştır!");
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
    @Override
    public void derseGir(){
        System.out.println(this.getAdSoyad() + " akedemisyeni derse girdi! ");
    }
}
