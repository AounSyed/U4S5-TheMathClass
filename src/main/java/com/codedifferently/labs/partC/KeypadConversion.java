package com.codedifferently.labs.partC;
import java.util.Scanner;

public class KeypadConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any letters once or multiple times: ");
        String letter = sc.next();
        for (int i = 0; i < letter.length(); i++) {
            if (Character.isLetter(letter.charAt(i))){
                System.out.print(getNum(Character.toLowerCase(letter.charAt(i))));
            }
        }
    }

    public static int getNum(char letter) {
        int number = 0;
        switch (letter) {
            case 'a':
                number = 2;
                return (2);
            case 'b':
                number = 22;
                return (22);
            case 'c':
                number = 222;
                return (222);
            case 'd':
                number = 3;
                return (3);
            case 'e':
                number = 33;
                return (33);
            case 'f':
                number = 333;
                return (333);
            case 'g':
                number = 4;
                return (4);
            case 'h':
                number = 44;
                return (44);
            case 'i':
                number = 444;
                return (444);
            case 'j':
                number = 5;
                return (5);
            case 'k':
                number = 55;
                return (55);
            case 'l':
                number = 555;
                return (555);
            case 'm':
                number = 6;
                return (6);
            case 'n':
                number = 66;
                return (66);
            case 'o':
                number = 666;
                return (666);
            case 'p':
                number = 7;
                return (7);
            case 'q':
                number = 77;
                return (77);
            case 'r':
                number = 777;
                return (777);
            case 's':
                number = 7777;
                return (7777);
            case 't':
                number = 8;
                return (8);
            case 'u':
                number = 88;
                return (88);
            case 'v':
                number = 888;
                return (888);
            case 'w':
                number = 9;
                return (9);
            case 'x':
                number = 99;
                return (99);
            case 'y':
                number = 999;
                return (999);
            case 'z':
                number = 9999;
                return (9999);
        }
        return number;
    }
}
