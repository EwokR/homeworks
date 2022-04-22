package Lesson1;

public class Homework1 {
    public static void homework1(String[] args) {
        Author author1 = new Author("Niccolo", "Machiavelli");
        Book book1 = new Book("The Prince",1532, author1);
        System.out.println("n1.name = " );
        Author author2 = new Author("Anton", "Chekhov");
        Book book2 = new Book("Seagull", 1896,author2);
    }
}
