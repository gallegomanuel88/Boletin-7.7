package bol7.pkg7;
import javax.swing.JOptionPane;
/**
 *
 * @author galle
 */
public class Cuadrado {
    
    private float lado;
    
    public void introducirLado(){
        lado = Float.parseFloat(JOptionPane.showInputDialog("Introduce el lado"));
    }
    
    public void calcularArea(){
        JOptionPane.showMessageDialog(null, "El area del cuadrado es " + Math.pow(lado,2));
    }
    
}