package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUtility {
    List<Integer> lu;
    public ListUtility() {
        lu = new ArrayList<>();
    }

    public Boolean add(Integer i) {
        return lu.add(i);
    }

    public Integer size() {
        return lu.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> set = new HashSet<>(lu);
        List<Integer> lu2 = new ArrayList<>(set);
        return lu2;
    }

    public String join() {
        String listString = lu.toString();
        return listString.substring(1, listString.length() - 1);
    }

    public Integer mostCommon() {
        Integer[] iArray = lu.toArray(new Integer[0]);
        return ArrayUtility.mostCommon(iArray);
    }

    public Boolean contains(Integer valueToAdd) {
        return lu.contains(valueToAdd);}

}
