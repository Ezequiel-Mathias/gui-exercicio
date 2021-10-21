package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Telinha {
	
	public void criartela() {
		JFrame minhatelinha= new JFrame ();
		minhatelinha.setSize(400 , 400);
		minhatelinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhatelinha.setTitle(" Exercicio GUI IMC ");
		minhatelinha.setLayout(null);
		
		// componentes da tela !!
		
		JLabel titulo = new JLabel();
		titulo.setText("CALCULO DE IMC");
		minhatelinha.getContentPane().add(titulo);
		titulo.setBounds(150, 20, 150, 30);
		titulo.setForeground(Color.blue);
		
		JLabel peso = new JLabel();
		peso.setText("Seu peso : ");
		minhatelinha.getContentPane().add(peso);
		peso.setBounds(20, 60, 150, 30);
	
		JLabel altura = new JLabel();
		altura.setText("Sua altura : ");
		minhatelinha.getContentPane().add(altura);
		altura.setBounds(20, 110, 150, 30);
		
		JButton calcular = new JButton();
		calcular.setText(" CALCULAR ");
		minhatelinha.getContentPane().add(calcular);
		calcular.setBounds(150, 200, 120, 29);
		
		JTextField texto = new JTextField(); 
		texto.setText("");
		minhatelinha.getContentPane().add(texto);
		texto.setBounds(90, 60, 80 ,30);
		
		JTextField texto2 = new JTextField(); 
		texto2.setText("");
		minhatelinha.getContentPane().add(texto2);
		texto2.setBounds(90, 110, 80 ,30);
		
		JLabel saida = new JLabel();
		saida.setText("");
		minhatelinha.getContentPane().add(saida);
		saida.setBounds(20, 250, 250, 30);
		
		JLabel IMC = new JLabel();
		saida.setText("Seu Imc é de : ");
		minhatelinha.getContentPane().add(saida);
		saida.setBounds(20, 300, 150, 30);
		
		//eventos do botão (calcular)
		
		calcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
						
				String peso = texto.getText();			
				
				Double valor1 = Double.parseDouble(peso);
				
				String altura = texto2.getText();			
				
				Double valor2 = Double.parseDouble(altura);
				
				Double resultado = valor1 / (valor2 * valor2) ;
				
				
				if (resultado < 18.5) {
	    			saida.setText(String.valueOf("Abaixo do peso, engorde mais um pouquin"));
	    		} else if (18.5 <= resultado && resultado <= 24.9) {
	    			saida.setText(String.valueOf("Peso Normal,parabens"));
	    		} else if (25 <= resultado && resultado <= 29.9) {
	    			saida.setText(String.valueOf("sobrepeso,emagrece um pouquin"));
	    		} else if(30 <= resultado && resultado <= 34.9) {
	    			saida.setText(String.valueOf("Obesidade Grau 1, emagrecer urgente"));
	    		} else if(35 <= resultado && resultado <= 39.9) {
	    			saida.setText(String.valueOf("Obesidade Grau 2, se vai morre doido"));
	    		} else  {
	    			saida.setText(String.valueOf("Obesidade morbida"));
	    			saida.setText(String.valueOf("seu imc é de : " + resultado));
	    		}
				
				
				
				
					
				
				
				
			}
		});
		
		
		minhatelinha.setVisible(true);
	
	
	}

}
