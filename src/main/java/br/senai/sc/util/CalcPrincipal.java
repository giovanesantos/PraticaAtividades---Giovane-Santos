package br.senai.sc.util;

import javax.swing.JOptionPane;
 
public class CalcPrincipal {
	
	public static void main(String args []){
		
		int x;
		int y;
		String sX;
		
		sX = JOptionPane.showInputDialog (null, " Digite o valor 1:" );
		x = Integer.parseInt (sX);
		
		String sY = JOptionPane.showInputDialog (null, "Digite o valor 2:" );
		y = Integer.parseInt (sY);
		
	
		JOptionPane.showMessageDialog(null, "Resultado da Soma: " +  Calc.somar( x, y ) );
        JOptionPane.showMessageDialog(null, "Resultado da  Subtração: " +  Calc.subtrair( x, y ) );
        JOptionPane.showMessageDialog(null, "Resultado da Multiplição: " +  Calc.multiplica( x, y ) );
        JOptionPane.showMessageDialog(null, "Resultado da Divisão: " +  Calc.dividir( x, y ) );    
 
        System.exit( 0 );
    }	
	
}