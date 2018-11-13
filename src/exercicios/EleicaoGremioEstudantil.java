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
public class EleicaoGremioEstudantil {
    public static void main(String[] args) {
        int contChapaA=0,contChapaB=0,voto=0;
        while(voto!=3){
            voto=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para chapaA ou digite 2 para chapaB "));
            if(voto==1){
                contChapaA=contChapaA+1;
            }
            if(voto==2){
                contChapaB=contChapaB+1;
            }
        }
         JOptionPane.showMessageDialog(null,"chapaA: "+Integer.toString(contChapaA)+"\n"
                 + "chapaB: "+Integer.toString(contChapaB));
        
        
    }
            
}
