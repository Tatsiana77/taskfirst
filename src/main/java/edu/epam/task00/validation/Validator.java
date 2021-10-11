package edu.epam.task00.validation;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final String STRING_AS_DIGITAL_REX = "-?\\d\\d*(\\.\\d+)?";

    public static boolean validate(String param) {
        Pattern pattern = Pattern.compile(STRING_AS_DIGITAL_REX);
        Matcher matcher = pattern.matcher( param);

        return matcher.matches();
    }
}
