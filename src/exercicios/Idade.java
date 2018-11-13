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
public class Idade {
    public static void main(String[] args) {
        int idade=0;
        int cont1=0,cont2=0,cont3=0;
        while(cont1<=9){
        
        idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        cont1=cont1+1;
        
        if(idade >=18 ){
            cont2=cont2+1;
        }else{
            cont3=cont3+1;
    }
}
        
        JOptionPane.showMessageDialog(null,"Maiores de 18 anos:\n"+cont2+"\nMenores de 18 anos:\n"+cont3);

}

        
}
   

