package edu.epam.task00.service;

import edu.epam.task00.entity.CustomNumber;
import edu.epam.task00.exception.ServiceException;

public interface MathFunction {
    public CustomNumber addition(CustomNumber a, CustomNumber b);

    public CustomNumber subtraction(CustomNumber a, CustomNumber b);

    public CustomNumber multiplication(CustomNumber a, CustomNumber b);

    public CustomNumber division(CustomNumber a, CustomNumber b) throws ServiceException;

    public CustomNumber pow(CustomNumber a, CustomNumber b);
}
