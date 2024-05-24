package construct;

public class Book {
    String name;
    String author;
    int page;
    Book (String java, int i, String han, String number){
        this("","",0);
    }

    Book (String name, String author){
        this(name, author, 0);
    }
    Book(String name, String author, int page){
        this.name = name;
        this.author = author;
        this.page = page;
    }


    void displayInfo(){
        System.out.println("제목 : "+ name + " 저자 : " + author + " 페이지 : " + page);
    }
}
