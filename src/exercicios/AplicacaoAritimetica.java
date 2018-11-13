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
public class AplicacaoAritimetica {
    public static void main(String[] args) {
    int opc=0;
    double valor1, valor2, resultado;
    
    while(opc!=5){
        
       opc=Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: \n 1 - soma\n 2 - subtração\n 3 - dividir \n 4 - multiplicação \n 5 - sair",JOptionPane.INFORMATION_MESSAGE));
        if (opc==5){
            System.exit(0);
        }
       
       
       
       valor1=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor1: "));
       valor2=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor2: "));
        
        if (opc==1){
            resultado= valor1+valor2;
            JOptionPane.showMessageDialog(null,"O valor da soma é: "+resultado+" RESULTADO DA SOMA");
        }
        if (opc==2){
            resultado= valor1-valor2;
            JOptionPane.showMessageDialog(null,"O valor da subtração é: "+resultado+" RESULTADO DA SUBTRAÇÃO");
        }
         if (opc==3){
            resultado= valor1/valor2;
            JOptionPane.showMessageDialog(null,"O valor da divisão é: "+resultado+" RESULTADO DA DIVISÃO");
        }
          if (opc==4){
            resultado= valor1*valor2;
            JOptionPane.showMessageDialog(null,"O valor da multiplicação é: "+resultado+" RESULTADO DA MULTIPLICAÇÃO");
        }
    }
    }
    }
