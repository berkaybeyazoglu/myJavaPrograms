import Characters.Archer;
import Characters.GameCharacter;
import Characters.Knight;
import Characters.Samurai;

import java.util.Scanner;

public class Player {
    private Scanner input = new Scanner(System.in);
    private int damage;
    private int health;
    private int defHealth;
    private int money;
    private String name;
    private String charName;
    private Inventory inventory;

    //********************************************constructor****************************************
    public Player(String name,Inventory inventory) {
        this.name = name;
        this.inventory = inventory;
    }
    //********************************************constructor****************************************

    public void selectChar(){
        
        GameCharacter[] charlist = {new Samurai(), new Archer(), new Knight()};

        System.out.println("#####################################################");
        for (GameCharacter gameChar: charlist) {
            System.out.println("ID : " + gameChar.getId() +
                              "\tKARAKTER :" + gameChar.getName() +
                              "\t\tHASAR : " +gameChar.getDamage() +
                              "\t\tSAĞLIK : "+gameChar.getHealth() +
                              "\t\tPARA : "+ gameChar.getMoney());
        }
        System.out.println("#####################################################");

        int selectChar = input.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;

        }
        System.out.println("Karakteriniz : " + this.getCharName() + "\t HASAR : " +this.getDamage() +
        "\t SAĞLIK : "+this.getHealth() + "\t PARA : "+ this.getMoney());


    }
    public void initPlayer(GameCharacter gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setDefHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    public void printInfo(){
        System.out.println("Silah:" +this.getInventory().getWeapon().getName()+
                "\t Zırh :" + this.getInventory().getArmor().getName()  +
                "\t Bloklama :" + this.getInventory().getArmor().getBlock()  +
                "\t HASAR : " +this.getTotalDamage() +
                "\t SAĞLIK : "+this.getHealth() +
                "\t PARA : "+ this.getMoney());
    }


    //********************************************getter/setter****************************************
    public int getDamage() {
        return damage ;
    }
    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage() ;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDefHealth() {
        return defHealth;
    }

    public void setDefHealth(int defHealth) {
        this.defHealth = defHealth;
    }
    //********************************************getter/setter****************************************
}
