/*
 * Present.java
 *
 * Created on 15 ���Ҥ� 2550, 22:00 �.
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
public class Present extends JFrame{
    
    public Present() {
        setTitle("Pat-Tar Manga Diaoh");
        Final f = new Final();
        f.draw();
        
        Container c = getContentPane();
        /*------LAYOUT-----*/
        c.add(f);
    }
    
}
