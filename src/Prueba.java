
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
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
		mc.setOpaque(false);
		mc.setContentAreaFilled(false);
		mc.setBorderPainted(false);
		panel.add(mc);
		
		JButton mr=new JButton ("MR");
		mr.setBounds(70, 120, 60, 30);
		mr.setToolTipText("Recuperar de memoria");
		mr.setOpaque(false);
		mr.setContentAreaFilled(false);
		mr.setBorderPainted(false);
		panel.add(mr);
		
		JButton mm=new JButton ("M+");
		mm.setBounds(130, 120, 60, 30);
		mm.setToolTipText("Sumar a memoria");
		mm.setOpaque(false);
		mm.setContentAreaFilled(false);
		mm.setBorderPainted(false);
		panel.add(mm);
		
		JButton mmm=new JButton ("M-");
		mmm.setBounds(190, 120, 60, 30);
		mmm.setToolTipText("Restar de memoria");
		mmm.setOpaque(false);
		mmm.setContentAreaFilled(false);
		mmm.setBorderPainted(false);
		panel.add(mmm);
		
		JButton ms=new JButton ("MS");
		ms.setBounds(250, 120, 60, 30);
		ms.setToolTipText("Almacenar en memoria");
		ms.setOpaque(false);
		ms.setContentAreaFilled(false);
		ms.setBorderPainted(false);
		panel.add(ms);
		
		JButton mf=new JButton ("M^");
		mf.setBounds(310, 120, 60, 30);
		mf.setToolTipText("Memoria");
		mf.setOpaque(false);
		mf.setContentAreaFilled(false);
		mf.setBorderPainted(false);
		panel.add(mf);
		
		
		JLabel sep=new JLabel("<html><font color=\"gray\">___________________________________________________</font></html>");
		sep.setBounds(10,122,400,30);
		panel.add(sep);
		
		//---------------------------------
		JLabel texto1= new JLabel("  %");
		texto1.setFont(new Font("Arial",Font.BOLD,24));
		porcentaje=new JButton();
		porcentaje.setBounds(10, 150, 90,60);
		porcentaje.setOpaque(false);
		porcentaje.setContentAreaFilled(false);
		porcentaje.setBorderPainted(false);
		porcentaje.add(texto1);
		panel.add(porcentaje);
		
		JLabel texto2 = new JLabel("  √");
		texto2.setFont(new Font("Arial",Font.BOLD,24));
		raiz=new JButton();
		raiz.setBounds(100, 150, 90, 60);
		raiz.setOpaque(false);
		raiz.setContentAreaFilled(false);
		raiz.setBorderPainted(false);
		raiz.add(texto2);
		panel.add(raiz);
		
		JLabel texto3 = new JLabel("  χ²");
		texto3.setFont(new Font("Arial",Font.BOLD,24));
		potencia=new JButton();
		potencia.setBounds(190, 150, 90, 60);
		potencia.setOpaque(false);
		potencia.setContentAreaFilled(false);
		potencia.setBorderPainted(false);
		potencia.add(texto3);
		panel.add(potencia);
		
		JLabel texto4 = new JLabel("  1/x");
		texto4.setFont(new Font("Arial",Font.BOLD,24));
		fraccion=new JButton();
		fraccion.setBounds(280, 150, 90, 60);
		fraccion.setOpaque(false);
		fraccion.setContentAreaFilled(false);
		fraccion.setBorderPainted(false);
		fraccion.add(texto4);
		panel.add(fraccion);
		
		//---------------------------
		JLabel texto5= new JLabel("  CE");
		texto5.setFont(new Font("Arial",Font.BOLD,20));
		ce=new JButton();
		ce.setBounds(10, 210, 90,60);
		ce.setBackground(Color.LIGHT_GRAY);
		ce.setBorderPainted(false);
		ce.add(texto5);
		panel.add(ce);
		
		JLabel texto6= new JLabel("  C");
		texto6.setFont(new Font("Arial",Font.BOLD,20));
		c=new JButton();
		c.setBounds(100, 210, 90, 60);
		c.setBackground(Color.LIGHT_GRAY);
		c.setBorderPainted(false);
		c.add(texto6);
		panel.add(c);
		
		JLabel texto7= new JLabel(" <---");
		texto7.setFont(new Font("Arial",Font.BOLD,20));
		borrar=new JButton();
		borrar.setBounds(190, 210, 90, 60);
		borrar.setBackground(Color.LIGHT_GRAY);
		borrar.setBorderPainted(false);
		borrar.add(texto7);
		panel.add(borrar);
		
		JLabel texto8= new JLabel("  ÷");
		texto8.setFont(new Font("Arial",Font.BOLD,30));
		division=new JButton();
		division.setBounds(280, 210, 90, 60);
		division.setBackground(Color.LIGHT_GRAY);
		division.setBorderPainted(false);
		division.add(texto8);
		panel.add(division);
		
		//----------------------------------
		JLabel texto9= new JLabel("  7");
		texto9.setFont(new Font("Arial",Font.BOLD,30));
		siete=new JButton();
		siete.setBounds(10, 270, 90,60);
		siete.setBackground(Color.LIGHT_GRAY);
		siete.setBorderPainted(false);
		siete.add(texto9);
		panel.add(siete);
		
		JLabel texto10= new JLabel("  8");
		texto10.setFont(new Font("Arial",Font.BOLD,30));
		ocho=new JButton();
		ocho.setBounds(100, 270, 90, 60);
		ocho.setBackground(Color.LIGHT_GRAY);
		ocho.setBorderPainted(false);
		ocho.add(texto10);
		panel.add(ocho);
		
		JLabel texto11= new JLabel("  9");
		texto11.setFont(new Font("Arial",Font.BOLD,30));
		nueve=new JButton();
		nueve.setBounds(190, 270, 90, 60);
		nueve.setBackground(Color.LIGHT_GRAY);
		nueve.setBorderPainted(false);
		nueve.add(texto11);
		panel.add(nueve);
		
		JLabel texto12= new JLabel("  X");
		texto12.setFont(new Font("Arial",Font.BOLD,26));
		multiplicacion=new JButton();
		multiplicacion.setBounds(280, 270, 90, 60);
		multiplicacion.setBackground(Color.LIGHT_GRAY);
		multiplicacion.setBorderPainted(false);
		multiplicacion.add(texto12);
		panel.add(multiplicacion);
		
		//------------------------------------
		JLabel texto13= new JLabel("  4");
		texto13.setFont(new Font("Arial",Font.BOLD,30));
		cuatro=new JButton();
		cuatro.setBounds(10, 330, 90,60);
		cuatro.setBackground(Color.LIGHT_GRAY);
		cuatro.setBorderPainted(false);
		cuatro.add(texto13);
		panel.add(cuatro);
		
		JLabel texto14= new JLabel("  5");
		texto14.setFont(new Font("Arial",Font.BOLD,30));
		cinco=new JButton();
		cinco.setBounds(100, 330, 90, 60);
		cinco.setBackground(Color.LIGHT_GRAY);
		cinco.setBorderPainted(false);
		cinco.add(texto14);
		panel.add(cinco);
		
		JLabel texto15= new JLabel("  6");
		texto15.setFont(new Font("Arial",Font.BOLD,30));
		seis=new JButton();
		seis.setBounds(190, 330, 90, 60);
		seis.setBackground(Color.LIGHT_GRAY);
		seis.setBorderPainted(false);
		seis.add(texto15);
		panel.add(seis);
		
		JLabel texto16= new JLabel("   -");
		texto16.setFont(new Font("Arial",Font.BOLD,26));
		resta=new JButton();
		resta.setBounds(280, 330, 90, 60);
		resta.setBackground(Color.LIGHT_GRAY);
		resta.setBorderPainted(false);
		resta.add(texto16);
		panel.add(resta);
		
		//-----------------------------------
		JLabel texto17= new JLabel("  1");
		texto17.setFont(new Font("Arial",Font.BOLD,30));
		unoN=new JButton();
		unoN.setBounds(10, 390, 90,60);
		unoN.setBackground(Color.LIGHT_GRAY);
		unoN.setBorderPainted(false);
		unoN.add(texto17);
		panel.add(unoN);
		
		JLabel texto18= new JLabel("  2");
		texto18.setFont(new Font("Arial",Font.BOLD,30));
		dos=new JButton();
		dos.setBounds(100, 390, 90, 60);
		dos.setBackground(Color.LIGHT_GRAY);
		dos.setBorderPainted(false);
		dos.add(texto18);
		panel.add(dos);
		
		JLabel texto19= new JLabel("  3");
		texto19.setFont(new Font("Arial",Font.BOLD,30));
		tres=new JButton();
		tres.setBounds(190, 390, 90, 60);
		tres.setBackground(Color.LIGHT_GRAY);
		tres.setBorderPainted(false);
		tres.add(texto19);
		panel.add(tres);
		
		JLabel texto20= new JLabel("   +");
		texto20.setFont(new Font("Arial",Font.BOLD,26));
		suma=new JButton();
		suma.setBounds(280, 390, 90, 60);
		suma.setBackground(Color.LIGHT_GRAY);
		suma.setBorderPainted(false);
		suma.add(texto20);
		panel.add(suma);
		
		//----------------------
		JLabel texto21= new JLabel(" +/-");
		texto21.setFont(new Font("Arial",Font.BOLD,28));
		masMenos=new JButton();
		masMenos.setBounds(10, 450, 90,60);
		masMenos.setBackground(Color.LIGHT_GRAY);
		masMenos.setBorderPainted(false);
		masMenos.add(texto21);
		panel.add(masMenos);
		
		JLabel texto22= new JLabel("  0");
		texto22.setFont(new Font("Arial",Font.BOLD,30));
		cero=new JButton();
		cero.setBounds(100, 450, 90, 60);
		cero.setBackground(Color.LIGHT_GRAY);
		cero.setBorderPainted(false);
		cero.add(texto22);
		panel.add(cero);
		
		JLabel texto23= new JLabel("  .");
		texto23.setFont(new Font("Arial",Font.BOLD,30));
		punto=new JButton();
		punto.setBounds(190, 450, 90, 60);
		punto.setBackground(Color.LIGHT_GRAY);
		punto.setBorderPainted(false);
		punto.add(texto23);
		panel.add(punto);
		
		JLabel texto24= new JLabel("  =");
		texto24.setFont(new Font("Arial",Font.BOLD,32));
		igual=new JButton();
		igual.setBounds(280, 450, 90, 60);
		igual.setBackground(Color.LIGHT_GRAY);
		igual.setBorderPainted(false);
		igual.add(texto24);
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
