package prop.presentacio;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaGestionarSolucions extends JFrame {
	private CtrlPresentacio cp;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtLlibre;
	private JTextField txtLlibre_1;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaGestionarSolucions frame = new vistaGestionarSolucions();
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
	
	public vistaGestionarSolucions(CtrlPresentacio cpgeneral) {
		cp = cpgeneral;
		inicialitzarComponents();
	}

	/**
	 * Create the frame.
	 */
	public void inicialitzarComponents() {
		setTitle("Gestionar Solucions\r\n");
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
		
		textField = new JTextField();
		textField.setBounds(226, 148, 250, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(226, 186, 250, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtLlibre = new JTextField();
		txtLlibre.setBorder(null);
		txtLlibre.setEditable(false);
		txtLlibre.setText("Llibre 1:");
		txtLlibre.setBounds(155, 148, 50, 20);
		contentPane.add(txtLlibre);
		txtLlibre.setColumns(10);
		
		txtLlibre_1 = new JTextField();
		txtLlibre_1.setBorder(null);
		txtLlibre_1.setText("Llibre 2:");
		txtLlibre_1.setEditable(false);
		txtLlibre_1.setColumns(10);
		txtLlibre_1.setBounds(155, 186, 50, 20);
		contentPane.add(txtLlibre_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(155, 70, 190, 20);
		contentPane.add(comboBox);
		
		table = new JTable();
		table.setBounds(128, 250, 362, 138);
		contentPane.add(table);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(vistaGestionarEstructura.class.getResource("/prop/icons/tick.png")));
		button_1.setBounds(559, 416, 65, 35);
		contentPane.add(button_1);
		
		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//vistaMenuPrincipal panmenu = new vistaMenuPrincipal();
				//panmenu.setVisible(true);
				//dispose();
				cp.mostraPrincipal();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(vistaGestionarLlibres.class.getResource("/prop/icons/flecha.png")));
		btnNewButton_2.setBounds(10, 416, 65, 35);
		contentPane.add(btnNewButton_2);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//vistaMenuPrincipal panmenu = new vistaMenuPrincipal();
				//panmenu.setVisible(true);
				//dispose();
				cp.mostraPrincipal();
			}
		});
		btnNewButton.setIcon(new ImageIcon(vistaGestionarSolucions.class.getResource("/prop/icons/floppy.png")));
		btnNewButton.setBounds(499, 416, 50, 35);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(vistaGestionarSolucions.class.getResource("/prop/icons/Flaticon_48352.png")));
		btnNewButton_1.setBounds(440, 416, 50, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnGenerarSoluci = new JButton("Generar Soluci\u00F3");
		btnGenerarSoluci.setBounds(408, 53, 126, 54);
		contentPane.add(btnGenerarSoluci);
	}
}
