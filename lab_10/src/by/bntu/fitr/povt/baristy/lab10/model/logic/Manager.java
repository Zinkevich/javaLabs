package by.bntu.fitr.povt.baristy.lab10.model.logic;

import by.bntu.fitr.povt.baristy.lab10.model.entity.Book;
import by.bntu.fitr.povt.baristy.lab10.model.entity.Library;
import by.bntu.fitr.povt.baristy.lab10.model.entity.Reader;
import by.bntu.fitr.povt.baristy.lab10.util.UserInput;
import by.bntu.fitr.povt.baristy.lab10.view.Printer;

public class Manager {
    public static final int FIRST_INDEX = 0;
    public static final String MESSAGE_BOOK_ON_HANDS = "All books are in library.";
    public static final String MESSAGE_NO_DEBT = "There is no such.";
    public static final String EMPTY_STRING = "";
    public static final int NO_DEBT = 0;
    public static final String MAIN_MENU = "0-Exit\n1-Show library information\n2-Books on hands\n3-Most popular book\n4-Readers with debt\n";
    public static final String INVITATION_TO_ENTER = "Enter the desired number:";
    public static final String MESSAGE_ERROR = "Error!Incorrect data.";
    public static final String MESSAGE_EXIT = "Exit...";
    public static final int ACTION_EXIT = 0;
    public static final int ACTION_SHOW_LIBRARY = 1;
    public static final int ACTION_BOOKS_ON_HANDS = 2;
    public static final int ACTION_MOST_POPULAR_BOOK = 3;
    public static final int ACTION_READERS_WITH_DEBT = 4;

    public Manager() {
    }

    public static String getBooksOnHands(Library library) {
        String result = "";

        for(int i = 0; i < library.listReaders.size(); ++i) {
            if (((Reader)library.listReaders.get(i)).cardLibrary.onHands) {
                int number = ((Reader)library.listReaders.get(i)).cardLibrary.numberBook;

                for(int j = 0; j < library.listBooks.size(); ++j) {
                    if (number == ((Book)library.listBooks.get(j)).number) {
                        result = result + ((Book)library.listBooks.get(j)).toString() + "\n";
                    }
                }
            }

            if (result.isEmpty()) {
                result = "All books are in library.\n";
            }
        }

        return result;
    }

    public static int getNumberOfBookGreatestDemand(Library library) {
        int maxDemand = ((Book)library.listBooks.get(0)).number;
        int index = 0;

        for(int i = 0; i < library.listBooks.size(); ++i) {
            if (((Book)library.listBooks.get(i)).number > maxDemand) {
                maxDemand = ((Book)library.listBooks.get(i)).number;
                index = i;
            }
        }

        return index;
    }

    public static String isReaderDebt(Library library) {
        String result = "";

        for(int i = 0; i < library.listReaders.size(); ++i) {
            if (((Reader)library.listReaders.get(i)).cardLibrary.countDaysExpired > 0 && ((Reader)library.listReaders.get(i)).cardLibrary.onHands) {
                result = result + ((Reader)library.listReaders.get(i)).toString() + " - " + ((Reader)library.listReaders.get(i)).cardLibrary.countDaysExpired + " days";
            }
        }

        if (result.isEmpty()) {
            result = "There is no such.";
        }

        return result;
    }

    public static void workWithLibrary(Library library, UserInput userInput, Printer printer) {
        String result;
        for(boolean mainLoop = true; mainLoop; printer.print(result)) {
            printer.print("0-Exit\n1-Show library information\n2-Books on hands\n3-Most popular book\n4-Readers with debt\n");
            result = "Error!Incorrect data.\n";
            String numberChoice = userInput.input("Enter the desired number:");
            if (numberChoice.matches("^?\\d+$") && Integer.parseInt(numberChoice) <= 4 && Integer.parseInt(numberChoice) >= 0) {
                switch(Integer.parseInt(numberChoice)) {
                    case 0:
                        mainLoop = false;
                        result = "Exit...\n";
                        break;
                    case 1:
                        result = library.toString() + "\n\n";
                        break;
                    case 2:
                        result = "Books on hands:\n" + getBooksOnHands(library) + "\n";
                        break;
                    case 3:
                        result = "Most popular book:\n" + ((Book)library.listBooks.get(getNumberOfBookGreatestDemand(library))).toString() + "\n\n";
                        break;
                    case 4:
                        result = "Readers with debt:\n" + isReaderDebt(library) + "\n\n";
                }
            }
        }

    }
}
