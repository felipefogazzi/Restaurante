import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaLogin implements ActionListener {

	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JTextField textField;
	private JButton button;
	
	public TelaLogin() {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel("Codigo:");
		textField = new JTextField(5);
		button = new JButton("Login");
		
		frame.setTitle("Tela de Login");
		frame.setSize(300,100);
		frame.setLocation(50,50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		frame.add(panel);
		
		button.addActionListener(this);
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		new TelaGerente();
	}
}
