package com.asherbakov.hw1;

import com.asherbakov.hw1.exceptions.WrongLoginException;
import com.asherbakov.hw1.exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        String login = "Anthon_1";
        String password = "sdf123";
        String confirmPassword = "sdf123";
        try {
            System.out.println(Security.check(login, password, confirmPassword));
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }
    }
}
