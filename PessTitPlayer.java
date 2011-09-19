/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author ckhyde
 */
public class PessTitPlayer extends PDPlayer
{
    
    PessTitPlayer()
    {                          
      System.out.println("PessTitPlayer Constructor");
    }        
    
    public void makeMove(int iOppMove) 
    {         
        // At the first round, be pessimistic
        if (iOppMove == -1)
        {            
           setMove(1);
        }   
        // React against Cooperation
        else if (iOppMove == 0)
        {
           setMove(0);
           //System.out.println("iOppMove: "+ iOppMove);
        }
        // React against Defect
        else if (iOppMove == 1)
           setMove(1);
    }           
}
