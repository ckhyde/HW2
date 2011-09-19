/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author ckhyde
 */
public class PDGame 
{
    
    private static final int ROUNDS = 10;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Judge PDjudge = new Judge(new RandomPlayer(), new RandomPlayer(), ROUNDS);
        //Judge PDjudge = new Judge(new RandomPlayer(), new CoopPlayer(), ROUNDS);
        //Judge PDjudge = new Judge(new RandomPlayer(), new DefPlayer(), ROUNDS);
        //Judge PDjudge = new Judge(new CoopPlayer(), new DefPlayer(), ROUNDS);
        //Judge PDjudge = new Judge(new TitPlayer(), new DefPlayer(), ROUNDS);
        //Judge PDjudge = new Judge(new TitPlayer(), new OptTitPlayer(), ROUNDS);
        Judge PDjudge = new Judge(new OptTitPlayer(), new TitPlayer(), ROUNDS);
        //Judge PDjudge = new Judge(new TitPlayer(), new TitPlayer(), ROUNDS);
    }
}