package edu.epam.task00.reader;

import edu.epam.task00.exception.ReaderException;

import java.util.List;

public interface CustomReadFromFile {
    public List<String> readStr (String StrFile) throws ReaderException;
}
