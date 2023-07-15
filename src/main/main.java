/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author reych
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String op = "";
        do {

            try {
                op = JOptionPane.showInputDialog(null, "Testing", "Tittle", 0);
                JOptionPane.showMessageDialog(null, op);
                if (op.equalsIgnoreCase("sí")) {
                    JOptionPane.showMessageDialog(null, "Usted digitó " + op + " Podemos continuar");
                } else {
                    JOptionPane.showMessageDialog(null, "No digitó sí");
                    if (JOptionPane.showConfirmDialog(null, "Desea voolver a intentarlo?")==0) {
                        op="si";
                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Seleccionó cancelar o salir");
            }
           

        } while (op.equalsIgnoreCase("sí"));
    }
}
