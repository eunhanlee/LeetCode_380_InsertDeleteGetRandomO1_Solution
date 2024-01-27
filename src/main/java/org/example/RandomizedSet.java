package org.example;

import java.util.*;


class RandomizedSet {
    // The list to store elements of the set
    List<Integer> list;

    //The map to store elements and their corresponding indices
    Map<Integer, Integer> map;

    // The Random object for generating random indices
    Random rand;

    /**
     * Constructs a new RandomizedSet object.
     * Initializes the list, map, and Random object.
     */
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }

    /**
     * Inserts a value into the set.
     * Returns true if the value was successfully inserted (i.e., not a duplicate), false otherwise.
     * @param val The value to be inserted into the set
     * @return true if the value was successfully inserted, false otherwise
     */
    public boolean insert(int val) {
        if (map.containsKey(val)) return false;

        list.add(val);
        map.put(val, list.size() - 1);

        return true;
    }

    /**
     * Removes a value from the set.
     * Returns true if the value was successfully removed, false otherwise (i.e., the value was not found in the set).
     * @param val The value to be removed from the set
     * @return true if the value was successfully removed, false otherwise
     */
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;

        int tempIndex = map.get(val);
        int tempContent = list.get(list.size() - 1);

        map.put(tempContent, tempIndex);
        list.set(tempIndex, tempContent);

        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    /**
     * Retrieves a random element from the set.
     * @return A random element from the set
     */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}
