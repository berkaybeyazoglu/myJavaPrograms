public class SafeHouse extends NormalLoc{
    public SafeHouse(int id ,Player player, String name) {
        super(id, player, "Güvenli Ev");
    }


    @Override
    public boolean onLocation(){
        System.out.println("Güvenli Evdesiniz !");
        System.out.println("Canınız Yenilendi !");
        this.getPlayer().setHealth(this.getPlayer().getDefHealth());
        return true;
    }

}
