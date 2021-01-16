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
        String[] text = new String[10];
        text[0] = "Dash: her text";
        text[1] = "Masha: textOFMasha";
        text[2] = "Grisha: Hello World!";
        text[3] = "Никита: введите имя";
        text[4] ="Masha: textOFMasha";
        text[5] = "Dash: her text";
        text[6] = "Grisha:";


        groupByRole(text);
     }
}
