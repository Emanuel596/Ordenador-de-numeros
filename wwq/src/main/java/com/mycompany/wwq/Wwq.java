/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.wwq;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumnos
 */
public class Wwq {

    public static void main(String[] args) {
        ytv ola = new ytv();
        int opc;
do {
         opc = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la opcion \n"
                + " 1 agrega\n"
               
                + " 2 mostrar\n"
                + " 3  ordena\n"
                + "4 salir\n"));
        
            switch (opc) {
                case 1:
                    ola.agg();
                    break;
                case 2:
                    ola.most();
                    break;
                case 3:
                    ola.ord();
                    break;
                case 4:
                    System.out.println("Adios camera w");
                    break;
                default:
                    System.out.println("Valor invalido");
            }
        } while (opc != 4);
    }
}
