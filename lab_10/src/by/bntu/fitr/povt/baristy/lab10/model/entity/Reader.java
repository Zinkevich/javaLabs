package by.bntu.fitr.povt.baristy.lab10.model.entity;

public class Reader {
    public static int countReader;
    public String surname;
    public String name;
    public String patronymic;
    public String phoneNumber;
    public CardLibrary cardLibrary;

    public Reader() {
        this.surname = "no surname";
        this.name = "no name";
        this.patronymic = "no patronymic";
        this.phoneNumber = "no phone";
        this.cardLibrary = null;
    }

    public Reader(String surname, String name, String patronymic, String phoneNumber, CardLibrary cardLibrary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
        this.cardLibrary = cardLibrary;
    }

    public Reader(Reader reader) {
        this.surname = reader.surname;
        this.name = reader.name;
        this.patronymic = reader.patronymic;
        this.phoneNumber = reader.phoneNumber;
        this.cardLibrary = reader.cardLibrary;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getName() {
        return this.name;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CardLibrary getCardLibrary() {
        return this.cardLibrary;
    }

    public void setSurname(String newSurname) {
        this.surname = newSurname;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPatronymic(String newPatronymic) {
        this.patronymic = newPatronymic;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    public void setCardLibrary(CardLibrary newCardLibrary) {
        this.cardLibrary = newCardLibrary;
    }

    public String toString() {
        return "#" + this.cardLibrary.numberReader + "." + this.surname + " " + this.name + " " + this.patronymic + "(+" + this.phoneNumber + ")";
    }
}
