package generics;

public class Student<T> implements IDatabase<T>{

    @Override
    public boolean insert(T data) {
        System.out.println("Veri ekledik");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("Veri sildik");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println("Veri güncelledik");
        return true;
    }

    @Override
    public T select() {
        System.out.println("Veri çektik");
        return null;
    }
}
