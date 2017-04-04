package com.andrei;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        NumGuess.numGuessed();

        try {
            startApp();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void startApp() throws IOException {
        passwordGuess();
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("C:\\Program Files\\Sublime Text 3\\sublime_text.exe");
    }

    public static boolean passwordGuess() {
        String[] name = {"andrei", "razvan", "alexandru"};
        String[] password = {"123456", "123321", "122331"};
        String nameInput;
        String passwordInput;
        int counter = 0;
        boolean enter = true;
        while (enter) {
            System.out.print("Username: ");
            nameInput = scanner.next();
            System.out.print("Password: ");
            passwordInput = scanner.next();
            counter++;
            for (String nameG : name) {
                for (String passwordG : password) {
                    if (nameG.equals(nameInput) && passwordG.equals(passwordInput)) {
                        System.out.println("Username and password are guessed and number of guessing tentative are " + counter);
                        enter = false;
                    }
                }
            }
        }
        return false;
    }


}

