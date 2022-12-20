package org.opencartNew;

import java.util.Random;

public class Data {

    public static String getRandomFirstname() {
        String simbols = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        StringBuilder firstname = new StringBuilder();
        Random rnd = new Random();
        while (firstname.length() < 32) {
            int index = (int) (rnd.nextFloat() * simbols.length());
            firstname.append(simbols.charAt(index));
        }
        String firstnameStr = firstname.toString();

        return firstnameStr;
    }

    public static String getRandomLastname() {
        String simbols = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        StringBuilder lastname = new StringBuilder();
        Random rnd = new Random();
        while (lastname.length() < 32) {
            int index = (int) (rnd.nextFloat() * simbols.length());
            lastname.append(simbols.charAt(index));
        }
        String lastnameStr = lastname.toString();

        return lastnameStr;
    }

    public static String getRandomEmail() {
        String simbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder mail = new StringBuilder();
        Random rnd = new Random();
        while (mail.length() < 5) {
            int index = (int) (rnd.nextFloat() * simbols.length());
            mail.append(simbols.charAt(index));
        }
        String mailStr = mail.toString();

        return mailStr + "@mail.ru";
    }

    public static String getRandomPassword() {
        String simbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890~`!@#$%^&*()-_=+[{]}|;:'<.>/?";
        StringBuilder password = new StringBuilder();
        Random rnd = new Random();
        while (password.length() < 20) {
            int index = (int) (rnd.nextFloat() * simbols.length());
            password.append(simbols.charAt(index));
        }
        String passwordStr = password.toString();

        return passwordStr;
    }

    public static String getRandomTelephone() {
        String simbols = "1234567890";
        StringBuilder telephone = new StringBuilder();
        Random rnd = new Random();
        while (telephone.length() < 32) {
            int index = (int) (rnd.nextFloat() * simbols.length());
            telephone.append(simbols.charAt(index));
        }
        String telephoneStr = telephone.toString();

        return telephoneStr;
    }



    public static String password = getRandomPassword();

    public static String url = "https://learn-qa.ru";
    public static String successRegMessage = "Ваша учетная запись создана!";

}
