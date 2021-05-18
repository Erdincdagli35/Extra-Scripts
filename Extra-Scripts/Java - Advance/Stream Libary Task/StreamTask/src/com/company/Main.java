package com.company;

import com.company.parameters.Filter;
import com.company.parameters.Foreach;
import com.company.parameters.Map;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String []args){
        System.out.println("Hello Stream Example");
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        Filter filter = new Filter();
        System.out.print("Results : ");
        System.out.print("\nFilter : ");
        System.out.print("\n------------");
        System.out.print("\ncountNonEmpty(strings) : " + filter.countNonEmpty(strings));
        System.out.print("\ncountCharE(strings) : " + filter.countCharEOrA(strings));
        System.out.print("\ncountStartWithA(strings) : " + filter.countStartWithA(strings));

        Map map1 = new Map(1L,"Erdinç");
        Map map2 = new Map(2L,"Can");
        List<Map> maps = Arrays.asList(map1,map2);

        System.out.print("\nMap : ");
        System.out.print("\n------------");
        System.out.print("\ngetByName(map) : " + map1.getByName(maps));
        System.out.print("\ngetById(map) : " + map1.getById(maps));

        Foreach foreach = new Foreach();
        List<String> stringsForForeach = Arrays.asList("abc", "", "bc");
        System.out.print("\nMap : ");
        System.out.print("\n------------");
        System.out.print("\nprintList(strings) : \n");
        foreach.printList(stringsForForeach);
    }
}