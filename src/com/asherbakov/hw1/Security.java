package com.asherbakov.hw1;

import com.asherbakov.hw1.exceptions.WrongLoginException;
import com.asherbakov.hw1.exceptions.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Security {
    final static int MIN_LENGHT = 1;
    final static int MAX_LENGHT = 20;
    final static String PATTERN = "\\w{1,20}";

    /**
     * Проверка введенных данных на корректность
     *
     * @param login
     * @param password
     * @param confirmPassword
     * @return
     * @throws WrongLoginException
     * @throws WrongPasswordException
     */
    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        boolean flag = true;
        if (login == null || !checkPattern(login)) {
            flag = false;
            throw new WrongLoginException("\nЛогин не соответствует следующим параметрам:" +
                    "\n- используются только латинские буквы, цифры и знак подчеркивания;" +
                    "\n- длина логина от 1 до 20 символов.");
        }
        if (password == null || confirmPassword == null || !password.equals(confirmPassword) || !checkPattern(password) || !checkPattern(confirmPassword)) {
            flag = false;
            throw new WrongPasswordException("\nПароль не соответствует следующим параметрам:" +
                    "\n- используются только латинские буквы, цифры и знак подчеркивания;" +
                    "\n- длина пароля от 1 до 20 символов;" +
                    "\n- пароли должны совпадать.");
        }
        return flag;
    }

    /**
     * Проверка строки в соответствии с шаблоном
     *
     * @param str
     * @return
     */
    private static boolean checkPattern(String str) {
        boolean flag = true;
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(str);
        if (!matcher.matches()) {
            flag = false;
        }
        return flag;
    }
}
