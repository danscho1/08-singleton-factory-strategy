package de.fhro.inf.prg3.a08.filtering;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import de.fhro.inf.prg3.a08.model.Meal;

/**
 * Created by dan on 11/29/17.
 */

class VegetarianStrategy extends FilterBase {
    @Override
    protected boolean include(Meal meal) {
        return !Pattern.compile(".*([Ff]leisch)|([Gg]ulasch)|([Rr]ind)|([Hh]ähnchen)|([Gg]eflügel]).*").
                matcher(meal.toString()).find();
    }
}
