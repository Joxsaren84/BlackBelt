package ru.joxaren.multithreading.exchangerexample;

import java.util.List;
import java.util.concurrent.Exchanger;

enum Action{
    STONE, SCISSORS, PAPER;
}

public class BestFriend extends Thread{


    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction){
        if(myAction == Action.STONE && friendsAction == Action.SCISSORS
            || myAction == Action.SCISSORS && friendsAction == Action.PAPER
            || myAction == Action.PAPER && friendsAction == Action.STONE){
            System.out.println(name + " WINS!!!");
        }
    }


    @Override
    public void run() {
        Action replay;

        for (Action action : myActions){
            try {
                replay = exchanger.exchange(action);
                whoWins(action, replay);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
