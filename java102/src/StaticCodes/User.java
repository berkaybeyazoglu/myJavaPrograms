package StaticCodes;

public class User {

    public String name;
    public  static int count;


    static {
        int random = (int) (Math.random() * 10);
        System.out.println("Ben bir static bir kod bloğuyum eğer static tanımlandıysam sadece 1 kere çalışırım");
        System.out.println("Random sayı: " + random);
        count = random;
    }

    public User(String name){
        this.name = name;
        count++;
    }

}
