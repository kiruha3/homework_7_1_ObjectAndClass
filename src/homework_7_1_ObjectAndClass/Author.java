package homework_7_1_ObjectAndClass;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return "Автор: Имя: " + getName() + "Фамилия: " + getSurname() + " ";

    }

}
