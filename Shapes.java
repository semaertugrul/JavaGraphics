
package JavaGraphics;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author sema
 */
public class Shapes extends JPanel {
    
    private int choice; //kullanici seçimi
    public Shapes(int userChoice){ //Yapıcı fonksiyon nesne oluşturulduğu anda çağrılır
    
    choice = userChoice;
    
    }
    
    public void paintComponent ( Graphics g ){
    
    super.paintComponent(g); // üst sınıfın paintComponent fonksiyonu çağrılır
    
    for (int i=0; i<10; i++ ){ //seçilen şekilden for döngüsüyle 10 adet oluşturulur.
    
        switch(choice){
        
            case 1:
                g.drawRect(10+i*10,10+i*10,50+i*10,50+i*10);
                break;
            case 2:
                g.drawOval(10+i*10,10+i*10,50+i*10,50+i*10);
                break;
        
        
             }
         }
    
    }
}
