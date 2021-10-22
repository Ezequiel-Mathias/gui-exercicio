package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;

public class Telinha {
	
	public void criartela() {
		JFrame minhatelinha= new JFrame ();
		minhatelinha.setSize(380 , 380);
		minhatelinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhatelinha.setTitle(" Exercicio GUI IMC ");
		minhatelinha.setLayout(null);
		
		// componentes da tela !!
		
		JLabel titulo = new JLabel();
		titulo.setText("Cálculo de IMC");
		minhatelinha.getContentPane().add(titulo);
		titulo.setForeground(Color.blue);
		titulo.setFont(new FontUIResource("Cálculo de IMC", 1, 20));
		titulo.setBounds(20, 10, 150, 30);
		
		
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
		calcular.setFont(new FontUIResource("CALCULAR", 4, 17));
		minhatelinha.getContentPane().add(calcular);
		calcular.setBounds(20, 160, 170, 38);
		
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
		IMC.setText("");
		IMC.setFont(new FontUIResource(" Valor IMC: ", 0, 12));
		IMC.setForeground(Color.green);
		minhatelinha.getContentPane().add(IMC);
		IMC.setBounds(20, 280, 110, 30);
		
		JLabel resultados = new JLabel();
		resultados.setText(" Resultados : ");
		resultados.setFont(new FontUIResource(" Resultados : ", 1, 16));
		minhatelinha.getContentPane().add(resultados);
		resultados.setBounds(20, 220, 260, 30);
		
		
		JLabel estadoimc = new JLabel();
		estadoimc.setText("");
		estadoimc.setFont(new FontUIResource(" ", 1, 15));
		estadoimc.setForeground(Color.green);
		minhatelinha.getContentPane().add(estadoimc);
		estadoimc.setBounds(100, 250, 290, 30);
		
		
		
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
	    			saida.setText(String.valueOf(" Estado IMC : "));
	    			estadoimc.setText(String.valueOf(" Abaixo do peso "));
	    			IMC.setText(String.valueOf(" Valor IMC : " + resultado));
	    		} else if (18.5 <= resultado && resultado <= 24.9) {
	    			saida.setText(String.valueOf(" Estado IMC : "));
	    			estadoimc.setText(String.valueOf(" Peso Ideal (parabéns) "));
	    			IMC.setText(String.valueOf(" Valor IMC : " + resultado));
	    		} else if (25 <= resultado && resultado <= 29.9) {
	    			saida.setText(String.valueOf(" Estado IMC :  "));
	    			estadoimc.setText(String.valueOf(" Levemente acima do peso "));
	    			IMC.setText(String.valueOf(" Valor IMC : " + resultado));
	    		} else if(30 <= resultado && resultado <= 34.9) {
	    			saida.setText(String.valueOf(" Estado IMC :  "));
	    			estadoimc.setText(String.valueOf(" Obesidade Grau 1"));
	    			IMC.setText(String.valueOf(" Valor IMC : " + resultado));
	    		} else if(35 <= resultado && resultado <= 39.9) {
	    			saida.setText(String.valueOf(" Estado IMC : "));
	    			estadoimc.setText(String.valueOf(" Obesidade Grau 2 ( severa )"));
	    			IMC.setText(String.valueOf(" Valor IMC : " + resultado));
	    		} else  {
	    			saida.setText(String.valueOf(" Estado IMC : "));
	    			estadoimc.setText(String.valueOf(" Obesidade morbida "));
	    			IMC.setText(String.valueOf(" Valor IMC : " + resultado));
	    		}
				
				
				
				
					
				
				
				
			}
		});
		
		
		minhatelinha.setVisible(true);
	
	
	}

}
