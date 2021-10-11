package edu.epam.task00.parser.impl;

import edu.epam.task00.exception.ParserException;
import edu.epam.task00.parser.StringToDoubleParser;
import edu.epam.task00.validation.Validator;

import java.util.ArrayList;
import java.util.List;

public class StringToDoubleParserImpl implements StringToDoubleParser {

    @Override
    public List<Double> parseString(List<String> strLine) throws ParserException {

        List<Double> doubleList= new ArrayList<>();

        if (!strLine.isEmpty()) {
            for (String currentLine : strLine) {
                if (Validator.validate(currentLine)) {
                   Double temp = Double.parseDouble(currentLine);
                    doubleList.add(temp);
                }
            }
        }

        return doubleList;
    }
}

