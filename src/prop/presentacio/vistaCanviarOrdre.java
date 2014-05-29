package prop.presentacio;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class vistaCanviarOrdre extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaCanviarOrdre frame = new vistaCanviarOrdre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public vistaCanviarOrdre() {
		setTitle("Canviar Ordre [Categoria]\r\n");
		setResizable(false);
		setMinimumSize(new Dimension(650, 500));
		setMaximumSize(new Dimension(650, 500));
		setPreferredSize(new Dimension(650, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(500, 650));
		contentPane.setMinimumSize(new Dimension(500, 650));
		contentPane.setMaximumSize(new Dimension(500, 650));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(vistaGestionarEstructura.class.getResource("/prop/icons/tick.png")));
		button_1.setBounds(559, 416, 65, 35);
		contentPane.add(button_1);
		
		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.setIcon(new ImageIcon(vistaGestionarLlibres.class.getResource("/prop/icons/flecha.png")));
		btnNewButton_2.setBounds(10, 416, 65, 35);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Indica:");
		lblNewLabel.setBounds(71, 274, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom antic:");
		lblNewLabel_1.setBounds(167, 312, 65, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("Nom nou:");
		label.setBounds(167, 360, 65, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(242, 312, 249, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(242, 360, 249, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
