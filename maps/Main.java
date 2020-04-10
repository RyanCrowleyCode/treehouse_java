package com.teamtreehouse;

import java.util.HashMap;
import java.util.Map;

public class Main {
    // using constants, because it's really easy to have a typo with Strings.
    public static final String BREAKFAST = "breakfast";
    public static final String LUNCH = "lunch";
    public static final String DINNER = "dinner";

    public static void main(String[] args) {
        Map<String, String> meals = new HashMap<>();
        meals.put(BREAKFAST, "Waffles");
        meals.put(LUNCH, "Gyros");
        meals.put(DINNER, "Enchiladas");

        System.out.println(meals);

        System.out.println(meals.get(DINNER));

        String lunch = meals.remove(LUNCH);
        boolean hasLunch = meals.containsKey(LUNCH);
        boolean hasGyros = meals.containsValue("Gyros");
        int size = meals.size();

        System.out.println(meals);
        System.out.println(lunch + " " + hasLunch + " " + hasGyros + " " + size);
    }
}
