package project02startingfiles;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author S538302
 */
public class Knight extends Player {
    public Knight(int health, int score){
        super(health, score);
    }
    
    
    @Override
    public String getSpecialMove() {
        return "Slash with Sword";
    }

    
    @Override
    public void useSpecialMove() {
        System.out.println("The Knight slashes with his sword, striking the foe with a mighty blow!");
    }
    
    @Override
    public String toString(){
        return "\n" + "Knight Status: \n" + super.toString() + "\nThe Knight's special move is '" + getSpecialMove() + "'" + "\n";
    }
    
}
