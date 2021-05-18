package com.company.parameters;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    //count Non Empty
    public Long countNonEmpty(List<String> str){
        Long countNonEmpty = str.stream().
                filter(s -> !s.isEmpty())
                .count();
        return countNonEmpty;
    }

    //count Char E or A
    public Long countCharEOrA(List<String> str){
        Long countE = str.stream().
                filter(s -> s.contains("e") || s.contains("a")).
                count();
        return countE;
    }

    //count Char E or A
    public List<String> countStartWithA(List<String> str){
        List<String> countE = str.stream().
                filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());
        return countE;
    }
}
