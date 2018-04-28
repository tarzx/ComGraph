/*
 * Main.java
 *
 * Created on 15 ���Ҥ� 2550, 21:07 �.
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package comgraph;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class Main extends JFrame{
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Present pre = new Present();
         pre.setVisible(true);
         pre.setSize(800,600);
         
         pre.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); }
        });
    }
    
}
