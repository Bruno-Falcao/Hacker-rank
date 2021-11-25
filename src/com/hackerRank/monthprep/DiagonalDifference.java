package com.hackerRank.monthprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int topleftToBottomRight = 0;
        int topRightToBottomLeft = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == j)
                    topleftToBottomRight += arr.get(i).get(i);
            }
            topRightToBottomLeft += arr.get(i).get(arr.get(i).size() - i - 1);
        }
        return Math.abs(topleftToBottomRight - topRightToBottomLeft);

    }


    public static void main(String[] args) {

        List<Integer> listaDoItalo = Arrays.asList(1, 4, 9);
        List<Integer> listaDoItalo2 = Arrays.asList(2, 5, 8);
        List<Integer> listaDoItalo3 = Arrays.asList(3, 6, 9);
        List<List<Integer>> listaDaListaDoItalo = new ArrayList<>();
        listaDaListaDoItalo.add(listaDoItalo);
        listaDaListaDoItalo.add(listaDoItalo2);
        listaDaListaDoItalo.add(listaDoItalo3);

        System.out.println(diagonalDifference(listaDaListaDoItalo));
    }
}
