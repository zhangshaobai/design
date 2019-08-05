package com.demo.chapter19;

import java.util.ArrayList;
import java.util.List;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/5 3:57 PM
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        StringBuffer mark = new StringBuffer();
        for(int i = 0 ; i < depth ; i ++) {
            mark.append("-");
        }
        System.out.println(mark.append(this.getName()));
        for (Component component: children) {
            component.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Component component: children) {
            component.lineOfDuty();
        }
    }
}
