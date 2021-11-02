package com.pb.pomaza.hw5;

public class Reader {
   private String Surname;
   private int  number ;
   private String Facultative;
   private String date_of_birth;
   private String phone_number;
    public Reader(String Surname, int ticket_number, String Facultative, String date_of_birth, String phone_number) {
        this.Surname = Surname;
        this.number = number;
        this.Facultative = Facultative;
        this.date_of_birth = date_of_birth;
        this.phone_number = phone_number;
    }

    public Reader() {
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public String getFaculty() {
        return Facultative;
    }

    public void setFaculty(String Facultative) {
        this.Facultative = Facultative;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String dob) {
        this.date_of_birth = date_of_birth;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone) {
        this.phone_number = phone_number;
    }

    public void takeBook(int number) {
        System.out.println(this.Surname + " взял " + number + " книги.");
    }

    public void takeBook(String... books) {
        System.out.println(this.Surname + " взял следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.Surname + " взял следующие книги:");
        for (Book book : books) {
            System.out.println(book.getName() + ", автор - " + book.getAuthor());
        }
        System.out.println();
    }

    public void returnBook(int number) {
        System.out.println(this.Surname + " вернул " + number + " книги.");
    }

    public void returnBook(String... books) {
        System.out.println(this.Surname + " вернул следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.Surname + " вернул следующие книги:");
        for (Book book : books) {
            System.out.println(book.getName() + ", автор - " + book.getAuthor());
        }
        System.out.println();
    }

    public String getInfo() {
        return "{" +
                "fio='" + Surname + '\'' +
                ", number=" + number +
                ", Facultative='" + Facultative + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}

