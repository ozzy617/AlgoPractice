package com.RecursionSatckRepres;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Element {


    public static void main(String[] args) {
        Integer returnedValue = null;
        Integer START_FROM = 4;

        ArrayList<Map<String, Integer>> stack = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("n" , 5); map.put("prevfac", -1); map.put("labelfrom",0 );
        stack.add(map);
        while (!stack.isEmpty()) {
            Map<String, Integer> localvars = stack.getLast();
            Integer labelfrom = localvars.get("labelfrom");
            if (labelfrom == 0) {
                if (localvars.get("n") == 1) {
                    returnedValue = 1;
                    stack.removeLast();
                    continue;
                }
                localvars.put("labelfrom", 1);
                map = new HashMap<>();
                map.put("n", localvars.get("n") - 1); map.put("prevfac", -1); map.put("labelfrom", 0);
                stack.add(map);
                continue;
            }
            if (labelfrom == 1) {
                localvars.put("prevfac", returnedValue);
                returnedValue = localvars.get("n") * localvars.get("prevfac");
                stack.removeLast();
            }
        }
        System.out.println("Result: " + returnedValue);
    }
}
