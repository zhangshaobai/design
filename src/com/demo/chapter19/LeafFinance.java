package com.demo.chapter19;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/5 4:12 PM
 */
public class LeafFinance extends Component {

    public LeafFinance(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void display(int depth) {
        StringBuffer mark = new StringBuffer();
        for(int i = 0 ; i < depth ; i ++) {
            mark.append("-");
        }
        System.out.println(mark.append(this.getName()));
    }

    @Override
    public void lineOfDuty() {
        System.out.println(this.getName() + "公司财务收支管理");
    }
}
