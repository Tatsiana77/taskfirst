package edu.epam.task00.service.impl;

import edu.epam.task00.creator.NumberCreator;
import edu.epam.task00.creator.impl.NumberCreatorImpl;
import edu.epam.task00.entity.CustomNumber;
import edu.epam.task00.exception.ServiceException;
import edu.epam.task00.service.MathFunction;

public class MathFunctionImpl implements MathFunction {

    public static NumberCreator creator = new NumberCreatorImpl();

    @Override
    public CustomNumber addition(CustomNumber a, CustomNumber b) {
        double sum = Double.sum(a.getNumber(), b.getNumber());
        return creator.create(sum);
    }

    @Override
    public CustomNumber subtraction(CustomNumber a, CustomNumber b) {
        double sub = a.getNumber() - b.getNumber();
        return creator.create(sub);
    }

    @Override
    public CustomNumber multiplication(CustomNumber a, CustomNumber b) {
        double multiply = a.getNumber() * b.getNumber();
        return creator.create(multiply);
    }

    @Override
    public CustomNumber division(CustomNumber a, CustomNumber b) throws ServiceException {
        if (b.getNumber() == 0.0) {
            throw new ServiceException("Division by zero.");
        }
        double div = a.getNumber() / b.getNumber();
        return creator.create(div);
    }

    @Override
    public CustomNumber pow(CustomNumber a, CustomNumber b) {
        double powNum = Math.pow(a.getNumber(), b.getNumber());
        return creator.create(powNum);
    }
}
