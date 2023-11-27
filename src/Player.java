/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author S538302
 */
public abstract class Player {
    
     private int health = 10;
    private int score = 0;
    
    public Player(int health, int score){
        this.health = health;
        this.score = score;
    }
    
    public abstract String getSpecialMove();
    public abstract void useSpecialMove();
    
    
    public void increaseScore(int amount) {
        score += amount;
    }

    public void decreaseHealth() {
        health--;
    }

    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String toString() {
        return "Health: " + health + "\nScore: " + score;
    }

    
}
