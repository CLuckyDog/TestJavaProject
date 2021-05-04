package com.rh.test;

/**
 * Created by Administrator on 2020/4/4.
 */
public class TestStatic {

    public static void test(){
        x=10;
        System.out.println("bbbbbbbbbbbb");
    }
    public static int x;
    static {
        System.out.println("aaaaaaaaaaaaaaaaa");
        System.out.println("xxxx="+x);
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        TestStatic.test();
//        Class.forName("com.rh.test.TestStatic");

        String num="99.99";
        double fnum=Double.parseDouble(num);
        System.out.println("fnum:"+fnum);

        byte numb = (byte) Integer.parseInt("10",2);
        System.out.println(numb);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(2));

    }
}
