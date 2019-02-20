package by.bntu.fitr.povt.baristy.lab10.controller;

import by.bntu.fitr.povt.baristy.lab10.model.entity.Book;
import by.bntu.fitr.povt.baristy.lab10.model.entity.CardLibrary;
import by.bntu.fitr.povt.baristy.lab10.model.entity.Library;
import by.bntu.fitr.povt.baristy.lab10.model.entity.Reader;
import by.bntu.fitr.povt.baristy.lab10.model.logic.Manager;
import by.bntu.fitr.povt.baristy.lab10.util.UserInput;
import by.bntu.fitr.povt.baristy.lab10.view.Printer;

import java.util.ArrayList;

public class Lab10 {
    public Lab10() {
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        UserInput userInput = new UserInput();
        Reader reader1 = new Reader("Bobnis", "Uliana", "Victorovna", "375299818469", new CardLibrary(1, true, 321, 0));
        Reader reader2 = new Reader("Zinkevich", "Anastasia", "Vitalievna", "375299293805", new CardLibrary(2, true, 323, 5));
        Book book1 = new Book("War and Peace", "Tolstoy", 1987, 320, 1);
        Book book2 = new Book("Viy", "Gogol", 1988, 321, 5);
        Book book3 = new Book("Romeo and Juliet", "Shakespeare", 1990, 322, 2);
        Book book4 = new Book("Thunderstorm", "Ostrovsky", 1978, 323, 4);
        Book book5 = new Book("Scarlet Sails", "Green", 1988, 324, 7);
        ArrayList<Reader> listReaders = new ArrayList();
        ArrayList<Book> listBooks = new ArrayList();
        listReaders.add(reader1);
        listReaders.add(reader2);
        listBooks.add(book1);
        listBooks.add(book2);
        listBooks.add(book3);
        listBooks.add(book4);
        listBooks.add(book5);
        Library library = new Library("Library named after Yakub Kolas", listBooks, listReaders);
        Manager.workWithLibrary(library, userInput, printer);
    }
}
