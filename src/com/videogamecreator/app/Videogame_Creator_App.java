package com.videogamecreator.app;

import java.util.ArrayList;
import java.util.List;

import com.videogamecreator.logic.Videogame;

public class Videogame_Creator_App {

	public static void main(String[] args) {

		Videogame video1 = new Videogame(0, "Monkey Island", "PC     ", 12000, "Graphic adventure");
		Videogame video2 = new Videogame(1, "Minecraft", "PC      ", 45000000, "Sandbox");
		Videogame video3 = new Videogame(2, "God of war", "Play Station", 300000, "Action");
		Videogame video4 = new Videogame(3, "Mario 64  ", "Nintendo 64", 25000, "Plataform");
		Videogame video5 = new Videogame(4, "Need for speed", "Xbox    ", 1000000, "Races");

		List<Videogame> videogames = new ArrayList<Videogame>();

		videogames.add(video1);
		videogames.add(video2);
		videogames.add(video3);
		videogames.add(video4);
		videogames.add(video5);

		System.out.println("Without changes:");
		for (Videogame vg : videogames) {
			System.out.println(
					"Title: " + vg.getTitle() + "\tConsole: " + vg.getConsole() + "\tPlayers: " + vg.getPlayers());
		}

		video1.setTitle("Terraria    ");
		video2.setTitle("Castelvania");
		video1.setPlayers(1000000000);
		video2.setPlayers(45);

		System.out.println();
		System.out.println("With changes (players and title):");
		for (Videogame vg : videogames) {
			System.out.println(
					"Title: " + vg.getTitle() + "\tConsole: " + vg.getConsole() + "\tPlayers: " + vg.getPlayers());
		}

		System.out.println();
		System.out.println("Only Nintedo 64 games:");
		for (Videogame vg : videogames) {

			if (vg.getConsole().equals("Nintendo 64")) {
				System.out.println(
						"Title: " + vg.getTitle() + "\tConsole: " + vg.getConsole() + "\tPlayers: " + vg.getPlayers());
			}
		}

	}

}
