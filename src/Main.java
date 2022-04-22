import Lesson1.Book;
import Lesson1.Homework1;
import Lesson1.Author;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Author author1 = new Author("Niccolo", "Machiavelli");
        Book book1 = new Book("The Prince", 1532,author1);
        Author author2 = new Author("Anton", "Chekhov");
        Book book2 = new Book("Seagull", 1896,author2);
        System.out.println(author1.getFirstName() + " " + author1.getSurname());
        System.out.println(author2.getFirstName() + " " + author2.getSurname());
        System.out.println(book1.getName() + " " + book1.getYearOfPublication() + " " + book1.getAuthor());
        System.out.println(book2.getName() + " " + book2.getYearOfPublication() + " " + book2.getAuthor());
        book1.setYearOfPublication(2022);
        System.out.println(book1.getYearOfPublication());
    }
}