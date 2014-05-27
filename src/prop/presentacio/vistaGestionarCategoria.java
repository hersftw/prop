package prop.presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Font;

public class vistaGestionarCategoria extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaGestionarCategoria frame = new vistaGestionarCategoria();
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
	public vistaGestionarCategoria() {
		setTitle("Gestionar Categoria");
		setPreferredSize(new Dimension(650, 500));
		setMinimumSize(new Dimension(650, 500));
		setMaximumSize(new Dimension(650, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCrearCategoria = new JButton("Crear Categoria");
		btnCrearCategoria.setName("");
		btnCrearCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCrearCategoria.setBounds(235, 50, 171, 49);
		contentPane.add(btnCrearCategoria);
		
		JButton btnModificarNom = new JButton("Modificar Nom");
		btnModificarNom.setName("");
		btnModificarNom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnModificarNom.setBounds(235, 150, 171, 49);
		contentPane.add(btnModificarNom);
		
		JButton btnCanviarOrdre = new JButton("Canviar Ordre");
		btnCanviarOrdre.setName("");
		btnCanviarOrdre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCanviarOrdre.setBounds(235, 253, 171, 49);
		contentPane.add(btnCanviarOrdre);
		
		JButton btnEliminarCategoria = new JButton("Eliminar Categoria");
		btnEliminarCategoria.setName("");
		btnEliminarCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEliminarCategoria.setBounds(235, 351, 171, 49);
		contentPane.add(btnEliminarCategoria);
	}

}
