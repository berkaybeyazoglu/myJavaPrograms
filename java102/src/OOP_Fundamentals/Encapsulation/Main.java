package OOP_Fundamentals.Encapsulation;


public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 150);
        Book lordOfTheRings = new Book("Lord Of The Rings", -100);

        System.out.println(lordOfTheRings.getPageNumber());
        System.out.println(harryPotter.getName());
        lordOfTheRings.setName("LOTR");
        System.out.println(lordOfTheRings.getName());

    }
}
