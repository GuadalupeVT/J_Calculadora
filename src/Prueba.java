
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

class Calculadora extends JFrame{
	JTextField entrada, uno;
	JButton porcentaje, raiz,potencia,fraccion,ce,c,borrar,division,siete,ocho,nueve,multiplicacion;
	JButton cuatro,cinco,seis,resta,unoN,dos,tres,suma,masMenos,cero,punto,igual;
	
	public Calculadora() {
		setTitle("Calculadora");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(395,555);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JPanel panel= new JPanel();
		panel.setLayout(null);
		panel.setSize(395,555);
		
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
		//---------------------------------
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
		
		//---------------------------
		ce=new JButton("CE");
		ce.setBounds(10, 210, 90,60);
		panel.add(ce);
		
		c=new JButton("C");
		c.setBounds(100, 210, 90, 60);
		panel.add(c);
		
		borrar=new JButton("<--");
		borrar.setBounds(190, 210, 90, 60);
		panel.add(borrar);
		
		division=new JButton("÷");
		division.setBounds(280, 210, 90, 60);
		panel.add(division);
		
		//----------------------------------
		siete=new JButton("7");
		siete.setBounds(10, 270, 90,60);
		panel.add(siete);
		
		ocho=new JButton("8");
		ocho.setBounds(100, 270, 90, 60);
		panel.add(ocho);
		
		nueve=new JButton("9");
		nueve.setBounds(190, 270, 90, 60);
		panel.add(nueve);
		
		multiplicacion=new JButton("X");
		multiplicacion.setBounds(280, 270, 90, 60);
		panel.add(multiplicacion);
		
		//------------------------------------
		cuatro=new JButton("4");
		cuatro.setBounds(10, 330, 90,60);
		panel.add(cuatro);
		
		cinco=new JButton("5");
		cinco.setBounds(100, 330, 90, 60);
		panel.add(cinco);
		
		seis=new JButton("6");
		seis.setBounds(190, 330, 90, 60);
		panel.add(seis);
		
		resta=new JButton("-");
		resta.setBounds(280, 330, 90, 60);
		panel.add(resta);
		
		//-----------------------------------
		unoN=new JButton("1");
		unoN.setBounds(10, 390, 90,60);
		panel.add(unoN);
		
		dos=new JButton("2");
		dos.setBounds(100, 390, 90, 60);
		panel.add(dos);
		
		tres=new JButton("3");
		tres.setBounds(190, 390, 90, 60);
		panel.add(tres);
		
		suma=new JButton("+");
		suma.setBounds(280, 390, 90, 60);
		panel.add(suma);
		
		//----------------------
		masMenos=new JButton("+/-");
		masMenos.setBounds(10, 450, 90,60);
		panel.add(masMenos);
		
		cero=new JButton("0");
		cero.setBounds(100, 450, 90, 60);
		panel.add(cero);
		
		punto=new JButton(".");
		punto.setBounds(190, 450, 90, 60);
		panel.add(punto);
		
		igual=new JButton("=");
		igual.setBounds(280, 450, 90, 60);
		panel.add(igual);
		
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
