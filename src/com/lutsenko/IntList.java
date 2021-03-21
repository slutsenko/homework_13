package com.lutsenko;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class IntList {
    private int[] arr = new int[0];


    public void add(int value) {
        int[] tempArr = Arrays.copyOf(arr, arr.length + 1);
        tempArr[arr.length] = value;
        arr = tempArr;

    }


    public int get(int index) {
        for (int i = 0; i < arr.length; i++) {
            if (index == i) {
                System.out.println(arr[i]);
            }
        }
        return 0;
    }

    public void set(int index, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (index == i) {
                arr[i] = value;
            }
        }
    }

    public int size() {
        System.out.println(arr.length);
        return 0;
    }

    @Override
    public String toString() {
        System.out.println(Arrays.toString(arr));
        return "";
    }
}
