import java.util.Locale;
import java.util.Random;

public abstract class BattleLoc extends Location{
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;


    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle){
        super(player , name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();

        System.out.println("Şuan buradasınız : " + this.getName());
        System.out.println("Dikkatli ol! Burada " + obsNumber +" tane " + this.getObstacle().getName() + " var!!");
        System.out.print("<S>avaş ya da <K>aç : ");
        String selectBCase = input.nextLine().toUpperCase(Locale.ROOT);
        if (selectBCase.equals("S")){
            if( combat(obsNumber)) {
                System.out.println(this.getName() + " civardaki tüm duşmanları katlettiniz!");
                return true;
            }
        }
        if(this.getPlayer().getHealth() <= 0 ){
            System.out.println("Öldün ^^, ");
            return false;
        }
        return true;
    }

    public boolean combat(int obsNumber){
        for (int i=1 ; i<= obsNumber ; i++){
            this.getObstacle().setHealth(this.getObstacle().getDefHealth());
            System.out.println( i + ". Düşman : " + this.getObstacle().getName() );
            System.out.println(" -----------------------------" );
            playerStats();
            obstacleStats();
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0){
                System.out.print("<V>ur ya da <K>aç");
                String selectCombat = input.nextLine().toUpperCase(Locale.ROOT);
                if (selectCombat.equals("V")){
                    System.out.println("Atak yaptınız.");
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getHealth() > 0){
                        System.out.println();
                        System.out.println("Canavar atak yaptı !");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if(obstacleDamage < 0)obstacleDamage = 0;
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                    }
                }//if 'V' ends
                else return false;
            }//while ends
            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()){
                System.out.println("Düşmanınız öldü. ");
                System.out.println(this.getObstacle().getAward() + " para kazandınız.");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Mevcut Paranız : " + this.getPlayer().getMoney());
            }else return false;
        }//for ends

        return true;
    }//combat ends

    public void afterHit(){
        System.out.println("Canınız " +this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() +" Canı :" + this.getObstacle().getHealth());
        System.out.println(" -------------------------------- ");
    }
    public void playerStats(){
        System.out.println(" Oyuncu Değerleri ");
        System.out.println(" -------------------------------- ");
        System.out.println(" Sağlık : " + this.getPlayer().getHealth() );
        System.out.println(" Hasar  : " + this.getPlayer().getTotalDamage() );
        System.out.println(" Silah  : " + this.getPlayer().getInventory().getWeapon().getName() );
        System.out.println(" Zırh   : " + this.getPlayer().getInventory().getArmor().getName() );
        System.out.println(" Blok   : " + this.getPlayer().getInventory().getArmor().getBlock() );
        System.out.println(" Para   : " + this.getPlayer().getMoney() );
        System.out.println(" -------------------------------- ");

    }

    public void obstacleStats(){
        System.out.println(" Canavarın Değerleri ");
        System.out.println(" -------------------------------- ");
        System.out.println(" Sağlık : " + this.getObstacle().getHealth() );
        System.out.println(" Hasar  : " + this.getObstacle().getDamage() );
        System.out.println(" Ödül   : " + this.getObstacle().getAward() );
        System.out.println(" -------------------------------- ");
    }


    public int randomObstacleNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
