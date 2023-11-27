/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author S538302
 */
public class Healer extends Player {
    
     public Healer(int health, int score){
        super(health, score);
    }
    
    public String getSpecialMove() {
        return "Use Sleeping Powder";
    }

    
    public void useSpecialMove() {
        System.out.println("The Healer uses sleeping powder, putting the foe to sleep and avoiding the battle!");
    }
    
    public String toString(){
        return "\n" + "Healer Status: \n" + super.toString() + "\nThe Healers's special move is '" + getSpecialMove() + "'" + "\n";
    }
    
}
