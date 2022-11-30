package NestedClassesAndGenerics;

public class main {
    public static void main(String[] args) {

         //Out o = new Out();
         //Out.In in = o.new In();

         //in.run();

        Out.In.run();//static class ve methodlar sayesinde


        LocalCc l = new LocalCc();
        l.run();

        Anonnymous a = new Anonnymous(){
            @Override
            public void run(){
                System.out.println("anonim olarak yazıldı");
            }
        };

        a.run();
    }
}
