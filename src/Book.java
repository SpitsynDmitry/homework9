import java.util.Objects;

public class Book {
    private final String nameOfTheBook;
    private int publishingYear;
    private final String authorOffTheBook;

    public Book(String nameOffTheBook, int publishingYear, String authorOfTheBook) {
        this.nameOfTheBook = nameOffTheBook;
        this.publishingYear = publishingYear;
        this.authorOffTheBook = authorOfTheBook;
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getAuthorOffTheBook() {
        return authorOffTheBook;
    }

    public void setPublishingYear(int publishingYear) {

        this.publishingYear = publishingYear;
    }


    @Override
    public String toString() {
        return "Книга" + " Название:'" + nameOfTheBook + ", год издания:" + publishingYear + ",";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(nameOfTheBook, book.nameOfTheBook) && Objects.equals(authorOffTheBook, book.authorOffTheBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheBook, publishingYear, authorOffTheBook);
    }


}
