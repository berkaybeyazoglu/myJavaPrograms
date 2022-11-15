package OOP_Fundamentals.Encapsulation;

public class Book {
    private String name;
    private int pageNumber;

    public Book(String name,int pageNumber){
        this.name = name;
        this.pageNumber = pageNumber;
    }


    public int getPageNumber(){
        if (pageNumber < 0) pageNumber =0;
        return this.pageNumber;
    }
    public void setPageNumber(int pageNumber){
        if (pageNumber < 0) pageNumber =0;
        this.pageNumber = pageNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
