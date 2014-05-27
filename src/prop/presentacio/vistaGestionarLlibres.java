package prop.presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.geom.FlatteningPathIterator;

public class vistaGestionarLlibres extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaGestionarLlibres frame = new vistaGestionarLlibres();
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
	public vistaGestionarLlibres() {
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
		
		JButton btnNewButton = new JButton("Afegeix llibre");
		btnNewButton.setBounds(211, 108, 198, 88);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Consulta/Modifica/Elimina");
		btnNewButton_1.setBounds(211, 276, 198, 88);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Ricard\\Documents\\GitHub\\prop\\flecha.png"));
		
		
		btnNewButton_2.setBounds(10, 424, 59, 37);
		contentPane.add(btnNewButton_2);
	}
}
