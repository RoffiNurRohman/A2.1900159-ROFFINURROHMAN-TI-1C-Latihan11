/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package getinputfromkeyboard;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
/**
 *
 * @author Windows_10
 */
public class GraphicPanel extends Panel{
    public GraphicPanel() {
 setBackground(Color.white);
 }
 public void paint(Graphics g) {
 g.setColor(new Color(0,255,0)); //green
 g.setFont(new Font("Helvetica",Font.PLAIN,16));
 g.drawString("Rendy Rishandi Perkasa!", 30, 100);
 g.setColor(new Color(1.0f,0,0)); //red
 g.fillRect(30, 100, 150, 10);
 } 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Frame f = new Frame("Testing Graphics Panel");
         GraphicPanel gp = new GraphicPanel();
         f.add(gp);
         f.setSize(600, 300);
         f.setVisible(true);
    }
}
