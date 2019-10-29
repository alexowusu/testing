package io.sub.testing;

public class Numbers {
    public static int sum(int num1, int num2) {
        return num1 + num2;

    }

    public static boolean ispositive(int num) {
        if (num <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isnegative(int num) {
        if (num > 0) {
            return false;
        } else {
            return true;
        }

    }
}
