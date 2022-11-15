package StaticCodes;

public class Calculate {

    public static void calcAvarage(int[] notes){
        double total = 0;
        for (int j : notes) {
            total += j;
        }
        double calcTotal = 0;
        calcTotal = total / notes.length;
        System.out.println("Ortalama: " + calcTotal);
    }
}
