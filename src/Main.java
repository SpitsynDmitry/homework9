public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Воина и мир.", 1830, "Лев Толстой");
        Book book2 = new Book(" Мертвые души. ", 1870, "Гоголь");
        book1.setPublishingYear(1850);
        book2.setPublishingYear(1890);
        System.out.println("book1.getNameOfTheBook() = " + book1.getNameOfTheBook() + " Год:" + book1.getPublishingYear() + " Автор:" + book1.getAuthorOffTheBook());
        System.out.println("book2.getNameOfTheBook() = " + book2.getNameOfTheBook() + book2.getPublishingYear() + book2.getAuthorOffTheBook());


        Author author1 = new Author("Николай", "Васильевич", "Гоголь");
        Author author2 = new Author("Лев", "Николаевич", "Толстой");
        System.out.println("Автор.имя = " + author1.getFirstName() + " " + author1.getMidlName() + " " + author1.getLastName());
        System.out.println("Автор.имя = " + author2.getFirstName() + " " + author2.getMidlName() + " " + author2.getLastName());
        System.out.println("Книга 2= " + book2.getNameOfTheBook() + " " + book2.getPublishingYear() + " " + author1.getFirstName() + " " + author1.getMidlName() + " " + author1.getLastName());
        System.out.println("Книга 1 = " + book1.getNameOfTheBook() + " Год:" + book1.getPublishingYear() + " Автор:" + author2.getFirstName() + " " + author2.getMidlName() + " " + author2.getLastName());
//Простой уровень
        //  Реализовать методы toString, equals и hashCode в классах Author и Book,
//  которые были созданы на прошлом уроке. Обратите внимание, что toString книги не должен дублировать код из toString автора,
//  а должен делегировать (вызывать) его версию метода.
        //    •	Критерии оценки
        //   – Метод toString реализован корректно.
        //   – Метод equals реализован корректно.
        //  – Метод hashCode реализован корректно.
        //  – Методы не дублируют друг друга в классах Author и Book
        System.out.println(" Урок 10 ");
        System.out.println("Метод toString  " + book2 + author1);
        System.out.println("Метод toString  " + book1 + author2);
        System.out.println("  методы toString, equals и hashCode в классах Author и Book ");
        Book b = new Book("Воина и мир Том 1.", 1830, "Лев Толстой");
        Book b2 = new Book("Воина и мир.Том2", 1830, "Лев Толстой");
        Author a = new Author("Лев", "Николаевич", "Толстой");
        Author a2 = new Author("Лев", "Николаевич", "Толстой");
        System.out.println(b.equals(b2) + "  Книги одинаковые");
        System.out.println(a.equals(a2) + "  Авторы одинаковые");
        System.out.println(book1.equals(book1) + "  Книги одинаковые");
        System.out.println(author1.equals(author2) + "  Авторы одинаковые");


    }


}



