/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project02startingfiles;

/**
 *
 * @author 
 */
import java.util.*;
public class Project2 {

    /**
     * @param args the command line arguments
     */
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
