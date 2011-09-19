/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author ckhyde
 */
public class OptTitPlayer extends PDPlayer
{
 
    OptTitPlayer()
    {                          
      System.out.println("OptTitPlayer Constructor");
    }        
    
    public void makeMove(int iOppMove) 
    {         
        // At the first round, be optimistic
        if (iOppMove == -1)
        {
           setMove(0);
        }   
        // React against Cooperation
        else if (iOppMove == 0)
           setMove(0);
        // React against Defect
        else if (iOppMove == 1)
           setMove(1);
    }        
}
