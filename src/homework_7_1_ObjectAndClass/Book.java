package homework_7_1_ObjectAndClass;

import homework_7_1_ObjectAndClass.Author;

public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return "Название книги: " + getTitle() + " " + getAuthor() + " " + "Год выпуска: " + getYear();

    }
}
