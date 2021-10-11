package edu.epam.task00.creator.impl;

import edu.epam.task00.creator.NumberCreator;
import edu.epam.task00.entity.CustomNumber;

public class NumberCreatorImpl implements NumberCreator {
    @Override
    public CustomNumber create(double number) {
        CustomNumber customNumber = new CustomNumber(number);
        return customNumber;
    }
}
