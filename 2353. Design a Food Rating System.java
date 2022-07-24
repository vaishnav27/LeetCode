class FoodRatings {

    HashMap<String, TreeMap<Integer, TreeSet<String>>> cuisinesRatingMap;
    HashMap<String, Integer> foodRating;
    HashMap<String, String> foodCuisines;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        cuisinesRatingMap = new HashMap<>();
        foodRating = new HashMap<>();
        foodCuisines = new HashMap<>();

        int n = foods.length;

        for (int i = 0; i < n; i++) {
            if (!cuisinesRatingMap.containsKey(cuisines[i])) {
                cuisinesRatingMap.put(cuisines[i], new TreeMap<>());
            }

            TreeMap<Integer, TreeSet<String>> map = cuisinesRatingMap.get(cuisines[i]);
            if (!map.containsKey(ratings[i]))
                map.put(ratings[i], new TreeSet<>());

            TreeSet<String> set = map.get(ratings[i]);
            set.add(foods[i]);
            map.put(ratings[i], set);

            cuisinesRatingMap.put(cuisines[i], map);

            foodRating.put(foods[i], ratings[i]);
            foodCuisines.put(foods[i], cuisines[i]);
        }
    }

    public void changeRating(String food, int newRating) {
        int oldRating = foodRating.get(food);
        if (oldRating == newRating)
            return;

        String cuisine = foodCuisines.get(food);
        TreeMap<Integer, TreeSet<String>> map = cuisinesRatingMap.get(cuisine);
        TreeSet<String> set = map.get(oldRating);
        set.remove(food);

        if (set.isEmpty()) {
            map.remove(oldRating);
        } else {
            map.put(oldRating, set);
        }

        map = cuisinesRatingMap.getOrDefault(cuisine, new TreeMap<>());
        set = map.getOrDefault(newRating, new TreeSet<>());
        set.add(food);
        map.put(newRating, set);
        foodRating.put(food, newRating);
    }

    public String highestRated(String cuisine) {
        TreeMap<Integer, TreeSet<String>> map = cuisinesRatingMap.get(cuisine);
        int maxRating = map.lastEntry().getKey();
        TreeSet<String> set = map.get(maxRating);
        return set.first();
    }
}
