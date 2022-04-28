package Lesson1;

import java.util.Objects;

public class Book {
    private String name;
    private int yearOfPublication;
    private Author author;

    public Book (String name, int yearOfPublication, Author author){
        this.name = name;
        this.yearOfPublication= yearOfPublication;
        this.author = author;
    }

    public String getName(){
        return this.name;
    }
    public int getYearOfPublication(){
        return this.yearOfPublication;
    }
    public Author getAuthor() {
        return this.author;
    }

    public void setName(String name) {
        this.name =name;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    public String toString() {
        return "Name: " + this.name + ". Year of publication: " + this.yearOfPublication + " " + this.author + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && name.equals(book.name) && author.equals(book.author);
    }
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        } else if (this.getName() != ((Book) other).getName()) {
            return false;
        }else if (this.getYearOfPublication() != ((Book) other).getYearOfPublication()) {
            return false;
        }else if (this.getAuthor() != ((Book) other).getAuthor()){
            return false;
        }
        Book book1 = (Book) other;
        return name.equals(book1.name);

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfPublication, author);
    }
}
