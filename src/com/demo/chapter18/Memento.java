package com.demo.chapter18;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/5 12:05 PM
 */
public class Memento {
    private Integer hp;
    private Integer attack;
    private Integer defense;

    public Memento(int hp, int attack, int defense) {
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
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
