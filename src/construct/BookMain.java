package construct;

public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book("java", 10000, "han", "12345");
        book1.displayInfo();

        Book book2 = new Book("hello java", "seo");
        book2.displayInfo();

        Book book3 = new Book("JPA", "KIM", 80);
        book3.displayInfo();
    }
}
