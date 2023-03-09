package Lesson1;
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Tолстой");
        Author author2 = new Author("Александр", "Пушкин");
        Book book1 = new Book("Война и Мир",  1867,author1);
        Book book2 = new Book("Онегин", 1833,author2);
        System.out.println("Название книги = " + book1.getAuthor());
        System.out.println("Название книги = " + book2.getAuthor());
        System.out.println("Автор = " + author1.getName() + " " + author1.getSurname());
        System.out.println("Автор = " + author2.getName() + " " + author2.getSurname());
        System.out.println("Год Публикации = " + book1.getPublication());
        System.out.println("Год Публикации = " + book2.getPublication());

        book1.setPublication(1938);
        // Вызываем сеттер
        System.out.println("Год Публикации =  " + book1.getPublication());


        System.out.println(author1.equals(author2));        //метод equals
        System.out.println(author1);                      //метод toString

    }
}