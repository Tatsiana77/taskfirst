package edu.epam.task00.exception;

public class ParserException extends Exception {
    public ParserException() {
    }

    public ParserException(String message) {
        super(message);
    }

    public ParserException(Exception e) {
        super(e);
    }

    public ParserException(String message, Exception e) {

        super(message, e);
    }
}
