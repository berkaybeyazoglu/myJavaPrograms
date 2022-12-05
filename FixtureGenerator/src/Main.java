import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("Fenerbahçe");
        list.add("Galatasaray");
        list.add("Beşiktaş");
        list.add("Trabzonspor");
        list.add("Bursaspor");
        if(list.size()%2!=0){
            list.add("BAY");
        }
        FixGenerator.generator(list);

    }
}
