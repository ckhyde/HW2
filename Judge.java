/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author ckhyde
 */

public class Judge 
{    
   public Judge()
   {   
       // Specify the Default Constructor
   }
    
   public Judge(Player p1, Player p2, int rounds) 
   {
       for (int i=0; i < rounds; i++) 
       { 
           System.out.println("Round" + i + ": ");
           
           playRound(p1, p2);
           
           System.out.println("Plaer A score " + p1.iGetScore()+ ", Player B's total score = " + p2.iGetScore());
           System.out.println("Plaer A's total score = " + p1.iGetTotalScore()+ ", Player B's total score = " + p2.iGetTotalScore());
       }
   }
   
   public void playRound(Player p1, Player p2) 
   {
       int m1, m2; 
       
       m1 = p1.iGetMove();
       m2 = p2.iGetMove(); 
       
       p1.makeMove(m2);
       p2.makeMove(m1);
       
       m1 = p1.iGetMove();
       m2 = p2.iGetMove();       
              
       
       // Move: 0 for cooperation, 1 for defect
       // If both cooperates
       if ((m1==0) && (m2==0))
       {          
          p1.setScore(3);
          p2.setScore(3);
       } 
       // If Player 1 cooperates while Player 2 defects
       else if ((m1==0) && (m2==1))
       {         
          p1.setScore(0);
          p2.setScore(12);
       } 
       // If Player 1 defects while Player 2 cooperates
       else if ((m1==1) && (m2==0)) 
       {          
          p1.setScore(12);
          p2.setScore(0);
       }
       // If both defect
       else
       {
          p1.setScore(1);
          p2.setScore(1);
       }
       
           
   } 

}
