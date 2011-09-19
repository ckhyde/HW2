/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author ckhyde
 */
public class PDPlayer implements Player 
{
    private int iSelfScore;
    private int iTotalSelfScore;
    private int iSelfMove;    
    
    PDPlayer()
    {        
      iSelfScore = 0;
      iTotalSelfScore = 0; 
      iSelfMove = -1;
      
      System.out.println("PDPlayer Constructor");
    }        
    
    public void makeMove(int iOppMove) 
    {}
    
    //public void setScore(int iMyMove, int iOppMove, int iMyScore, int iOppScore) 
    public void setScore(int iMyScore) 
    {
        iSelfScore = iMyScore;
        iTotalSelfScore += iMyScore; 
        
        //System.out.println("Plaer A score " + String.valueOf(iMyScore)+ ", Player B Score" + String.valueOf(iOppScore));
    }
    
    public void setMove(int iMyMove)
    {
        iSelfMove = iMyMove;
    }
    
    public int iGetScore()
    {
        return iSelfScore;
    }
    
    public int iGetTotalScore()
    {
        return iTotalSelfScore;
    }    
    
    public int iGetMove()
    {               
        return iSelfMove;
    }
}    
