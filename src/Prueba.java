
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

class Calculadora extends JFrame{
	JTextField entrada, uno;
	JButton porcentaje, raiz,potencia,fraccion;
	
	public Calculadora() {
		setTitle("Calculadora");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(395,500);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JPanel panel= new JPanel();
		panel.setLayout(null);
		panel.setSize(395,500);
		
		//componentes GUI
		JLabel estandar = new JLabel("ESTÁNDAR");
		estandar.setFont(new Font("Arial",Font.BOLD,14));
		estandar.setBounds(5, 5, 100, 10);
		panel.add(estandar);
		
		entrada=new JTextField();
		entrada.setEditable(false);
	  //entrada.setBackground(panel.getBackground());
		entrada.setBounds(250,25,120,20);
		panel.add(entrada);
		
		uno=new JTextField();
		uno.setEditable(false);
		//uno.setBackground(panel.getBackground());
		uno.setBounds(250,50,120,60);
		panel.add(uno);
		
		JButton mc=new JButton ("MC");
		mc.setBounds(10, 120, 60, 30);
		mc.setToolTipText("Borrar toda la memoria");
		panel.add(mc);
		
		JButton mr=new JButton ("MR");
		mr.setBounds(70, 120, 60, 30);
		mr.setToolTipText("Recuperar de memoria");
		panel.add(mr);
		
		JButton mm=new JButton ("M+");
		mm.setBounds(130, 120, 60, 30);
		mm.setToolTipText("Sumar a memoria");
		panel.add(mm);
		
		JButton mmm=new JButton ("M-");
		mmm.setBounds(190, 120, 60, 30);
		mmm.setToolTipText("Restar de memoria");
		panel.add(mmm);
		
		JButton ms=new JButton ("MS");
		ms.setBounds(250, 120, 60, 30);
		ms.setToolTipText("Almacenar en memoria");
		panel.add(ms);
		
		JButton mf=new JButton ("M^");
		mf.setBounds(310, 120, 60, 30);
		mf.setToolTipText("Memoria");
		panel.add(mf);
		
		porcentaje=new JButton("%");
		porcentaje.setBounds(10, 150, 90,60);
		panel.add(porcentaje);
		
		raiz=new JButton("√");
		raiz.setBounds(100, 150, 90, 60);
		panel.add(raiz);
		
		potencia=new JButton("χ²");
		potencia.setBounds(190, 150, 90, 60);
		panel.add(potencia);
		
		fraccion=new JButton("1/x");
		fraccion.setBounds(280, 150, 90, 60);
		panel.add(fraccion);
		
		add(panel);
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
