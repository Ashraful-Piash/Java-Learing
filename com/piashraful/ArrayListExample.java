package com.piashraful;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String > names = new ArrayList<>();
        names.add("Piash");
        names.add("jerin");
        names.add("Aisha");
//        System.out.println(name);

        for(String name: names){
            System.out.println(name);
        }
    }
}
