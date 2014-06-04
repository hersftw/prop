package prop.presentacio;

import prop.ctrldomini.ctrlCategories;
import prop.ctrldomini.ctrlPersistencia;
import prop.presentacio.CtrlPresentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class vistaCrearCategoria extends JFrame implements TreeSelectionListener {

	private CtrlPresentacio cp;
	private static JTree arbre;
	private DefaultTreeModel model;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	DefaultMutableTreeNode top;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaCrearCategoria frame = new vistaCrearCategoria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void mostrarVista() {
		this.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	
	public vistaCrearCategoria(CtrlPresentacio cpgeneral) {
		cp = cpgeneral;
		inicialitzarComponents();
	}
	
	public vistaCrearCategoria() {
		cp = new CtrlPresentacio();
		setResizable(false);
		setTitle("Crear Categoria [Categoria]");
		setMinimumSize(new Dimension(650, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		top = new DefaultMutableTreeNode("Biblioteca");
		model = new DefaultTreeModel(top);
		arbre = new JTree(model);
		arbre.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		final JScrollPane treeView = new JScrollPane(arbre);
		treeView.setBounds(10, 20, 610, 200);
		getContentPane().add(treeView);
		cp.omplirArbre(arbre, model);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaGestionarCategoria pancat = new vistaGestionarCategoria(cp);
				pancat.setVisible(true);
				dispose();
			}
		});
		
		button.setIcon(new ImageIcon(vistaModificarNomCat.class.getResource("/prop/icons/flecha.png")));
		button.setBounds(10, 416, 65, 35);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//cp = new CtrlPresentacio();
				//cp.ctrlCat.inicialitzarCategories();
				/*cp.ctrlCat.afegirCategoria("Hola", "Biblioteca");
				cp.ctrlCat.afegirCategoria("Hola2", "Hola");
				cp.ctrlCat.afegirCategoria("Hola3", "Hola2");
				cp.ctrlCat.afegirCategoria("Hola4", "Hola3");*/
				String pare= textField.getText();
				String nom = textField_1.getText();
				cp.ctrlCat.mostrarCategories();
				cp.afegirCategoria(nom, pare);
				cp.ctrlCat.mostrarCategories();
				//top = new DefaultMutableTreeNode("Biblioteca");
				//model = new DefaultTreeModel(top);
				//arbre = new JTree(model);
				//arbre.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
				//final JScrollPane treeView = new JScrollPane(arbre);
				//treeView.setBounds(10, 20, 610, 200);
				//getContentPane().add(treeView);
				cp.omplirArbre(arbre, model);
			}
		});
		button_1.setIcon(new ImageIcon(vistaModificarNomCat.class.getResource("/prop/icons/tick.png")));
		button_1.setBounds(559, 416, 65, 35);
		contentPane.add(button_1);
		
		JLabel lblNewLabel = new JLabel("Indica:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(71, 274, 57, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Categoria Superior:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(126, 312, 118, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Categoria Nova:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(126, 360, 106, 23);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(250, 315, 256, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(250, 363, 256, 20);
		contentPane.add(textField_1);
	}
	
	public void inicialitzarComponents() {
		setMinimumSize(new Dimension(650, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		CtrlPresentacio ctrl = new CtrlPresentacio();
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Biblioteca");
		model = new DefaultTreeModel(top);
		arbre = new JTree(model);
		arbre.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		JScrollPane treeView = new JScrollPane(arbre);
		treeView.setBounds(10, 20, 610, 200);
		getContentPane().add(treeView);
		ctrl.omplirArbre(arbre, model);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(123, 92, 400, 25);
		getContentPane().add(btnNewButton);
	}

	@Override
	public void valueChanged(TreeSelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
