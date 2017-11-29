package de.fhro.inf.prg3.a08.filtering;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dan on 11/29/17.
 */

public abstract class MealsFilterFactory {
    private static final Map<String, MealsFilter> keymap = new HashMap<>();

    static {
        keymap.put("All", new AllMealsStrategy());
        keymap.put("Vegetarian", new VegetarianStrategy());
        keymap.put("No pork", new NoPorkStrategy());
        keymap.put("No soy", new NoSoyStrategy());
    }
    public static MealsFilter getStrategy(String key) {
        return keymap.get(key);
    }
}
