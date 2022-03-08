package com.engim;

import java.util.ArrayList;

public class EsempioArrayList {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add("hello");
        array.add("world");
        array.add("leone");
        System.out.println(array);
        array.remove(1);
        System.out.println(array);

    }
}
