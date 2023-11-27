package project02startingfiles;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author S557474
 */
<<<<<<< Updated upstream
public class Thief extends Player {
    
    public Thief(int health, int score){
        super(health, score);
    }
    
=======
public class Thief extends Player{
        public Thief(int health, int score){
        super(health, score);
    }
   
>>>>>>> Stashed changes
    public String getSpecialMove() {
        return "Sneak By";
    }

<<<<<<< Updated upstream
    
    public void useSpecialMove() {
        System.out.println("The Thief sneaks by the foe, attempting to steal something valuable!");
    }
    
    public String toString(){
        return "\n" + "Thief Status: \n" + super.toString() + "\nThe Thief's special move is '" + getSpecialMove() + "'" + "\n";
    }
    
=======
   
    public void useSpecialMove() {
        System.out.println("The Thief sneaks by the foe, attempting to steal something valuable!");
    }
   
    public String toString(){
        return "\n" + "Thief Status: \n" + super.toString() + "\nThe Thief's special move is '" + getSpecialMove() + "'" + "\n";
    }

>>>>>>> Stashed changes
}
