package com.company;

import java.util.ArrayList;

public class equalsTestImpl {
    public void test(userClass user) {
        System.out.println(user.getEvent().equals(equalsTest.event));
    }

    public void testArrayList() {
        // 创建一个数组
        ArrayList<String> sites = new ArrayList<>();

        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        System.out.println("网站列表: " + sites);


        // 查找位置索引值为 Runoob 的元素
        int position1 = sites.indexOf("Runoob");
        System.out.println("Runoob 的索引位置: " + position1);

        System.out.println("Taobao 的索引位置: " + sites.indexOf("Taobao"));
        // 查找位置索引值为 Weibo 的元素
        int position2 = sites.indexOf("Weibo");
        System.out.println("Weibo 的索引位置: " + position2);
    }

    public void splitTest() {
        String str2 = new String("www/runoob/com");
        System.out.println("www/runoob/com  转义字符\"/\"返回值 :");
        for (String retval : str2.split("\\/", 3)) {
            System.out.println(retval);
        }
    }
}
