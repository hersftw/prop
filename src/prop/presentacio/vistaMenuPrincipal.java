package prop.presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaMenuPrincipal extends JFrame {
	private CtrlPresentacio cp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaMenuPrincipal frame = new vistaMenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public vistaMenuPrincipal(CtrlPresentacio cpgeneral) {
		cp = cpgeneral;
		inicialitzarComponents();
	}
	/**
	 * Create the frame.
	 */
	public void inicialitzarComponents() {
		setResizable(false);
		setPreferredSize(new Dimension(800, 800));
		setMaximizedBounds(new Rectangle(0, 0, 0, 0));
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(40, 11, 584, 462);
		getContentPane().add(panel);
		
		
		JButton button = new JButton("Gestionar Estructura");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vistaGestionarEstructura panelest = new vistaGestionarEstructura(); 
		        panelest.setVisible(true);
		        dispose(); 
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button.setName("");
		button.setBounds(75, 216, 171, 49);
		panel.add(button);
		
		JLabel lblNewLabel = new JLabel("Disposici\u00F3 de llibres");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(55, 26, 483, 66);
		panel.add(lblNewLabel);
		
		JLabel lblAUnaBiblioteca = new JLabel("a una biblioteca");
		lblAUnaBiblioteca.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblAUnaBiblioteca.setBounds(94, 109, 421, 55);
		panel.add(lblAUnaBiblioteca);
		
		JButton button_2 = new JButton("Mostrar Jerarquia");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaMostrarJerarquia panmenu = new vistaMostrarJerarquia();
				panmenu.setVisible(true);
				dispose();
			}
		});
		button_2.setName("");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_2.setBounds(75, 288, 171, 49);
		panel.add(button_2);
		
		JButton button_3 = new JButton("Gestionar Categoria");
		button_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				vistaGestionarCategoria panelcat = new vistaGestionarCategoria();
				panelcat.setVisible(true);
				dispose();
				
			}
		});
		
		button_3.setName("");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_3.setBounds(296, 216, 171, 49);
		panel.add(button_3);
		
		JButton button_4 = new JButton("Gestionar Llibres");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaGestionarLlibres panmenu = new vistaGestionarLlibres();
				panmenu.setVisible(true);
				dispose();
			}
		});
		button_4.setName("");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_4.setBounds(296, 288, 171, 49);
		panel.add(button_4);
		
		JButton button_5 = new JButton("Gestionar Solucions");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaGestionarSolucions pansolu = new vistaGestionarSolucions();
				pansolu.setVisible(true);
				dispose();
			}
		});
		button_5.setName("");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_5.setBounds(75, 358, 171, 49);
		panel.add(button_5);
		
		JButton btnCarregarexportarDades = new JButton("Importar/Exportar Dades");
		btnCarregarexportarDades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vistaImportarExportar panimex = new vistaImportarExportar();
				panimex.setVisible(true);
			}
		});
		btnCarregarexportarDades.setName("");
		btnCarregarexportarDades.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCarregarexportarDades.setBounds(296, 358, 171, 49);
		panel.add(btnCarregarexportarDades);
	}

		
}
