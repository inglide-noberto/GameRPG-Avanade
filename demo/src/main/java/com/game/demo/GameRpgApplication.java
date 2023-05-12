package com.game.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Random;
import java.util.Scanner;
@SpringBootApplication
public class GameRpgApplication {

	public static void main(String[] args) {

		SpringApplication.run(GameRpgApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do herói: ");
		String nameHero = sc.nextLine();

		System.out.println("Deseja personalizar seu personagem? \n S/N");

		System.out.println("Digite o nome do monstro: ");
		String nameMonster = sc.nextLine();

		Characters hero = new Characters(nameHero);
		Characters monster = new Characters(nameMonster);
		Game game = new Game(hero, monster);
	}

}
