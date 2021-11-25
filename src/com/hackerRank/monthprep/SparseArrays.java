package com.hackerRank.monthprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> ms = new ArrayList<>();

        for (int i = 0; i < queries.size(); i++) {
            Integer matches = 0;
            for (String str : strings) {
                if (queries.get(i).equals(str)) {
                    matches++;
                }
            }
            ms.add(matches);
        }

        return ms;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ab", "ab", "abc");
        List<String> queries = Arrays.asList("ab", "abc", "bc");


        System.out.println(matchingStrings(strings, queries));
    }
}
