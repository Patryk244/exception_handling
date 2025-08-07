package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String done = secondChallenge.probablyIWillThrowException(1.5, 1.0);
            System.out.println(done);
        } catch (Exception e) {
            System.out.println("Invalid data " + e.getMessage());
        } finally {
            System.out.println("Code is done");
        }

    }
}
