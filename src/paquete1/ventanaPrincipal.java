package paquete1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing. *;

public class ventanaPrincipal extends JFrame implements ActionListener{
	JButton btn1;
	JButton btn2;
	JButton btn3;
	
	JButton changer;
	
	
	
	public ventanaPrincipal() {
		setTitle("Tarea # 1");
		setVisible(true);
		setSize(550, 250);
		setLayout(null);
		
		btn1 = new JButton();
		btn2 = new JButton();
		btn3 = new JButton();
		changer = new JButton();
		
			
		btn1.setText("Azul"); // se inserta un texto e el boton
		btn1.setBounds(200, 10, 150, 30); // se delimita el tamano del boton
		getContentPane().add(btn1); // se lo agrega al panel
		btn1.addActionListener(this);
		
		btn2.setText("Rojo");
		btn2.setBounds(200, 50, 150, 30);//Segundo numero indica que tan arriba o abajo esta el boton
		getContentPane().add(btn2);
		btn2.addActionListener(this);
		
		btn3.setText("Negro");
		btn3.setBounds(200, 100, 150, 30);
		getContentPane().add(btn3);
		btn3.addActionListener(this);
		
		changer.setText("Resize");
		changer.setBounds(200, 150, 150, 30);
		getContentPane().add(changer);
		changer.addActionListener(this);
	}

	public static void main(String[] args) {
		new ventanaPrincipal();

	}
	
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource() == btn1) {
			getContentPane().setBackground(Color.BLUE);
			System.out.println("Blue");
		}
		
		if(evento.getSource() == btn2) {
			getContentPane().setBackground(Color.RED);
			System.out.println("Red");
		}
		
		if(evento.getSource() == btn3) {
			getContentPane().setBackground(Color.BLACK);
			System.out.println("Black");
		}
	}
	
	public void reSize(ActionEvent evento) {
		if(evento.getSource() == changer) {
			
			btn1.setSize(new Dimension(70, 30));
			btn2.setSize(new Dimension(70, 30));
			btn3.setSize(new Dimension(70, 30));
			
			System.out.println("Change!!!");
		}
	}

}
