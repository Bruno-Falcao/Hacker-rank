package com.hackerRank.monthprep;

public class FlippingBits {

    public static long flippingBits(long n) {

        long total = 0;
        long remaining = n;
        for(int i = 31; i >= 0; i--){
            long current = (long) Math.pow(2, i);
            if( remaining - current < 0 ){
                total += current;
            }
            else{
                remaining -= current;
            }
        }

        return total;
    }

    public static void main(String[] args) {

    }
}
