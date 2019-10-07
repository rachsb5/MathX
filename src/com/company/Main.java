package com.company;

public class Main {

    public static int swap(int x) {
        int a = x%10;
        int b = x%100/10;
        int c = x/100;
        int d = c*100 + a*10 + b;
        return d;
    }

    public static void main(String[] args) {
	// write your code here
        int x = swap(123);
        int y = swap(567);
        System.out.println(x);
        System.out.println(y);
    }
}
