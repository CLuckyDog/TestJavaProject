package com.rh.test;

import com.rh.view.GasDeviceView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static com.sun.xml.internal.fastinfoset.util.ValueArray.MAXIMUM_CAPACITY;

public class Test1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("1","1");
        map.put("2","2");

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.equals("2")){
                iterator.remove();
            }
        }
    }

    private static int roundUpToPowerOf2(int number) {
        // assert number >= 0 : "number must be non-negative";
        return number >= MAXIMUM_CAPACITY
                ? MAXIMUM_CAPACITY
                : (number > 1) ? highestOneBit((number - 1) << 1) : 1;
    }

    public static int highestOneBit(int i) {
        System.out.println("i:"+i);
        // HD, Figure 3-1
        i |= (i >>  1);
        System.out.println("i |= (i >>  1):"+i);
        i |= (i >>  2);
        System.out.println("i |= (i >>  2):"+i);
        i |= (i >>  4);
        System.out.println("i |= (i >>  4):"+i);
        i |= (i >>  8);
        System.out.println("i |= (i >>  8):"+i);
        i |= (i >> 16);
        System.out.println("i |= (i >>  16):"+i);
        return i - (i >>> 1);
    }

    static final int tableSizeFor(int cap) {
        System.out.println("cap:"+cap);
        //假设 cap = 10
        int n = cap - 1;//n = 10 -1 = 9 转换为2进制是：0b1001
        n |= n >>> 1;//n = 0b1001 | 0b0100 = 0b1101
        n |= n >>> 2;//n = 0b1101 | 0b0011 = 0b1111
        n |= n >>> 4;//n = 0b1111 | 0b0000 = 0b1111
        n |= n >>> 8;//n = 0b1111 | 0b0000 = 0b1111
        n |= n >>> 16;//n = 0b1111 | 0b0000 = 0b1111  转换成10进制是：15
        //经过计算，n值为15，所以返回15+1=16
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
