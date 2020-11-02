package paquete1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing. *;

public class ventanaPrincipal extends JFrame implements ActionListener{
	JButton btn1;
	JButton btn2;
	JButton btn3;
	
	
	
	public ventanaPrincipal() {
		setTitle("Tarea # 1");
		setVisible(true);
		setSize(550, 250);
		setLayout(null);
		
		btn1 = new JButton();
		btn2 = new JButton();
		btn3 = new JButton();
		
		btn1.setText("Azul");
		btn1.setBounds(200, 10, 150, 30);
		getContentPane().add(btn1);
		btn1.addActionListener(this);
		
		btn2.setText("Rojo");
		btn2.setBounds(200, 50, 150, 30);//Segundo numero indica que tan arriba o abajo esta el boton
		getContentPane().add(btn2);
		btn2.addActionListener(this);
		
		btn3.setText("Negro");
		btn3.setBounds(200, 100, 150, 30);
		getContentPane().add(btn3);
		btn3.addActionListener(this);
	}

	public static void main(String[] args) {
		new ventanaPrincipal();

	}
	
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource() == btn1) {
			getContentPane().setBackground(Color.BLUE);
		}
		
		if(evento.getSource() == btn2) {
			getContentPane().setBackground(Color.RED);
		}
		
		if(evento.getSource() == btn3) {
			getContentPane().setBackground(Color.BLACK);
		}
	}

}
