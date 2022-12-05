package Collection;

import java.util.*;

public class main {
    public static void main(String[] args) {

        /* --------HASHSET------
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(12);
        hSet.add(22);
        hSet.add(22);
        hSet.add(23);
        hSet.add(null);

        System.out.println(hSet.size());

        Iterator<Integer> itr = hSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        -----------------LINKEDHASHSETS---------------------
        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
        lSet.add(20);
        lSet.add(12);
        lSet.add(12);
        lSet.add(30);

        Iterator<Integer> itr = lSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
         ------------------TreeSets-------------------------
        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparable().reversed());
        students.add(new Student("Berko",90));
        students.add(new Student("ahmo",10));
        students.add(new Student("semo",30));
        students.add(new Student("yaro",50));
        students.add(new Student("karo",80));

        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().getName());
        }

        -------------ARRAYLISTS---------------------------
        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(2);
        liste.add(1);
        liste.add(0,1);
        liste.add(3);

        System.out.println(liste.indexOf(3));
        System.out.println(liste.contains(10));

        List<Integer> liste2 = new ArrayList<>();
        liste2.addAll(liste);
        liste2.add(42);

        -------------ARRAYLISTS---------------------------


        -------------LinkedLISTS---------------------------
        List<String> list = new LinkedList<>();
        list.add("Berkay");
        list.add("Çato");
        list.add("Cemil");
        list.add("Ayşe");

        list.remove(3);


        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        -------------QUEUELinkedLISTS---------------------------
        Queue<String> queue = new LinkedList<>();
        queue.add("Berkay");
        queue.add("Berna");

        queue.offer("Volkan");
        queue.offer("Çağlar");

        System.out.println("remove() : " + queue.remove());
        System.out.println("element() : " + queue.element());
        System.out.println("poll() : " + queue.poll());
        System.out.println("peek() : " + queue.peek());


        -------------MAPS---------------------------
         */

        Map<String ,String > country = new HashMap<>();

        country.put("TR","Türkiye");
        country.put("DE","Almanya");
        country.put("ENG","İngiltere");

        System.out.println(country.get("TR"));
        System.out.println(country.size());
        country.remove("ENG");

        for (String key : country.keySet()){
            System.out.println(country.get(key));
        }
        for (String value : country.values()){
            System.out.println(value);
        }

    }
}
