package Lesson1;

import java.util.Objects;

public class Author {
    private String firstName;
    private String surname;

    public Author(String name, String surname) {
        this.firstName = name;
        this.surname = surname;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getSurname(){
        return this.surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public  void  setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Full author name: " + this.firstName + " " + this.surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstName.equals(author.firstName) && surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname);
    }
}
