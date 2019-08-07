package com.demo.chapter27;

import java.util.ArrayList;
import java.util.List;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   解释器模式(interpreter):给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子
 * @author: zhangpeng
 * @date: 2019/8/6 8:30 PM
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());

        for(AbstractExpression expression : list) {
            expression.interpret(context);
        }

    }
}
