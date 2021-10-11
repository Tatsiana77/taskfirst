package edu.epam.task00.exception;

import java.io.IOException;

public class ReaderException extends Exception{
    public ReaderException() {
    }

    public ReaderException(String message) {
        super(message);
    }

    public ReaderException(String message, IOException e) {
        super(message, e);
    }

    public ReaderException(IOException e) {
        super(e);
    }
}
