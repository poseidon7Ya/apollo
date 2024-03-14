package com.moon.algorithm.base;

import com.moon.algorithm.base.search.Search;
import com.moon.algorithm.base.sort.Sort;
import com.moon.algorithm.offer.SingleNonDuplicate70;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
//        int[] a = new int[]{6, 5, 4, 3, 1, 2, 0, 11, 12, 23};
        int[] b = new int[]{5, 6, 7, 5, 4, 3, 2, 1};
        int[] c = new int[]{1, 1, 2, 2, 3, 3, 4, 5, 5};
//        sort(new QuickSort(), a);
//        sort2(a);
        biS(new SingleNonDuplicate70(), c, 0);
    }

    public static void biS(Search search, int[] a, int target) {
        System.out.println(search.search(a, target));
    }

    public static void sort(Sort sort, int[] a) {
        System.out.println("====================sort1====================");
        sort.sort(a);
        print(a);
    }

    public static void sort2(int[] a) {
        Arrays.sort(a);
        System.out.println("====================Arrays.sort()====================");
        print(a);
    }

    public static void print(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
