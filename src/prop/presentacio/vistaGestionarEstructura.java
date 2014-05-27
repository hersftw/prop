package prop.presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;


public class vistaGestionarEstructura extends JFrame {

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
					vistaGestionarEstructura frame = new vistaGestionarEstructura();
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
	public vistaGestionarEstructura() {
		setTitle("Gestionar Estructura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblN = new JLabel("N\u00BA Ubicacions:");
		lblN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblN.setBounds(122, 243, 136, 25);
		contentPane.add(lblN);
		
		JLabel lblNPrestatges = new JLabel("N\u00BA Prestatges:");
		lblNPrestatges.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNPrestatges.setBounds(122, 315, 136, 25);
		contentPane.add(lblNPrestatges);
		
		textField = new JTextField();
		textField.setBounds(268, 242, 241, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(268, 314, 241, 35);
		contentPane.add(textField_1);
		
		JLabel lblEscullLaForma = new JLabel("Escull la forma de l'estructura:");
		lblEscullLaForma.setBounds(234, 29, 239, 35);
		contentPane.add(lblEscullLaForma);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(vistaGestionarEstructura.class.getResource("/prop/icons/tick.png")));
		button_1.setBounds(559, 416, 65, 35);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(vistaGestionarEstructura.class.getResource("/prop/icons/flecha.png")));
		button_2.setBounds(10, 416, 65, 35);
		contentPane.add(button_2);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(vistaGestionarEstructura.class.getResource("/prop/icons/linealdef.png")));
		button.setBounds(186, 87, 99, 112);
		contentPane.add(button);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(vistaGestionarEstructura.class.getResource("/prop/icons/conicadef.png")));
		button_3.setBounds(373, 90, 106, 112);
		contentPane.add(button_3);
	}

}
