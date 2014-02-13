package com.anuj.algorithms;

/**
 *
 * @author Anuj Patel
 * @source http://goldenpackagebyanuj.blogspot.in/2012/10/how-to-check-number-is-palindrom-number.html
 */
public class Palindrom {

    protected void checkPalindrom(int num) {
        int reverse = 0;
        int original = num;

        for (int i = 0; i <= num; i++) {
            int rand = num % 10;
            num = num / 10;
            reverse = reverse * 10 + rand;
        }
        System.out.println("Original Number is - " + original);
        System.out.println("Reverse Number is - " + reverse);

        if (reverse == original) {
            System.out.println("number is Palindrom\n");
        } else {
            System.out.println("number is not palindrom\n");
        }
    }

    public static void main(String[] args) {
        Palindrom palindrom = new Palindrom();
        palindrom.checkPalindrom(46361);
        palindrom.checkPalindrom(46364);
    }
}

