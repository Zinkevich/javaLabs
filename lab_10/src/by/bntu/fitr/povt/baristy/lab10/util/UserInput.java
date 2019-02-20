package by.bntu.fitr.povt.baristy.lab10.util;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner;

    public UserInput() {
    }

    public String input(String msg) {
        System.out.print(msg);
        String value = scanner.nextLine();
        return value;
    }

    static {
        scanner = new Scanner(System.in);
    }

}
