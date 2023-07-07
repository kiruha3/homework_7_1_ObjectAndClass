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

    @Override
    public String toString() {
        return "Название книги: " + getTitle() + " " + getAuthor() + " " + "Год выпуска: " + getYear();

    }

    @Override
    public boolean equals(Object object) {
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Book book = (Book) object;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title +" "+ author);
    }
}
