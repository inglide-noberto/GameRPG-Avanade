package com.game.demo;
import java.util.Random;

public class Game {
    private Characters hero;
    private Characters monster ;

    public Game(Characters hero, Characters monster) {
        this.hero = hero;
        this.monster = monster;
    }

    public void play() {
        Random random = new Random();
        boolean heroStart = random.nextBoolean();
        System.out.println("Iniciativa: " + (heroStart ? hero.getName() : monster.getName()));

        Characters forward = heroStart ? hero : monster;
        Characters defender = heroStart ? monster : hero;

        while (forward.isAlive() && defender.isAlive()) {
            int damage = forward.attack();
            defender.defend(damage);
            System.out.println(forward.getName() + " atacou " + defender.getName() + " e causou " + damage + " de dano.");

            if (!defender.isAlive()) {
                System.out.println(defender.getName() + " morreu!");
                break;
            }

            Characters tmp = forward;
            forward = defender;
            defender = tmp;
        }

        System.out.println("Fim do jogo.");
    }
}
