package bol7.pkg7;
import javax.swing.JOptionPane;
/**
 *
 * @author galle
 */
public class Triangulo {
    private float base;
    private float altura;
    
    public void introducirBaseAltura(){
        base = Float.parseFloat(JOptionPane.showInputDialog("Introduce la base"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura"));
    }
    
    public void calcularArea(){
        JOptionPane.showMessageDialog(null, "El area del triangulo es " + base*altura/2);
    }
}