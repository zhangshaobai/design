package com.demo.chapter19;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   组合模式:将对象组合成树形结构以表示'部分-整体'的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性
 * @author: zhangpeng
 * @date: 2019/8/5 2:45 PM
 */
public class Main {
    public static void main(String[] args) {
        Component root = new Composite("北京总公司");
        root.add(new LeafHr("总公司人力资源部"));
        root.add(new LeafFinance("总公司财务部"));

        Component comp = new Composite("上海华东分公司");
        comp.add(new LeafHr("华东分公司人力资源部"));
        comp.add(new LeafFinance("华东分公司财务部"));
        root.add(comp);

        Component comp1 = new Composite("南京办事处");
        comp1.add(new LeafHr("南京办事处人力资源部"));
        comp1.add(new LeafFinance("南京办事处财务部"));
        comp.add(comp1);

        Component comp2 = new Composite("杭州办事处");
        comp2.add(new LeafHr("杭州办事处人力资源部"));
        comp2.add(new LeafFinance("杭州办事处财务部"));
        comp.add(comp2);

        System.out.println("结构图:");
        root.display(1);

        System.out.println("职责:");
        root.lineOfDuty();
    }
}
