package OOP_Fundamentals.InheritanceEX;

public abstract class Akademisyen extends Calisan {
    private String bolum;
    private String unvan;

    public Akademisyen(String adSoyad, String telefon, String eposta, String unvan, String bolum) {
        super(adSoyad, telefon, eposta);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }


    public abstract void derseGir();
    @Override
    public void giris(){//method overriding (metodu geçersiz kılma)
        System.out.println(this.getAdSoyad()+ " akademisyeni A kapısından giriş yaptı!!");
    }
}
