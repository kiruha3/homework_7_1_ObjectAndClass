package homework_7_1_ObjectAndClass;

import homework_7_1_ObjectAndClass.Author;
import homework_7_1_ObjectAndClass.Book;

public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author stivenKing = new Author("Стивен", "Кинг");
        Author joanRoaling = new Author("Джоан", "Роалинг");
        Book happyPotter = new Book("Гарри Поттер и узник Азкабана", joanRoaling, 2019);
        Book greenMile = new Book("Зеленая миля", stivenKing, 2014);
        Book aboutking = new Book("Сказка о царе Салтане", pushkin, 1831);

        enterBook(happyPotter);
        enterBook(greenMile);
        enterBook(aboutking);

        happyPotter.setYear(2021);
        enterBook(happyPotter);
    }
    public static void enterBook(Book book){
        System.out.printf("Название книги: %s %n" +
                        "Автор: Имя: %s Фамилия: " +
                        "%s%nГод выпуска: %s%n-------------------------%n",
                book.getTitle(),
                book.getAuthor().getName(),
                book.getAuthor().getSurname(),
                book.getYear() );
    }
}