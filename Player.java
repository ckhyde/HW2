/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author ckhyde
 */
public interface Player 
{
    void makeMove(int iOppMove);
    //void setScore(int iMyMove, int iOppMove, int iMyScore, int iOppScore);   
    void setScore(int iMyScore);   
    void setMove(int iMyMove);
    int iGetScore();
    int iGetTotalScore();
    int iGetMove();
}
