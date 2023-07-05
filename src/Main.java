public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author stivenKing = new Author("Стивен", "Кинг");
        Author joanRoaling = new Author("Джоан", "Роалинг");
        Book happyPotter = new Book("Гарри Поттер и узник Азкабана",joanRoaling,2019);
        Book greenMile = new Book("Зеленая миля",stivenKing,2014);
        Book aboutking = new Book("Сказка о царе Салтане",pushkin,1831);
    }
}