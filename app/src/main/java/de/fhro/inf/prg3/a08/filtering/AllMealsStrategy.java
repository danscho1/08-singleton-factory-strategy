package de.fhro.inf.prg3.a08.filtering;

import java.util.List;

import de.fhro.inf.prg3.a08.model.Meal;

/**
 * Created by dan on 11/29/17.
 */

class AllMealsStrategy implements MealsFilter {
    @Override
    public List<Meal> filter(List<Meal> meals) {
        return meals;
    }
}
