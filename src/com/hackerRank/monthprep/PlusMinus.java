package com.hackerRank.monthprep;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        double pos = 0;
        double neg = 0;
        double zero = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                pos++;
            } else if (arr.get(i) < 0) {
                neg ++;
            } else if (arr.get(i) == 0){
                zero++;
            }
        }

        System.out.printf("%,.6f%n", pos / arr.size());
        System.out.printf("%,.6f%n", neg / arr.size());
        System.out.printf("%,.6f%n", zero / arr.size());

    }

    public static void main(String[] args) {
        List<Integer> listaDoItalo = new ArrayList();
        listaDoItalo.add(-4);
        listaDoItalo.add(3);
        listaDoItalo.add(-9);
        listaDoItalo.add(0);
        listaDoItalo.add(4);
        listaDoItalo.add(1);

        plusMinus(listaDoItalo);
    }
}
