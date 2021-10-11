package edu.epam.task00.reader.impl;

import edu.epam.task00.exception.ReaderException;
import edu.epam.task00.reader.CustomReadFromFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CustomReadFromFileImpl implements CustomReadFromFile {

    static Logger logger = LogManager.getLogger();

    @Override
    public List<String> readStr(String pathFile) throws ReaderException {

        BufferedReader bufferedReader;
        ArrayList<String> stringList = null;
        try (FileReader fileReader = new FileReader(new File(pathFile))) {
            bufferedReader = new BufferedReader(fileReader);
            stringList = new ArrayList<>();
            bufferedReader.lines().forEach(stringList::add);

        } catch (FileNotFoundException e) {
            logger.error("File " + pathFile + " was't found.", e);
            throw new ReaderException("File " + pathFile + " was 't found", e);
        } catch (IOException e) {
            logger.error(" ",e);
            throw new ReaderException("");
        }
        return stringList;
    }
}

