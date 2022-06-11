public class Book {
    private String nameOfTheBook;
    private int publishingYear;
    private String authorOffTheBook;
    public  Book  (String nameOffTheBook, int publishingYear, String authorOfTheBook){
        this. nameOfTheBook = nameOffTheBook;
        this. publishingYear = publishingYear;
        this. authorOffTheBook = authorOfTheBook;
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
}
