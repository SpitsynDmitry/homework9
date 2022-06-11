public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Воина и мир",1830,"Лев Толстой");
        Book book2 = new Book("Мертвые души", 1870, "Гоголь" );
        book1. setPublishingYear(1850);
        book2.setPublishingYear(1890);
        System.out.println("book1.getNameOfTheBook() = " + book1.getNameOfTheBook() +" Год:"+book1.getPublishingYear()+ " Автор:"+book1.getAuthorOffTheBook());
        System.out.println("book2.getNameOfTheBook() = " + book2.getNameOfTheBook() + book2.getPublishingYear() +book2.getAuthorOffTheBook() );


        Author author1 = new Author("Николай","Васильевич", "Гоголь");
        Author author2 = new Author("Лев", "Николаевич","Толстой");
        System.out.println("Автор.имя = " + author1.getFirstName() +" "+author1.getMidlName()+" "+author1.getLastName());
        System.out.println("Автор.имя = " + author2.getFirstName()+ " " +author2.getMidlName()+" "+ author2.getLastName());

        System.out.println("Книга 2= " + book2.getNameOfTheBook()+ " " + book2.getPublishingYear() + " " + author1.getFirstName() +" "+author1.getMidlName()+" "+author1.getLastName() );

        System.out.println("Книга 1 = " + book1.getNameOfTheBook() +" Год:"+book1.getPublishingYear()+ " Автор:"+ author2.getFirstName()+ " " +author2.getMidlName()+" "+ author2.getLastName());
    }
}