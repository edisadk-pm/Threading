package _03_PrimeFinder;

import java.util.Timer;

public class _03_01_Primefinder {
    public static void main(String[] args) {

        Thread thread1 = new Thread(
                () -> {
                    for (int i = 0; i < 100; i++) {
                        if (isPrime(i)) {
                            System.out.println(i);
                        }
                    }
                }
        );
        thread1.start();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
