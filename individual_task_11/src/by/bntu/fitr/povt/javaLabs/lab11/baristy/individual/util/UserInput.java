package by.bntu.fitr.povt.javaLabs.lab11.baristy.individual.util;

import java.util.Scanner;

public class UserInput {
    public static int inputInt(String msg) {
        Scanner scanner = new Scanner(System.in);

        int value;

        while (true) {
            System.out.println(msg);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                break;
            } else {
                scanner.nextLine();
            }
        }
        return value;
    }
}
