package com.demo.chapter18;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/5 12:08 PM
 */
public class Originator {
    private Integer hp;
    private Integer attack;
    private Integer defense;

    public Memento createMemento() {
        return new Memento(hp, attack, defense);
    }

    public void setMemento(Memento memento) {
        this.hp = memento.getHp();
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
    }

    public void initState() {
        this.hp = 100;
        this.attack = 200;
        this.defense = 300;
    }

    public void attackBoss() {
        this.hp = 0;
        this.attack = 100;
        this.defense = 200;
    }

    public void showState() {
        System.out.println("当前状态:");
        System.out.println("hp:" + this.hp);
        System.out.println("attack:" + this.attack);
        System.out.println("defense:" + this.defense);
    }


    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }
}
