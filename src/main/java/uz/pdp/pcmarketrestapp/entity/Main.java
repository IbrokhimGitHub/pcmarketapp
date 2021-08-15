package uz.pdp.pcmarketrestapp.entity;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map <String,String> params =new HashMap<>();
        params.put("speed","350,700,500,750");
        params.put("ram","4GB,8GB,16GB,32GB");
        params.put("inch","13,14,15,17");

        Set<String> keySet = params.keySet();
        Collection<String> values = params.values();
        String strValues="";
        for (String value : values) {
            strValues+=value+",";
        }
        strValues = strValues.substring(0, strValues.length() - 2);
        String[] split = strValues.split(",");


        String keyString="property in ('";
        String valueString="value in ('";
        for (String key : keySet) {
           keyString+=key+"', '";
        }
        keyString=keyString.substring(0,keyString.length()-2)+")";
        System.out.println(keyString);
        for (String value : split) {
           valueString+=value+"', '";
        }
        valueString=valueString.substring(0,valueString.length()-2)+")";
        System.out.println(valueString);

    }
}
