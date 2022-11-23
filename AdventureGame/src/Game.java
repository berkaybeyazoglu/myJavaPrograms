import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("Macera Oyunu'na Hoşgeldin!!");
        System.out.println("Lütfen Maceracınızın İsmini Gir : ");
        String playerName = input.nextLine();
        Inventory inventory = new Inventory();

        Player player = new Player(playerName,inventory);
        System.out.println(player.getName() + " Hoşgeldin!");
        System.out.println(player.getName() + " yaşıyacağın şeylerin gerçek hayatına da zarar verebileceğini sakın unutma.");
        System.out.println("Şimdi lütfen kendini en iyi hissedeceğin seçeneği seç.");
        player.selectChar();

        Location location = null;
        while (true){
            player.printInfo();
            System.out.println();
            System.out.println("Bölgeler :");
            System.out.println();
            System.out.println("1 - Güvenli Ev");
            System.out.println("2 - Dükkan");
            System.out.println("3 - Mağara");
            System.out.println("4 - Orman");
            System.out.println("5 - Nehir");
            System.out.println("0 - Çıkış Yap");
            System.out.println("Lütfen gitmek istediğin mekanı seçiniz :");
            int selectLoc = input.nextInt();

            switch (selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location =new SafeHouse(1,player,"Güvenli Ev");
                    break;
                case 2:
                    location = new ToolStore(2,player,"Mağaza");
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Geçerli bir değer giriniz!");
            }//switch end

            if(location== null){
                System.out.println("Demek bu diyardan kaçıyorsun! ");
                break;
            }
            if (!location.onLocation()){
                System.out.println("ÖLDÜNÜZ !!!");
                break;
            }
        }//while end

    }//start end
}//class end
