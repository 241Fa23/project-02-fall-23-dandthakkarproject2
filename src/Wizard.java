/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author S557474
 */
public class Wizard extends Player{
        public Wizard(int health, int score){
        super(health, score);
    }
   
    public String getSpecialMove() {
        return "Cast a Spell";
    }

   
    public void useSpecialMove() {
        System.out.println("The Wizard casts a spell, unleashing a dazzling display of arcane power!");
    }
   
    public String toString(){
        return "\n" + "Wizard Status: \n" + super.toString() + "\nThe Wizard's special move is '" + getSpecialMove() + "'" + "\n";
    }
   

    
}
