package com.pb.pomaza.hw5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 1, "МГ", "01.04.1998", "+380675654111");
        Reader reader2 = new Reader("Иванов И.И.", 2, "МГ", "01.04.2000", "+38056722222");
        Reader reader3 = new Reader("Сидоров А.А.", 3, "MГ", "01.04.1980", "+380506733333");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Приключения", "Гоголь");
        Book book2 = new Book("Словарь", "Чехов");
        Book book3 = new Book("Энциклопедия", "Гусев");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь","Энциклопедия");
        reader3.takeBook(book1, book2,book3);

        reader1.returnBook(3);
        reader2.returnBook("Приключения", "Словарь", "Энциклопедия" );
        reader3.returnBook(book3);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}

