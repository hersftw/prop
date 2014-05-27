package prop.presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Window.Type;
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

public class vistaMenuPrincipal extends JFrame {

	private JPanel contentPane;

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

	/**
	 * Create the frame.
	 */
	public vistaMenuPrincipal() {
		setPreferredSize(new Dimension(800, 800));
		setMaximizedBounds(new Rectangle(0, 0, 600000, 600000));
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0,5));
		
		Component verticalStrut = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut_1);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut_2);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut_3);
		
		Component verticalStrut_12 = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut_12);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMinimumSize(new Dimension(4, 0));
		contentPane.add(horizontalStrut);
		
		JButton btnNewButton = new JButton("Gestionar Estructura");
		btnNewButton.setBounds(31, 117, 169, 23);
		contentPane.add(btnNewButton);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		horizontalStrut_6.setSize(new Dimension(5, 5));
		contentPane.add(horizontalStrut_6);
		
		JButton btnGestionarLlibres = new JButton("Gestionar Llibres");
		btnGestionarLlibres.setBounds(241, 160, 169, 23);
		contentPane.add(btnGestionarLlibres);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_1);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut_4);
		
		Component verticalStrut_7 = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut_7);
		
		Component verticalStrut_6 = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut_6);
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut_5);
		
		Component verticalStrut_13 = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut_13);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setPreferredSize(new Dimension(10, 0));
		contentPane.add(horizontalStrut_2);
		
		JButton btnCarregarexportarDades = new JButton("Carregar/Exportar Dades");
		btnCarregarexportarDades.setBounds(241, 206, 169, 23);
		contentPane.add(btnCarregarexportarDades);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_7);
		
		JButton btnGestionarSolucions = new JButton("Gestionar Solucions");
		btnGestionarSolucions.setBounds(31, 206, 169, 23);
		contentPane.add(btnGestionarSolucions);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_3);
		
		Component verticalStrut_8 = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut_8);
		
		Component verticalStrut_9 = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut_9);
		
		Component verticalStrut_10 = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut_10);
		
		Component verticalStrut_11 = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut_11);
		
		Component verticalStrut_14 = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut_14);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_4);
		
		JButton btnGestionarCategoria = new JButton("Gestionar Categoria");
		btnGestionarCategoria.setBounds(241, 117, 169, 23);
		contentPane.add(btnGestionarCategoria);
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_8);
		
		JButton btnMostrarJerarquia = new JButton("Mostrar Jerarquia");
		btnMostrarJerarquia.setBounds(31, 160, 169, 23);
		contentPane.add(btnMostrarJerarquia);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_5);
	}
}
