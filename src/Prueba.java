
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

class Calculadora extends JFrame{
	
	public Calculadora() {
		setTitle("Calculadora chafa");
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
		
		//componentes GUI
		JLabel estandar = new JLabel("ESTÁNDAR");
		estandar.setBounds(1, 0, 100, 10);
		add(estandar);
	}
}

public class Prueba {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Calculadora();
				
			}
		});

	}
}
