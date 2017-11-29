package de.fhro.inf.prg3.a08.filtering;

import java.util.LinkedList;
import java.util.List;

import de.fhro.inf.prg3.a08.model.Meal;

/**
 * Created by dan on 11/29/17.
 */

abstract class FilterBase implements MealsFilter {
    @Override
    public List<Meal> filter(List<Meal> meals) {
        List<Meal> returnList = new LinkedList<>();
        for( Meal meal : meals){
            if(include(meal)) returnList.add(meal);
        }
        return returnList;
    }
    protected abstract boolean include(Meal meal);
}
