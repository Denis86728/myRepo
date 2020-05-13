public class Book {
    String book_name;

    int isbn_number;

    String author_name;

    String publisher;

    public Book() {
        this.book_name = book_name;
        this.isbn_number = isbn_number;
        this.author_name = author_name;
        this.publisher = publisher;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getIsbn_number() {
        return isbn_number;
    }

    public void setIsbn_number(int isbn_number) {
        this.isbn_number = isbn_number;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void getBookInfo() {
        this.book_name = book_name;
        this.isbn_number = isbn_number;
        this.author_name = author_name;
        this.publisher = publisher;
        System.out.println("For the book " + book_name + " with number " + isbn_number + " the author is " + author_name
            + " and the publisher is " + publisher);
    }

}
