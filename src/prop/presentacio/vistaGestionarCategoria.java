package prop.presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setResizable(false);
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
		btnCrearCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaCrearCategoria panelcrea = new vistaCrearCategoria();
				panelcrea.setVisible(true);
			}
		});
		btnCrearCategoria.setName("");
		btnCrearCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCrearCategoria.setBounds(235, 50, 171, 49);
		contentPane.add(btnCrearCategoria);
		
		JButton btnModificarNom = new JButton("Modificar Nom");
		btnModificarNom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaModificarNomCat panmodif = new vistaModificarNomCat();
				panmodif.setVisible(true);
				dispose();
			}
		});
		btnModificarNom.setName("");
		btnModificarNom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnModificarNom.setBounds(235, 150, 171, 49);
		contentPane.add(btnModificarNom);
		
		JButton btnCanviarOrdre = new JButton("Canviar Ordre");
		btnCanviarOrdre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*vistaCanviarOrdre panordre = new vistaCanviarOrdre();
				 panordre.setVisible(true);
				 dispose();
				 */
			}
		});
		btnCanviarOrdre.setName("");
		btnCanviarOrdre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCanviarOrdre.setBounds(235, 253, 171, 49);
		contentPane.add(btnCanviarOrdre);
		
		JButton btnEliminarCategoria = new JButton("Eliminar Categoria");
		btnEliminarCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaEliminarCategoria panelim = new vistaEliminarCategoria();
				panelim.setVisible(true);
				dispose();
			}
		});
		btnEliminarCategoria.setName("");
		btnEliminarCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEliminarCategoria.setBounds(235, 351, 171, 49);
		contentPane.add(btnEliminarCategoria);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaMenuPrincipal panmenu = new vistaMenuPrincipal();
				panmenu.setVisible(true);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(vistaGestionarCategoria.class.getResource("/prop/icons/flecha.png")));
		button.setBounds(10, 416, 65, 35);
		contentPane.add(button);
	}

}
