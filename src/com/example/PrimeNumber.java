package com.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    private Integer n;

    public static List<Integer> findPrimeNum(int n) {
        boolean[] arr = new boolean[n+1];
        List<Integer> integerList = new ArrayList<>();
        //int[] arrNum = new int[n+1];
        for(int p=2; p*p<=n; p++) {
            if(!arr[p]) {
                for(int q=p*p; q<=n; q++) {
                    if(q%p == 0) {
                        arr[q] = true;
                    }
                }
            }

        }
        //System.out.println(Arrays.toString(arr));
        for(int i=2; i<arr.length; i++) {
            if(!arr[i]) {
                integerList.add(i);
            }
        }
        return integerList;
    }

}