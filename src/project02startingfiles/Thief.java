package project02startingfiles;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author S557474
 */
public class Thief extends Player {
    
    public Thief(int health, int score){
        super(health, score);
    }
    
    public String getSpecialMove() {
        return "Sneak By";
    }

    
    public void useSpecialMove() {
        System.out.println("The Thief sneaks by the foe, attempting to steal something valuable!");
    }
    
    public String toString(){
        return "\n" + "Thief Status: \n" + super.toString() + "\nThe Thief's special move is '" + getSpecialMove() + "'" + "\n";
    }
    
}
