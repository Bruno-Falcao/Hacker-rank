package com.hackerRank.monthprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        long max = 0;
        long min = 0;
        int c = 0;

        Collections.sort(arr);
            for (int i = 1; i < arr.size(); i++) {
                max += arr.get(i);
                c++;
            }
            for (int i = 0; i < arr.size() - 1; i++) {
                min += arr.get(i);
            }

        if (c == 5 || c == 4) {
            System.out.println(min + " " + max);
        }

    }

    public static void main(String[] args) {

        List<Integer> listaDoItalo = new ArrayList();
        listaDoItalo.add(1);
        listaDoItalo.add(2);
        listaDoItalo.add(3);
        listaDoItalo.add(4);
        listaDoItalo.add(5);

        Collections.sort(listaDoItalo);

        miniMaxSum(listaDoItalo);
    }
}
