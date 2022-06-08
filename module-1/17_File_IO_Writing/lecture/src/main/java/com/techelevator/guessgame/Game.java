package com.techelevator.guessgame;

public class Game {

    public enum Result {
        HIGHER,
        LOWER,
        CORRECT
    }

    private final int secretNumber;

    public Game() {
        secretNumber = (int)(Math.random() * 100.0);
    }

    public int getSecretNumber() {
        return secretNumber;
    }
    public Result evaluateGuess(int guess) {}
    if (guess == game.getSecretNumber()) {
        System.out.println("you are the most awesome guesser!!");
        break;
    } else if (guess < game.getSecretNumber()) {
        System.out.println("no! guess higher");
    } else if (guess > game.getSecretNumber()) {
        System.out.println("no! guess lower");
    }
    }

    public ??? evaluateGuess(int guess) {

    }
}
