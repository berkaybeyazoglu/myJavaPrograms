package StaticCodes;

import StaticCodes.Calculate;
import StaticCodes.Course;

//public class Main {
//
//    public static void main(String[] args) {
//        Course mat = new Course("Matematik", "mtm101", 70);
//        Course fizik = new Course("Fizik", "fzk101", 20);
//        Course kimya = new Course("Kimya", "fzk101", 100);
//
//        int[] x = {mat.note,fizik.note,kimya.note};
//        Calculate.calcAvarage(x);
//    }
public class Main {

    public static void main(String[] args) {
        User u1 = new User("Berkay Beyazoğlu");
        User u2 = new User("Berko Meto");
        System.out.println(User.count);
    }

}

// HackerRank--Java Static Initializer Block
//    //Write your code here
//    static int B,H;
//    static boolean flag;

//static{
//        Scanner scan = new Scanner(System.in);
//        B = scan.nextInt();
//        H = scan.nextInt();
//        scan.close();

//        if (B <=  0 ||  H <=  0)System.out.println("java.lang.Exception: Breadth and height must be positive");
//        else {flag = true;}
//        }

//public static void main(String[] args){
//        if(flag){
//        int area=B*H;
//        System.out.print(area);
//        }

//        }//end of main

//        }//end of class








