package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        userClass user = new userClass();
        user.setEvent("BIZ_TRANSFER");
        equalsTestImpl equalsTest = new equalsTestImpl();
        equalsTest.test(user);


        // 创建ArrayList
        ArrayList list = new ArrayList();

        // 将“”
        list.add("1");
        list.add("66");
        list.add("55");
        list.add("4");
        list.add("999");
        // 将下面的元素添加到第1个位置
        list.add(0, "5");

        // 获取第1个元素
        System.out.println("the first element is: " + list.get(0));
        // 删除“3”
        list.remove("3");
        // 获取ArrayList的大小
        System.out.println("Arraylist size=: " + list.size());
        // 判断list中是否包含"3"
        System.out.println("ArrayList contains 3 is: " + list.contains(3));
        // 设置第2个元素为44
        list.set(1, "44");

        // 通过Iterator遍历ArrayList
        for (Iterator iter = list.iterator(); iter.hasNext(); ) {
            System.out.println("next is: " + iter.next());
        }
        equalsTest.testArrayList();
        equalsTest.splitTest();
    }


}
