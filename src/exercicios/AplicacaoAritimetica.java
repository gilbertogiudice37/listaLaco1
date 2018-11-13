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
        int soma,multiplicar,subtrair,dividir, num1 = 0, num2 = 0;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));

        soma = num1 + num2;
        multiplicar= num1 * num2;
        dividir= num1 / num2;
        subtrair= num1 - num2;
        
        JOptionPane.showMessageDialog(null, "A soma é: " + subtrair);
        JOptionPane.showMessageDialog(null, "A soma é: " + dividir);
        JOptionPane.showMessageDialog(null, "A soma é: " + multiplicar);
        JOptionPane.showMessageDialog(null, "A soma é: " + soma);
        
        
    }
    
}
