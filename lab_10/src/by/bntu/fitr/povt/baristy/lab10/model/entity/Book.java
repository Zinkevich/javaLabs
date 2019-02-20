package by.bntu.fitr.povt.baristy.lab10.model.entity;

public class Book {
    public static int countBook = 0;
    public String title;
    public String author;
    public int yearPublication;
    public int number;
    public int countTakes;

    public Book() {
        ++countBook;
        this.title = "no title";
        this.author = "no author";
        this.yearPublication = 0;
        this.number = countBook;
        this.countTakes = 0;
    }

    public Book(String title, String author, int year, int number, int countTakes) {
        ++countBook;
        this.title = title;
        this.author = author;
        this.yearPublication = year;
        this.number = number;
        this.countTakes = countTakes;
    }

    public Book(Book book) {
        ++countBook;
        this.title = book.title;
        this.author = book.author;
        this.yearPublication = book.yearPublication;
        this.number = book.number;
        this.countTakes = book.countTakes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCountTakes() {
        return countTakes;
    }

    public void setCountTakes(int countTakes) {
        this.countTakes = countTakes;
    }

    public String toString() {
        return "#" + this.number + "." + this.title + "." + this.author + "(" + this.yearPublication + ")";
    }
}
