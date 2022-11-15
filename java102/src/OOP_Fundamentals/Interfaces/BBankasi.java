package OOP_Fundamentals.Interfaces;

public class BBankasi implements IBank{
    private String bankaAdi;
    private String terminalId;
    private String password;

    public BBankasi(String bankaAdi, String terminalId, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalId = terminalId;
        this.password = password;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipadr){
        System.out.println("kullanıcı ip: " + ipadr);
        System.out.println("Makine ip: " + this.hostIpAddress);
        System.out.println(this.getBankaAdi()+ " bağlantı gerçeklersti!");

        return true;
    }

    @Override
    public boolean payment(double price ,String cardNumber, String expireDate, String cvc){
        System.out.println("İşlem başarılı oldu! ");
        return true;
    }
}
