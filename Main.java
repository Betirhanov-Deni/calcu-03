package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String ot = "";
        String[] array = input.split(" ");
        String[] array1 = input.split("");
        if (array.length != 3)
            System.out.println("error1");
        else {
            for (int i = 0; i < array.length; i++) {
                if (array1[i].equals("I") || array1[i].equals("V") || array1[i].equals("X") ) {
                    System.out.println(cong(rim(input)));
                    break;

                } else
                    ot = arab(input);
            }
        }
        System.out.println(ot);
    }

    public static String cong(int result) {
        String array1 = result + "";
        String[] array = array1.split("");
        if (result < 0)
            return "error3";
        else if (result == 0)
            return "O";
        else if (result == 1)
            return "I";
        else if (result == 2)
            return "II";
        if (result == 3)
            return "III";
        else if (result == 4)
            return "IV";
        else if (result == 5)
            return "V";
        else if (result == 6)
            return "VI";
        if (result == 7)
            return "VII";
        else if (result == 8)
            return "VIII";
        else if (result == 9)
            return "IX";
        else if (result == 10)
            return "X";
        else if (result == 20)
            return "XX";
        else if (result == 30)
            return "XXX";
        else if (result == 40)
            return "XL";
        else if (result == 50)
            return "L";
        else if (result == 60)
            return "LX";
        else if (result == 70)
            return "LXX";
        else if (result == 80)
            return "LXXX";
        else if (result == 90)
            return "XC";
        else if (result == 100)
            return "C";

        else if (result > 10 && result < 20)
            return "X" + cong(result - 10);
        else if (result > 20 && result < 30)
            return "XX" + cong(result - 20);
        else if (result > 30 && result < 40)
            return "XXX" + cong(result - 30);
        else if (result > 40 && result < 50)
            return "XL" + cong(result - 40);
        else if (result > 50 && result < 60)
            return "L" + cong(result - 50);
        else if (result > 60 && result < 70)
            return "LX" + cong(result - 60);
        else if (result > 70 && result < 80)
            return "LXX" + cong(result - 70);
        else if (result > 80 && result < 90)
            return "LXXX" + cong(result - 80);
        else if (result > 90 && result < 100)
            return "XC" + cong(result - 90);
        else if (result == 100)
            return "C";
        else
            return "error2";
    }

    public static int rim(String input) {
        String[] example = input.split(" ");
        int a = 0;
        int b = 0;
        String ii = "";
        for (int i = 0; i <= 10; i++) {
            ii = i + "";
            if (ii.equals(example[0]))
                a = i;
        }
        for (int i = 0; i <= 10; i++) {
            ii = i + "";
            if (ii.equals(example[2]))
                b = i;

        }


        if (example[0].equals("I"))
            a = 1;
        else if (example[0].equals("II"))
            a = 2;
        else if (example[0].equals("III"))
            a = 3;
        else if (example[0].equals("IV"))
            a = 4;
        else if (example[0].equals("V"))
            a = 5;
        else if (example[0].equals("VI"))
            a = 6;
        else if (example[0].equals("VII"))
            a = 7;
        else if (example[0].equals("VIII"))
            a = 8;
        else if (example[0].equals("IX"))
            a = 9;
        else if (example[0].equals("X"))
            a = 10;
        else
            return -1;

        if (example[2].equals("I"))
            b = 1;
        else if (example[2].equals("II"))
            b = 2;
        else if (example[2].equals("III"))
            b = 3;
        else if (example[2].equals("IV"))
            b = 4;
        else if (example[2].equals("V"))
            b = 5;
        else if (example[2].equals("VI"))
            b = 6;
        else if (example[2].equals("VII"))
            b = 7;
        else if (example[2].equals("VIII"))
            b = 8;
        else if (example[2].equals("IX"))
            b = 9;
        else if (example[2].equals("X"))
            b = 10;
        else
            return -1;
        if (example[1].equals("+"))
            return a + b;
        else if (example[1].equals("*"))
            return a * b;
        else if (example[1].equals("-"))
            return a - b;
        else if (example[1].equals("/"))
            return a / b;
        else
            return -1;


    }

    public static String arab(String input) {
        String[] example = input.split(" ");
        int a = 0;
        int b = 0;
        String ii = "";
        for (int i = 0; i <= 10; i++) {
            ii = i + "";
            if (ii.equals(example[0]))
                a = i;
        }
        for (int i = 0; i <= 10; i++) {
            ii = i + "";
            if (ii.equals(example[2]))
                b = i;


        }
       if(a < 1 || b < 1)
           return "error4";
       else if(example[1].equals("+"))
            return a + b + "";
       else if(example[1].equals("*"))
           return a * b + "";
       else if(example[1].equals("-"))
           return a - b + "";
       else if(example[1].equals("/"))
            return a / b + "";
       else
       return "Error";
    }

}
