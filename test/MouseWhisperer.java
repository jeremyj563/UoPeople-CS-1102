package test;

import java.awt.event.*;
import javax.swing.*;

public class MouseWhisperer extends JFrame implements MouseListener {

    private static final long serialVersionUID = 1L;

    MouseWhisperer() {
        super("COME CLOSER");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) { setTitle("OUCH"); }
    public void mousePressed(MouseEvent e) { setTitle("LET GO"); }
    public void mouseReleased(MouseEvent e) { setTitle("WHEW"); }
    public void mouseEntered(MouseEvent e) { setTitle("I SEE YOU"); }
    public void mouseExited(MouseEvent e) { setTitle("COME CLOSER"); }
    public static void main(String[] args) { new MouseWhisperer(); }
}
