package edu.epam.task00.parser;

import edu.epam.task00.exception.ParserException;

import java.util.List;

public interface StringToDoubleParser {
    public List<Double> parseString(List<String> strLine) throws ParserException;

}
