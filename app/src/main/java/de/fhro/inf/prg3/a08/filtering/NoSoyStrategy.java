package de.fhro.inf.prg3.a08.filtering;

import de.fhro.inf.prg3.a08.model.Meal;

/**
 * Created by dan on 11/29/17.
 */

class NoSoyStrategy extends FilterBase {
    @Override
    protected boolean include(Meal meal) {
        boolean containsSoy = false;
        for(String s : meal.getNotes()){
           containsSoy = containsSoy || s.contains("soja");
        }
        return !containsSoy;
    }
}
