package com.company;

public class Main {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation ? true : false;
    }
    
    public int sumDouble(int a, int b) {
        return a == b ? 2 * (a + b) : a + b;
    }

    public int close10(int a, int b) {
        if (Math.abs(a - 10) < Math.abs(b - 10))
            return a;
        else if (Math.abs(b - 10) < Math.abs(a - 10))
            return b;
        else return 0;
    }

    public String frontBack(String str) {
        if (str.length() == 0)
            return "";
        StringBuilder s = new StringBuilder(str);
        char temp = str.charAt(str.length() - 1);
        s.setCharAt(str.length() - 1, str.charAt(0));
        s.setCharAt(0, temp);
        return s.toString();
    }

    public String notString(String str) {
        if (str.length() < 3)
            return "not " + str;
        return str.toLowerCase().trim().substring(0, 3).equals("not") ? str : "not " + str;

    }

    public static void main(String[] args) {

    }
}
