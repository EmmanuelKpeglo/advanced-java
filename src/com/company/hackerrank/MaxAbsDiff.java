package com.company.hackerrank;
import java.util.*;

public class MaxAbsDiff {
    private int[] elements;
    public int maximumDifference;

    public MaxAbsDiff(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference () {
        List<Integer> listOfAbsoluteDifferences = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            for (int j = i+1; j < elements.length; j++){
                listOfAbsoluteDifferences.add(Math.abs(elements[j] - elements[i]));
            }
        }

        maximumDifference = listOfAbsoluteDifferences.stream().max(Integer::compare).get();
    }

};


