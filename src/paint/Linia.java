/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paint;

import java.awt.*;

/**
 *
 * @author student
 */
public class Linia implements Figura{
    
    private int x = -1;
    private int y = -1;

    public Linia(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        if (x != -1 && y != -1) {
            g.drawLine(x - 25, y - 25, 50, 50);
        }
    }

    
}
