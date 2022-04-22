package Lesson1;

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
}
