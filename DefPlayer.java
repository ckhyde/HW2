/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author ckhyde
 */
public class DefPlayer extends PDPlayer{
    
    DefPlayer()
    {                          
      System.out.println("DefPlayer Constructor");
    }        
    
    public void makeMove(int iOppMove) 
    {                
        setMove(1); //1 for Defect
            
    }        
}
