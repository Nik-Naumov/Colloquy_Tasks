package com.company;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    static void groupByRole(String[] text){
        Map<String,String> map = new HashMap<>();
        int count = 0;
        for(String i: text){
            count++;
            if(i==null){
                continue;
            }
            String role = i.substring(0,i.indexOf(":")+1);
            String textOfRole;
            if (i.length() <= role.length()){
                 textOfRole = i.substring(i.indexOf(":")+1);
            }else{
                textOfRole = i.substring(i.indexOf(":")+2);
            }
            if(map.containsKey(role)){
                map.put(role,map.get(role)+"\n"+count+")"+textOfRole);
            }else{
                map.put(role,count+")"+textOfRole);
            }
        }
        for (String i: map.keySet()){
            System.out.println(i);
            System.out.println(map.get(i));
        }
    }
    public static void main(String[] args) {
        String[] strs = new String[10];
        strs[0] = "Dash: her text";
        strs[1] = "Masha: textOFMasha";
        strs[2] = "Grisha: Hello World!";
        strs[3] = "Никита: введите имя";
        strs[4] ="Masha: textOFMasha";
        strs[5] = "Dash: her text";
        strs[6] = "Grisha:";


        groupByRole(strs);
        System.out.println("newS");
     }
}
