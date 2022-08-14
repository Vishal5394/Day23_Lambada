package com.Bridgelabz.Lambda;

public class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }

    public enum ExpectedException {
        ;

        public static ExpectedException none() {
            return null;
        }

        public void expect(Class<InvalidUserException> invalidUserExceptionClass) {
        }
    }

}
