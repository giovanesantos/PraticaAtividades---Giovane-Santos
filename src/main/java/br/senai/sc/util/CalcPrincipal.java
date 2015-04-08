package br.senai.sc.util;
 
public class CalcPrincipal {
	
	publci static void main(String args []){
		
		int x;
		int y;
		String sX;
		String Sy;
		
		sX = JOptionPane.showInputDialog (null, " Digite o valor 1:" );
		x = Integer.parseInt (sX);
		
		sY = JOptionPane.showInputDialog (null, "Digite o valor 2:" );
		y = Integer.parseInt (sY);
		
	
		JOptionPane.showMessageDialog(null, "Resultado da Soma: " +  calc.soma( x, y ) );
        JOptionPane.showMessageDialog(null, "Resultado da  Subtração: " +  calc.subtrair( x, y ) );
        JOptionPane.showMessageDialog(null, "Resultado da Multiplicação: " +  calc.multiplica( x, y ) );
        JOptionPane.showMessageDialog(null, "Resultado da Divisão: " +  calc.dividir( x, y ) );    
 
        System.exit( 0 );
    }	
	
}