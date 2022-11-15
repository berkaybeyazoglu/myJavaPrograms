package OOP_Fundamentals.inheritance;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Berkay","Beyazoğlu","123","aa",100);
        Student st2 = new Student("Berko","Derdo","456","ab",75);
        Student st3 = new Student("Serko","Merdo","786","bb",50);

        //System.out.println(st2.getNote());
        Instructor teacher = new Instructor("berk","hoca","matmuh");

        //  Composition
        //  Course has a Instructor
            Course mat = new Course("Mat101","Mat",teacher) ;
            System.out.println(mat.getInstructor().getSurname());

        //Student[] stu = {st1,st2,st3};
        //System.out.println("Ortalama değeri: " + mat.calcAvarage(stu));
         }


}
