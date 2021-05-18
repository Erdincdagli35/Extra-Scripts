package com.company.parameters;

import java.util.List;

public class Foreach {

    public void printList(List<String> str){
        str.stream().forEach((p) -> {
            System.out.print(p+" ");
        });
    }
}
