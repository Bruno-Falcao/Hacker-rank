package com.hackerRank.monthprep;

import java.util.List;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {

        int res = 0;

        for (int x : a) {
            res = res ^ x;
        }

        return res;
    }


    public static void main(String[] args) {
//        List<Integer> listaDoItalo = Arrays.asList(1, 2, 3, 4, 3, 2, 1);


//        System.out.println(lonelyinteger(listaDoItalo));

        int a = 25;
        int b = 15;

        System.out.println();


    }
}
