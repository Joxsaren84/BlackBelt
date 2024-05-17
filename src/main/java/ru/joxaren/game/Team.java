package ru.joxaren.game;

import java.util.ArrayList;
import java.util.Random;

public class Team <T extends Player>{
    private String name;
    private ArrayList <T> playersList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewPlayer(T player){
        playersList.add(player);
        System.out.println("Player " + player.getName() + " add to team \"" + name + "\"");
    }

    public void playWith(Team <T> team){
        Random rand = new Random();
        System.out.println("Team \"" + (rand.nextInt(2) == 0 ? name : team.name) + "\" is the winner!!!");
    }

}
