package com.game.demo;

import java.util.Random;

public class Characters {
    private String name;
    private int lifePoints;
    private int strength;
    private int defense;
    private int initiative;

    public Characters() {    }

    public Characters(String name) {
        this.name = name;
    }

    public Characters(String name, int lifePoints, int strength, int defense, int initiative) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.strength = strength;
        this.defense = defense;
        this.initiative = initiative;
    }

    public int attack() {
        Random random = new Random();
        int damage = random.nextInt(6) + 1 + strength;
        return damage;
    }

    public void defend(int damage) {
        int damageReceived = damage - defense;
        if (damageReceived > 0) {
            lifePoints -= damageReceived;
        }
    }

    public boolean isAlive() {
        return lifePoints > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
}
