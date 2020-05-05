public class BookTest {
    public static void main(String[] args) {

        Book[]books = new Book[3];
        books[0] = new Book();
        books[0].setAuthor_name("Author1");
        books[0].setIsbn_number(111);
        books[0].setBook_name("Book1");
        books[0].setPublisher("Publisher1");
        books[0].getBookInfo();

        books[1] = new Book();
        books[1].setAuthor_name("Author2");
        books[1].setIsbn_number(222);
        books[1].setBook_name("Book2");
        books[1].setPublisher("Publisher2");
        books[1].getBookInfo();

        books[2] = new Book();
        books[2].setAuthor_name("Author3");
        books[2].setIsbn_number(333);
        books[2].setBook_name("Book3");
        books[2].setPublisher("Publisher3");
        books[2].getBookInfo();
    }
}
