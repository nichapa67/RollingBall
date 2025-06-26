package Lib;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RolligBall extends JPanel implements ActionListener{
    int x =100;
    int y =90;
    int start_angel =0;
    public RolligBall(){
        Timer t = new Timer(100, this);
        t.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x, y, 80, 80);
        g.fillArc(x, y, 80, 80, start_angel, 180);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x=x-2;
        start_angel=start_angel+2;
        if(start_angel==360) start_angel=0;
        repaint();
    }
    
}
