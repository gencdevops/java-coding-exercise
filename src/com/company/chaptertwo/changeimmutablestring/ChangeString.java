//package com.company.chaptertwo.changeimmutablestring;
//
//import java.lang.reflect.Field;
//
//public class ChangeString {
//    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        String user = "guest";
//        System.out.println("User is of type: " + user);
//
//        Class<String> type = String.class;
//        Field field = type.getDeclaredField("value");
//        field.setAccessible(true);
//
//        char[] chars = (char[]) field.get(user);
//
//        chars[0] = 'a';
//        chars[1] = 'd';
//        chars[2] = 'm';
//        chars[3] = 'i';
//        chars[4] = 'n';
//
//        System.out.println("User is of type: " + user);
//
//
//    }
//}
