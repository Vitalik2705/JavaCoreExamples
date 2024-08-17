package org.example.livecodingtasks;

public class ReverseInteger {
    public static int reverseInteger(int num) {
        int revNum = 0;
        while (num > 0) {
            revNum = revNum * 10 + num % 10;
            num = num / 10;
        }

        return revNum;
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(123056));
    }
}
