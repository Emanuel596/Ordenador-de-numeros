/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wwq;

import java.util.Arrays;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author Alumnos
 */
public class ytv {

    int[] arreg;

    public void agg() {
        int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de elementos"));
        arreg = new int[cant];
        for (int i = 0; i < cant; i++) {
            arreg[i] = Integer.parseInt(JOptionPane.showInputDialog( "ingresa el elemento:" ));
        }
     
    }
    public void most(){
          JOptionPane.showMessageDialog(null, "los elementos son:" + Arrays.toString(arreg));
    }
    public void ord(){
     for (int i = 0;i<arreg.length-1;i++){
         for(int j = 0;j<arreg.length-1;j++){
             if(arreg[j]>arreg[j+1]){
                 int aux = arreg[j];
                 arreg[j]= arreg[j+1];
                 arreg [j+1]= aux;
             }
              
         }
     } 
    }  
}
