package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<String> countries=new ArrayList<>();
        countries.add("India");
        countries.add("South Africa");
        countries.add("England");
        countries.add("Australia");
        System.out.println(countries.size());
        System.out.println(countries);
        countries.remove("South Africa");
        System.out.println(countries);

    }
}
