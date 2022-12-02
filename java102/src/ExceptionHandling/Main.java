package ExceptionHandling;

import java.util.Scanner;

public class Main {

    public static void checkAge(int age) throws Exception{
        if (age < 18 ){
            throw new AgeCheckException("Yaşınızı tutmuyor");
        }
        System.out.println("Yaş uygundur.");
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yaşınızı girin :");
        int age = input.nextInt();
        try{
            checkAge(age);
        }catch (Exception e){
            System.out.println("Yaş uymadı");
        }
        /*
        System.out.println("Program Başladı");

        System.out.println("A sayısını girin");
        int a = input.nextInt();
        int b = 10;
        System.out.println(b/a);
        System.out.println("Program bitti");
        */

        /*
        int a = 0;
        int b = 10;
        try{
            System.out.println("Bölme işlemi");
            System.out.println(b/a);
            System.out.println("Bölme işlemi bitti");
        }catch (ArithmeticException e){
            System.out.println("Aritmetik hata aldın");
            System.out.println(e.toString());
        }catch (Exception e){
            System.out.println("Hata yakalandı");
            System.out.println(e.toString());
        }finally {
            System.out.println("Burası kesin çalışırr");
        }
        System.out.println("prg bitti");

         */

    }
}
