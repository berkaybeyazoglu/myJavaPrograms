package OOP_Fundamentals.InheritanceEX;

public class BilgiIslem extends Memur{
    private String gorev;

    public BilgiIslem(String adSoyad, String telefon, String eposta, String departman, String mesai, String gorev) {
        super(adSoyad, telefon, eposta, departman, mesai);
        this.gorev = gorev;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void networkKurulum(){
        System.out.println(this.getAdSoyad() + " Tarafından kurulum yapılmıştır!");
    }

    @Override
    public void calis(){
        System.out.println(this.getAdSoyad() + " memuru çalışmaktadır!");
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
