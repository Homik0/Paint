/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author student
 */
public class Panel extends JPanel implements MouseListener {

    public Panel() {
        addMouseListener(this);
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(null,
                e.getPoint().toString());
    }
}
