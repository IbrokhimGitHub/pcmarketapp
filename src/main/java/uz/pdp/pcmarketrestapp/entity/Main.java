package uz.pdp.pcmarketrestapp.entity;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        Product product=new Product();
        product.setBrand("samsung");
        Field [] fields=product.getClass().getFields();
        Field field=product.getClass().getDeclaredField("brand");
        field.setAccessible(true);
        Class<?> type = field.getType();
        Object o = type.newInstance();
        Object o1 = field.get(o);
        System.out.println(o1);

    }
}
