/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathgame;

/**
 * A math game application intended to help students learn basic math.
 * 
 * @author Kou Xiong, Thomas Le, Tenzin Dhargye, Tommy Yang
 */
public class MathGame {

    /**
     * Creates and displays the GUI
     * 
     * @see MathGameGUI
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       MathGameGUI form = new MathGameGUI();
       form.setVisible(true);
    }
    
}
