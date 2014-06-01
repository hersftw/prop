package prop.presentacio;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaAfegirLlibre extends JFrame {

	private JPanel contentPane;
	private JTextField txtIsbn;
	private JTextField txtTtol;
	private JTextField txtAutor;
	private JTextField txtEditorial;
	private JTextField txtAny;
	private JTextField txtCategoria;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaAfegirLlibre frame = new vistaAfegirLlibre();
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
	public vistaAfegirLlibre() {
		setTitle("Afegir Llibre\r\n");
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
		
		txtIsbn = new JTextField();
		txtIsbn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIsbn.setBorder(null);
		txtIsbn.setEditable(false);
		txtIsbn.setText("ISBN:");
		txtIsbn.setBounds(136, 110, 43, 20);
		
		contentPane.add(txtIsbn);
		txtIsbn.setColumns(10);
		txtTtol = new JTextField();
		txtTtol.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTtol.setEditable(false);
		txtTtol.setBorder(null);
		txtTtol.setText("T\u00EDtol:");
		txtTtol.setBounds(136, 141, 43, 20);
		contentPane.add(txtTtol);
		txtTtol.setColumns(10);
		
		txtAutor = new JTextField();
		txtAutor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAutor.setBorder(null);
		txtAutor.setEditable(false);
		txtAutor.setText("Autor:");
		txtAutor.setBounds(136, 172, 55, 20);
		contentPane.add(txtAutor);
		txtAutor.setColumns(10);
		
		txtEditorial = new JTextField();
		txtEditorial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEditorial.setEditable(false);
		txtEditorial.setBorder(null);
		txtEditorial.setText("Editorial:");
		txtEditorial.setBounds(136, 203, 55, 20);
		contentPane.add(txtEditorial);
		txtEditorial.setColumns(10);
		
		txtAny  = new JTextField();
		txtAny.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAny.setBorder(null);
		txtAny.setEditable(false);
		txtAny.setText("Any:");
		txtAny.setBounds(136, 234, 55, 20);
		contentPane.add(txtAny);
		txtAny.setColumns(10);
		
		txtCategoria = new JTextField();
		txtCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCategoria.setEditable(false);
		txtCategoria.setBorder(null);
		txtCategoria.setText("Categoria:");
		txtCategoria.setBounds(136, 265, 68, 20);
		contentPane.add(txtCategoria);
		txtCategoria.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(204, 204, 259, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(204, 111, 259, 20);
		contentPane.add(textField_1);
		textField.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				String titol = textField.getText();
			}
		});
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(204, 142, 259, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(204, 173, 259, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(204, 235, 259, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(204, 265, 259, 20);
		contentPane.add(textField_5);
		
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(vistaGestionarEstructura.class.getResource("/prop/icons/tick.png")));
		button_1.setBounds(559, 416, 65, 35);
		contentPane.add(button_1);
		
		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaGestionarLlibres llibreria = new vistaGestionarLlibres();
				llibreria.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(vistaGestionarLlibres.class.getResource("/prop/icons/flecha.png")));
		btnNewButton_2.setBounds(10, 416, 65, 35);
		contentPane.add(btnNewButton_2);
		
		
	}

}
