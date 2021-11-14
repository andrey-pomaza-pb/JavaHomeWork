package com.pb.pomaza.hw5;

import java.time.LocalDate;

public class Library {
    public static void main(String[] args) {
        Reader ivan = new Reader("Иванов И.И.", 123,"физика", LocalDate.of(1980,10,20),
"80661234567"
);
        Reader pety = new Reader("Петр.", 333,"укр", LocalDate.of(1990,11,25),
                "806632167"
);
        System.out.println(ivan);
        System.out.println(pety);

Book book1 = new Book("пособие","Шевченко Т.Г ", 1956);
Book book2 = new Book("букварь","Чехов  А.П. ", 1975);
Book book3 = new Book("азбука","Толстой Л.А ", 1994);
        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());

        ivan.takeBook(3);
        ivan.takeBook("вечера на хуторе близ диканьки ", "задолбали наркоманы " ," метод дичь ");
        ivan.takeBook(book1, book2, book3);


        ivan.returnBook(3);
        ivan.returnBook("вечера на хуторе близ диканьки ", "задолбали наркоманы " ," метод дичь ");
        ivan.returnBook(book1, book2, book3);
    }
}

