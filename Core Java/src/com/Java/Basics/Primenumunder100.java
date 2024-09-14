package com.Java.Basics;

public class Primenumunder100 {
    public static void main(String[] args) {
        // Loop through numbers from 2 to 100
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true; // Assume the number is prime

            // Check if the number is divisible by any number from 2 to sqrt(i)
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false; // If divisible, then it's not a prime number
                    break; // No need to check further
                }
            }

            // If isPrime is still true, then i is a prime number
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}



