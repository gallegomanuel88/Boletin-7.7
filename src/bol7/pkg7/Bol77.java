package bol7.pkg7;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Bol77 {

    public static void main(String[] args) {
        boolean cuadrado=false;
        boolean triangulo=false;
        boolean circulo = false;
        boolean opcionNoElegida = false;
        do{
        String res = JOptionPane.showInputDialog(null, "MENU\nElija una opción:\n1)Cadrado\n2)Triángulo\n3)Circulo");
        switch(Integer.parseInt(res)){
            case 1:cuadrado=true;
                JOptionPane.showMessageDialog(null,"Ha elegido el cuadrado");
                break;
            case 2:triangulo=true;
                JOptionPane.showMessageDialog(null,"Ha elegido el triangulo");
                break;
            case 3:circulo=true;
                JOptionPane.showMessageDialog(null,"Ha elegido el circulo");
                break;
            default:JOptionPane.showMessageDialog(null,"No ha elegido una opcion correcta");
                opcionNoElegida = true;
        }
        }while(opcionNoElegida);
        
        if(cuadrado){
            Cuadrado ejemplo = new Cuadrado();
            ejemplo.introducirLado();
            ejemplo.calcularArea();
        }
        if(triangulo){
            Triangulo ejemplo2 = new Triangulo();
            ejemplo2.introducirBaseAltura();
            ejemplo2.calcularArea();
        }
        if(circulo){
            Circulo ejemplo3 = new Circulo();
            ejemplo3.introducirRadio();
            ejemplo3.calcularArea();
        }
        
    }
    
}
