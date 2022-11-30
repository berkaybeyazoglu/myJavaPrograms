package generics;

import NestedClassesAndGenerics.Out;

public class Main {
    public static void main(String[] args) {
         //Nullable<Integer> n = new Nullable<>(10);
         //n.run();
        //Integer a = 19;
        //String b = "berko";
        //Double c = 3.31;
//
        //Test<Integer,String ,Double> t = new Test<>(a,b,c);
//
        //t.showInfo();


        String[] a = {"ja","va","da"};
        Integer[] b = {1,2,3};

        //for (String i : a){
        //    System.out.println(i);
        //}
        //for (Integer i : b){
        //    System.out.println(i);
        //}

        //üstteki döngüler yerine generic bi method yazdık
        Print.printArray(a);
        Print.printArray(b);


        Student<String> stu = new Student<>();
        stu.insert("xdd");
    }


}
