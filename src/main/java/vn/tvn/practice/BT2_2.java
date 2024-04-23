package vn.tvn.practice;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class BT2_2 {
//    2.2. Write a java method to compare
//    two String and return boolean
//    Ex data input
//    String a = "test java" vs String b = null
//    String c = null vs String d = "test java"

//    Research google về StringUtils, Objects, String  để
//    viết 3 method khác nhau. --> cái nào nên dùng

    public static boolean compareString(String st1, String st2){
        return st1.equals(st2);
    }

    public static boolean compareStringObject(String st1, String st2){
        var result = Objects.equals(st1, st2);
        return result;
    }

    public static boolean compareStringStringUtils(String st1, String st2){
        var result = StringUtils.equals(st1, st2);
        return result;
    }

    public static void main(String[] args) {
        String a = "test java";
        String b = null;
        var rs1 = compareString(a, b);
        System.out.println("rs1: " +rs1);

        String c = null;
        String d = "test java";
        var rs2 = compareStringStringUtils(c, d);
        System.out.println(rs2);
    }

}
