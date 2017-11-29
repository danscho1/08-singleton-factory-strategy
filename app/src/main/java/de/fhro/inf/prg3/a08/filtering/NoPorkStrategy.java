package de.fhro.inf.prg3.a08.filtering;

import de.fhro.inf.prg3.a08.model.Meal;

/**
 * Created by dan on 11/29/17.
 */

class NoPorkStrategy extends FilterBase {
    @Override
    protected boolean include(Meal meal) {
        boolean containsPork = false;
        for(String s : meal.getNotes()){
           containsPork = containsPork || s.contains("schwein");
        }
        return !containsPork;
    }
}
