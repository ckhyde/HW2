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
public class TitPlayer extends PDPlayer
{
    
    TitPlayer()
    {                          
      System.out.println("TitPlayer Constructor");      
    }        
    
    public void makeMove(int iOppMove) 
    {         
        // At the first round arbitrarily choose action
        if (iOppMove == -1)
        {
           Random rnd = new Random();
           setMove(rnd.nextInt(2)); //Return an interger 0 or 1            
        }   
        // React against Cooperation
        else if (iOppMove == 0)
           setMove(0);
        // React against Defect
        else if (iOppMove == 1)
           setMove(1);
    }        
}
