package construct;

public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("hello java", "seo");
        book2.displayInfo();

        Book book3 = new Book("JPA", "KIM", 80);
        book3.displayInfo();
    }
}
