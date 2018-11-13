/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab01_215
 */
public class Tabuada {
            public static void main(String[] args) {
                int cont=0;
                int contTabu=0,contMult=0,calculo,valordig;
               valordig=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro para ser calculado a tabuada"));
                
               while(contTabu<=10){
                   
                    calculo=valordig*contTabu;
                    JOptionPane.showMessageDialog(null,valordig+"x"+contTabu+"="+calculo);
                     contTabu=contTabu+1;
                        }
                    
                    }
}

