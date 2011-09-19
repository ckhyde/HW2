/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author ckhyde
 */
public class CoopPlayer extends PDPlayer
{
 
    CoopPlayer()
    {                          
      System.out.println("CoopPlayer Constructor");
    }        
    
    public void makeMove(int iOppMove) 
    {                
        setMove(0); //0 for Cooperation
            
    }        
}
