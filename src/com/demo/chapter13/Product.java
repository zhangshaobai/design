package com.demo.chapter13;

import java.util.ArrayList;
import java.util.List;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/31 6:01 PM
 */
public class Product {
    private List<String> list = new ArrayList<>();

    public void add(String part) {
        list.add(part);
    }

    public void show() {
        for(String part : list) {
            System.out.println(part);
        }
    }
}
