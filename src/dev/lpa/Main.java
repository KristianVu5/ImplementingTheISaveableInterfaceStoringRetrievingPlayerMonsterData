package dev.lpa;

import java.util.List;

public class Main {
    static void main(String[] args) {
        Player player = new Player("Tim",10,15);
        System.out.println("Original Player:");
        System.out.println(player);

        List<String> playerData = player.write();
        System.out.println("\nSaved Player Data:");
        System.out.println(playerData);

        Player newPlayer = new Player("Default", 1, 1);
        newPlayer.read(playerData);

        System.out.println("\nPlayer After Reading Data:");
        System.out.println(newPlayer);

        Monster monster = new Monster("Werewolf",20, 40);

        System.out.println("\nOriginal Monster:");
        System.out.println(monster);

        List<String> monsterData = monster.write();
        System.out.println("\nSaved Monster Data");
        System.out.println(monsterData);

        Monster newMonster = new Monster("Default Monster", 1, 1);
        newMonster.read(monsterData);

        System.out.println("\nMonster After Reading Data:");
        System.out.println(newMonster);
    }
}
