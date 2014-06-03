package prop.presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaEliminarCategoria extends JFrame {
	private CtrlPresentacio cp;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaEliminarCategoria frame = new vistaEliminarCategoria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	
	public void mostrarVista() {
		this.setVisible(true);
	}
	
	public vistaEliminarCategoria(CtrlPresentacio cpgeneral) {
		cp = cpgeneral;
		inicialitzarComponents();
	}
	/**
	 * Create the frame.
	 */
	public void inicialitzarComponents() {
		setTitle("Eliminar Categoria [Categoria]");
		setMinimumSize(new Dimension(650, 500));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaGestionarCategoria pancat = new vistaGestionarCategoria();
				pancat.setVisible(true);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(vistaEliminarCategoria.class.getResource("/prop/icons/flecha.png")));
		button.setBounds(10, 426, 65, 35);
		contentPane.add(button);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCategoria.setBounds(167, 332, 77, 23);
		contentPane.add(lblCategoria);
		
		JLabel lblIndicaLaCategoria = new JLabel("Indica la categoria a eliminar:");
		lblIndicaLaCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIndicaLaCategoria.setBounds(71, 274, 208, 23);
		contentPane.add(lblIndicaLaCategoria);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(251, 335, 256, 20);
		contentPane.add(textField);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(vistaEliminarCategoria.class.getResource("/prop/icons/tick.png")));
		button_1.setBounds(569, 426, 65, 35);
		contentPane.add(button_1);
	}

}
