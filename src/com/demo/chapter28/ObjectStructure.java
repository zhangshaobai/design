package com.demo.chapter28;

import java.util.ArrayList;
import java.util.List;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/7 2:37 PM
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for(Element element : elements) {
            element.accept(visitor);
        }
    }

}
