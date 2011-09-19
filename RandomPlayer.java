/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

import java.util.Random;

/**
 *
 * @author ckhyde
 */

public class RandomPlayer extends PDPlayer 
{            
    
    RandomPlayer()
    {                          
      System.out.println("RandomPlayer Constructor");
    }        
    
    public void makeMove(int iOppMove) 
    {
        Random rnd = new Random();
        
        setMove(rnd.nextInt(2)); //Return an interger 0 or 1
            
    }          
}