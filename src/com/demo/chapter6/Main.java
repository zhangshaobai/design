package com.demo.chapter6;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   装饰模式:动态地给一个对象添加一些额外地职责，就增加功能来说，装饰模式比生成子类更为灵活
 * @author: zhangpeng
 * @date: 2019/7/30 4:44 PM
 */
public class Main {

    public static void main(String[] args) {
        ComponentPerson person = new ConcreteComponentPerson("小菜");
        DecoratorPerson decorator1 = new ConcreteDecoratorShirt();
        DecoratorPerson decorator2 = new ConcreteDecoratorTrouser();
        decorator1.setComponentPerson(person);
        decorator2.setComponentPerson(decorator1);
        decorator2.show();
    }

}
