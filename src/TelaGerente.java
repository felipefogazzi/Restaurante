import javax.swing.*;
//import java.awt.*;

public class TelaGerente {
	
	private JFrame frame;
	private JLabel label;
	
	public TelaGerente() {
		frame  = new JFrame();
		label = new JLabel("Gerente");
		
		frame.setTitle("Tela do Gerente");
		frame.setSize(300,100);
		frame.setLocation(50,50);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		frame.add(label);
		
		frame.setVisible(true);
	}
}
