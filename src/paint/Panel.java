/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author student
 */
public class Panel extends JPanel implements MouseListener, MouseMotionListener {

    ArrayList<Figura> lista;
    public int x = -1;
    public int y = -1;

    public Panel() {
        addMouseListener(this);
        addMouseMotionListener(this);
        lista = new ArrayList<Figura>();

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
        lista.add(new Kwadrat(e.getX(), e.getY()));
        repaint();
    }

    public void mouseMoved(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {

    }

    public void paint(Graphics g) {
        for (Figura figura : lista) {
            figura.paint(g);
        }
    }
}
