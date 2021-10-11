package edu.epam.task00.main;

import edu.epam.task00.creator.NumberCreator;
import edu.epam.task00.creator.impl.NumberCreatorImpl;
import edu.epam.task00.entity.CustomNumber;
import edu.epam.task00.exception.ParserException;
import edu.epam.task00.exception.ReaderException;
import edu.epam.task00.exception.ServiceException;
import edu.epam.task00.parser.StringToDoubleParser;
import edu.epam.task00.parser.impl.StringToDoubleParserImpl;
import edu.epam.task00.reader.CustomReadFromFile;
import edu.epam.task00.reader.impl.CustomReadFromFileImpl;
import edu.epam.task00.service.MathFunction;
import edu.epam.task00.service.impl.MathFunctionImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) throws ServiceException {
        NumberCreator creator = new NumberCreatorImpl();
        MathFunction mathFunction = new MathFunctionImpl();
        StringToDoubleParser parser = new StringToDoubleParserImpl();
        CustomReadFromFile reader = new CustomReadFromFileImpl();

        try {
           List<String>  strFile = reader.readStr("data/number.txt");
            List<Double> num = parser.parseString(strFile);

            CustomNumber customNumber1 = creator.create(8);
            CustomNumber customNumber2 = creator.create(2);
            CustomNumber result;
            result = mathFunction.addition(customNumber1, customNumber2);
            result = mathFunction.division(customNumber1, customNumber2);
            result = mathFunction.multiplication(customNumber1, customNumber2);
            result = mathFunction.subtraction(customNumber1, customNumber2);
            result = mathFunction.pow(customNumber1, customNumber2);

        } catch (ReaderException e) {
            e.printStackTrace();
        } catch (ParserException e) {
            e.printStackTrace();
        }


    }
}
