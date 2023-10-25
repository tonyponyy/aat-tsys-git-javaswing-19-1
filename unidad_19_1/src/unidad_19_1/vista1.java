package unidad_19_1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class vista1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	public vista1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 176, 130);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce tu nombre");
		lblNewLabel.setBounds(22, 11, 109, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(22, 28, 109, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Llamame !!");
		
		
		btnNewButton.addActionListener(a1);
		btnNewButton.setBounds(32, 57, 89, 23);
		contentPane.add(btnNewButton);
	}

	
	ActionListener a1 = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    JOptionPane.showMessageDialog(null, "Hola "+textField.getText());
		}
	};
}
