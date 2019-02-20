package by.bntu.fitr.povt.baristy.lab10.model.entity;

import java.util.ArrayList;

public class Library {
    public String name;
    public ArrayList<Book> listBooks;
    public ArrayList<Reader> listReaders;

    public Library() {
    }

    public Library(String name, ArrayList<Book> listBooks, ArrayList<Reader> listReaders) {
        this.name = name;
        this.listBooks = listBooks;
        this.listReaders = listReaders;
    }

    public Library(Library library) {
        this.name = library.name;
        this.listBooks = library.listBooks;
        this.listReaders = library.listReaders;
    }

    public ArrayList getListBooks() {
        return this.listBooks;
    }

    public ArrayList getListReaders() {
        return this.listReaders;
    }

    public String getName() {
        return this.name;
    }

    public void setListBooks(ArrayList<Book> listBooksNew) {
        this.listBooks = listBooksNew;
    }

    public void setListReaders(ArrayList<Reader> listReadersNew) {
        this.listReaders = listReadersNew;
    }

    public void setName(String nameNew) {
        this.name = nameNew;
    }

    public String toString() {
        String result = "***" + this.name + "***\n\nBooks:";

        int i;
        for(i = 0; i < this.listBooks.size(); ++i) {
            result = result + "\n" + this.listBooks.get(i);
        }

        result = result + "\n\nReaders:";

        for(i = 0; i < this.listReaders.size(); ++i) {
            result = result + "\n" + this.listReaders.get(i);
        }

        return result;
    }
}
