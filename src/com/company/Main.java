package com.company;

public class Main {

    public static int swap(int x) {
        int a = x%10;
        int b = x%100/10;
        int c = x/100;
        int d = c*100 + a*10 + b;
        return d;
    }

    private static void timeLeft(int curHour, int curMin, int depHour, int depMin) {
        curHour = 60 * curMin;
        System.out.println(timeLeft(1,15,4,36));
    }

    public static void main(String[] args) {
	// write your code here
        int x = swap(123);
        int y = swap(567);
        System.out.println(x);
        System.out.println(y);
        int e = 1;

        timeLeft(1,15,4,36);
        timeLeft(1,38,8,20);
    }
}