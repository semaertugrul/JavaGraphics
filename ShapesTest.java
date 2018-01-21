
package JavaGraphics;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sema
 */
public class ShapesTest {
    public static void main(String [] args){
    
    //showInputDialog static bir methoddur bu yüzden direkt erişilir.
    String input = JOptionPane.showInputDialog("Diktörtgen için 1, Çember için 2 yazın.."); 
    int choice = Integer.parseInt(input);
    Shapes nesne = new Shapes(choice);
    
    JFrame application = new JFrame();
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.add(nesne);
    application.setSize(300,300);
    application.setVisible(true);
    
    
    }
}
