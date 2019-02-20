package by.bntu.fitr.povt.baristy.lab10.model.entity;

public class CardLibrary {
    public static int countCard = 0;
    public int numberReader;
    public int numberBook;
    public boolean onHands;
    //public int countDaysExpired;

    public CardLibrary() {
        ++countCard;
        this.numberReader = countCard;
        this.onHands = false;
        this.numberBook = 0;
        this.countDaysExpired = 0;
    }

    public CardLibrary(int numberReader, boolean onHands, int numberBook, int countDaysExpired) {
        ++countCard;
        this.numberReader = numberReader;
        this.onHands = onHands;
        this.numberBook = numberBook;
        this.countDaysExpired = countDaysExpired;
    }

    public CardLibrary(CardLibrary cardLibrary) {
        ++countCard;
        this.numberReader = cardLibrary.numberReader;
        this.onHands = cardLibrary.onHands;
        this.numberBook = cardLibrary.numberBook;
        this.countDaysExpired = cardLibrary.countDaysExpired;
    }

    public int getNumberReader() {
        return numberReader;
    }

    public void setNumberReader(int numberReader) {
        this.numberReader = numberReader;
    }

    public int getNumberBook() {
        return numberBook;
    }

    public void setNumberBook(int numberBook) {
        this.numberBook = numberBook;
    }

    public boolean isOnHands() {
        return onHands;
    }

    public void setOnHands(boolean onHands) {
        this.onHands = onHands;
    }

    public int getCountDaysExpired() {
        return countDaysExpired;
    }

    public void setCountDaysExpired(int countDaysExpired) {
        this.countDaysExpired = countDaysExpired;
    }

    public String toString() {
        return "#" + this.numberReader + "(" + this.numberBook + " - " + this.countDaysExpired + ")";
    }
}
