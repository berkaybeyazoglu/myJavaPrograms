package OOP_Fundamentals.Interfaces;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Tutar Giriniz: ");
        double price = input.nextDouble();
        System.out.println("Kard No Giriniz: ");
        String cardNo = input.next();
        System.out.println("Son Kullanım Tarihi Giriniz: ");
        String expireDate = input.next();
        System.out.println("Güvenlik Kodu Giriniz: ");
        String cvc = input.next();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.println("3. C Bankası");
        System.out.println("Banka Seçiniz");
        int selectBank = input.nextInt();

        switch (selectBank){
            case(1):
                ABankasi aPos = new ABankasi("A bankasi","12312312313","444411122");
                aPos.connect("123.23.0.3");
                aPos.payment(price,cardNo,expireDate,cvc);
                aPos.payment(price,cardNo,expireDate,cvc);
                break;
            case (2):
                BBankasi bPos = new BBankasi("B bankasi","12312313","111111122");
                bPos.connect("111.11.0.0");
                bPos.payment(price,cardNo,expireDate,cvc);
                break;
            default:
                System.out.println("Geçerli banka giriniz!");

        }
    }
}
