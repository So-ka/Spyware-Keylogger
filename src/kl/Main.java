package kl;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UnsupportedLookAndFeelException;



public class Main{
    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
        }
        catch (UnsupportedLookAndFeelException ex) {} 
        Main_Window frame = new Main_Window(); 
        frame.setVisible(true);
    }
}