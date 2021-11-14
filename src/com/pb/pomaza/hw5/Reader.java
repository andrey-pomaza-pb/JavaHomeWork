package com.pb.pomaza.hw5;

import java.time.LocalDate;

public class Reader {
    private String surname;
    private int libraryCard;
    private String faculty;
    private LocalDate date_of_birth;
    private String phone_number;

    public Reader(String surname, int libraryCard, String faculty, LocalDate date_of_birth, String phone_number) {
        this.surname = surname;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.date_of_birth = date_of_birth;
        this.phone_number = phone_number;
    }

    public String getSurname() {
        return surname;
    }

    public int getLibraryCard() {
        return libraryCard;
    }

    public String getFaculty() {
        return faculty;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setLibraryCard(int libraryCard) {
        this.libraryCard = libraryCard;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }


    public void takeBook(int bookCount) {
        System.out.println(surname + " взял " + bookCount + " книг(и) " );
    }

    public void takeBook(String... bookNames) {
        System.out.println(surname + " взял книги: ");
        for (String name : bookNames ) {
            System.out.print(name + " ");
        }
}
   public void takeBook(Book... books) {
        System.out.println(surname + " взял книги: ");
        for (Book book: books ) {
            System.out.println(book.getName() + " (" + book.getAuthor() + " " +book.getYear() + ") ");      }
    }


    public void returnBook(int bookCount) {
        System.out.println(surname + " вернул " + bookCount + " книг(и) " );
    }

    public void returnBook(String... bookNames) {
        System.out.println(surname + " вернул книги: ");
        for (String name : bookNames ) {
            System.out.print(name + " ");
        }
    }
    public void returnBook(Book... books) {
        System.out.println(surname + " вернул книги: ");
        for (Book book: books ) {
            System.out.println(book.getInfo());
        }
    }

    @Override
    public String toString() {
        return "Reader{" +
                "surname='" + surname + '\'' +
                ", libraryCard=" + libraryCard +
                ", faculty='" + faculty + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}


