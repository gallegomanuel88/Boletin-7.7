package bol7.pkg7;
import javax.swing.JOptionPane;
/**
 *
 * @author galle
 */
public class Circulo {
    private float radio;
    
    public void introducirRadio(){
        radio = Float.parseFloat(JOptionPane.showInputDialog("Introduce el radio"));
    }
    
    public void calcularArea(){
        JOptionPane.showMessageDialog(null, "El area del circulo es " + radio*2*3.1416);
    }
}
