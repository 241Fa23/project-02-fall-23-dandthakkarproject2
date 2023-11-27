
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author S538302
 */
public class Project2 {
    
     private static Player player;
    private static final Random rand = new Random();
    private static final Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int health = 10;
        int score = 0;
        
        System.out.println("Welcome to JavaQuest!\nStay alive and increase your score!");
        System.out.println("");
        System.out.println("Choose a character...\n{k}Knight || {h}Healer || {w}Wizard || {t}Thief");
        System.out.print(">>");
        String choice = input.next();
        
        if(choice.equals("k")){
            System.out.println("");
            System.out.println("Welcome Knights!");
            System.out.println("");
            player = new Knight(health, score);
        }
        
        else if(choice.equals("h")){
            System.out.println("");
            System.out.println("Welcome Healers!");
            System.out.println("");
            player = new Healer(health, score);
        }
        
        else if(choice.equals("w")){
            System.out.println("");
            System.out.println("Welcome Wizards!");
            System.out.println("");
            player = new Wizard(health, score);
        }
        
        else if(choice.equals("t")){
            System.out.println("");
            System.out.println("Welcome Thiefs!");
            System.out.println("");
            player = new Thief(health, score);
        }
        
        else{
            System.out.println("Invalid input, please try again");
        }
        
        System.out.println("What would you like to do?" + "\n{?}Status Report || {n}{s}{e}{w} Move 1 Space North, South, East, or West || {q}Quit");
        System.out.print(">>");
        String selection = input.next();
        
        while(selection != "q"){
            if(selection.equals("?")){
               System.out.println(player.toString());
            }
            
            else if(selection.equals("n") || selection.equals("s")|| selection.equals("e")|| selection.equals("w") ){
                move();
            }
            else if(selection.equals("q")){
                System.out.println("********************");
                System.out.println("********************");
                System.out.println("The game has come to an end! Your final stats: ");
                System.out.println(player.toString());
                System.out.println("Thanks for playing!");
                break;
            }
            else{
                System.out.println("Invalid input, please try again");
            }
            
            System.out.println("What would you like to do?" + "\n{?}Status Report || {n}{s}{e}{w} Move 1 Space North, South, East, or West || {q}Quit");
            System.out.print(">>");
            selection = input.next();
            
            
            
            
        }
    }
    
    public static void move(){
        int num = rand.nextInt(100);
        
        
        if (num < 20) {
            encounterFoe();
        } 
        
        else {
            player.increaseScore(1);
            String[] scenes = {"Nothing here...", "Nice trees around here...", "Interesting cottage there...", "Potty break..."};
            System.out.println("********************");
            System.out.println(scenes[rand.nextInt(scenes.length)]);
            System.out.println("********************");
        }
    }
    
    public static void encounterFoe() {
        
    
        String[] foes = {"zombie", "bandit", "lobbyist"};
        System.out.println("Oh no! You are being attacked by a " + foes[rand.nextInt(foes.length)] + "!");
        System.out.println("How would you like to handle this?\n{s}Special Move || {r}Run!");
        System.out.print(">>");
        String option = input.next();
        
        if (option.equals("r")) {
            if (rand.nextBoolean() == true) {
                System.out.println("You successfully ran away!");
                player.increaseScore(1);
            } 
            
            else {
                System.out.println("You failed to run away! The battle begins!");
                battle();
            }
         }
        else if (option.equals("s")) {
                battle();
        }
    }
    
    
    
}
