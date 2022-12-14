public class ToolStore extends NormalLoc{

    public ToolStore(int id,Player player, String name) {
        super(id ,player,"Mağaza");
    }

    @Override
    public boolean onLocation(){
        System.out.println("----- Mağazaya Hoşgeldiniz ! -----");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1 - Silahlar ");
            System.out.println("2 - Zırhlar ");
            System.out.println("3 - Çıkış ");
            System.out.println(" Seçiminiz : ");
            int selectCase = input.nextInt();

            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Geçersiz değer tekrar giriş yapın");
                selectCase = input.nextInt();
            }

            switch (selectCase) {

                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Tekrar bekleriz :) ");
                    showMenu = false;
                    break;

            }
        }
        return true;
    }//onlocation end

    public void printWeapon(){
        System.out.println("-----Silahlar-----");
        System.out.println();
        for (Weapon w : Weapon.weapons()){
            System.out.println(w.getName()+" <ID> :"+w.getId() + "\t<Para> : " + w.getMoney() +
                    "\t<Hasar> : " +w.getDamage());
        }
        System.out.println(" 0 - Çıkış Yap ");

    }
    public void buyWeapon(){
        System.out.print("Satın almak istediğiniz silahı seçiniz!");
        int selectWeapon = input.nextInt();
        while (selectWeapon < 0 || selectWeapon > Weapon.weapons().length) {
            System.out.println("Geçersiz değer tekrar giriş yapın");
            selectWeapon = input.nextInt();
        }
        if (selectWeapon != 0) {
            Weapon selectedWeapon = Weapon.getWeaponByID(selectWeapon);
            if (selectedWeapon != null) {
                if (selectedWeapon.getMoney() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız yok :(");
                } else {
                    System.out.println(selectedWeapon.getName() + " silahını satın aldınız ! ");
                    int balance = getPlayer().getMoney() - selectedWeapon.getMoney();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Mevcut paranız : " + this.getPlayer().getMoney());
                    System.out.println("Önceki silahınız ->  " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Yeni silahınız ->  " + this.getPlayer().getInventory().getWeapon().getName());


                }
            }
        }
    }

    public void printArmor(){
        System.out.println("-----Zırhlar-----");
        for(Armor a : Armor.armors()){
            System.out.println(a.getName() + " <ID> : "+ a.getId() + "\t<Para> : " + a.getPrice() +
                    "\t<Hasar> : " +a.getBlock());
        }
        System.out.println(" 0 - Çıkış Yap ");
    }

    public void buyArmor(){
        System.out.print("Satın almak istediğiniz zırhı seçiniz!");
        int selectArmor = input.nextInt();
        while (selectArmor < 0 || selectArmor > Armor.armors().length) {
            System.out.println("Geçersiz değer tekrar giriş yapın");
            selectArmor = input.nextInt();
        }
        if(selectArmor != 0) {
            Armor selectedArmor = Armor.getArmorByID(selectArmor);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız yok :(");
                } else {
                    System.out.println(selectedArmor.getName() + " zırhını satın aldınız ! ");
                    int balance = getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Mevcut paranız : " + this.getPlayer().getMoney());
                    System.out.println("Önceki zırhınız ->  " + this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Yeni zırhınız ->  " + this.getPlayer().getInventory().getArmor().getName());


                }
            }
        }
    }

}//toolstore end
