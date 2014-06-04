package prop.presentacio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaModificarNomCat extends JFrame {
	private CtrlPresentacio cp;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	public static JTree arbre;
	private DefaultTreeModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaModificarNomCat frame = new vistaModificarNomCat();
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
	
	public vistaModificarNomCat(CtrlPresentacio cpgeneral) {
		cp = cpgeneral;
		inicialitzarComponents();
	}

	/**
	 * Create the frame.
	 */
	
	public vistaModificarNomCat() {
		setResizable(false);
		setTitle("Modificar Nom [Categoria]");
		setMinimumSize(new Dimension(650, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaGestionarCategoria pancat = new vistaGestionarCategoria(cp);
				pancat.setVisible(true);
				dispose();
			}
		});
		
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Biblioteca");
		model = new DefaultTreeModel(top);
		arbre = new JTree(model);
		arbre.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		JScrollPane treeView = new JScrollPane(arbre);
		treeView.setBounds(10, 20, 610, 200);
		getContentPane().add(treeView);
		cp = new CtrlPresentacio();
		cp.ctrlCat.inicialitzarCategories();
		cp.afegirCategoria("Hola", "Biblioteca");
		cp.afegirCategoria("Hola2", "Biblioteca");
		cp.afegirCategoria("Hola3", "Hola2");
		
		cp.ctrlCat.mostrarCategories();
		cp.omplirArbre2(arbre, model);
		//ctrl.omplirArbre(top);
		
		button.setIcon(new ImageIcon(vistaModificarNomCat.class.getResource("/prop/icons/flecha.png")));
		button.setBounds(10, 416, 65, 35);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String vell = textField.getText();
				String nou = textField_1.getText();
				cp.ModificarCategories(vell, nou);
				cp.ctrlCat.mostrarCategories();
				DefaultMutableTreeNode root = (DefaultMutableTreeNode)model.getRoot();
				root.removeAllChildren();
				cp.omplirArbre2(arbre, model);
				cp.ctrlCat.mostrarCategories();
			}
		});
		button_1.setIcon(new ImageIcon(vistaModificarNomCat.class.getResource("/prop/icons/tick.png")));
		button_1.setBounds(559, 416, 65, 35);
		contentPane.add(button_1);
		
		JLabel lblNewLabel = new JLabel("Indica:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(71, 274, 57, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom antic:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(167, 312, 77, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nom nou:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(167, 360, 65, 23);
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
		setResizable(false);
		setTitle("Modificar Nom [Categoria]");
		setMinimumSize(new Dimension(650, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaGestionarCategoria pancat = new vistaGestionarCategoria(cp);
				pancat.setVisible(true);
				dispose();
			}
		});
		
		CtrlPresentacio ctrl = new CtrlPresentacio();
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Biblioteca");
		arbre = new JTree(top);
		arbre.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		JScrollPane treeView = new JScrollPane(arbre);
		treeView.setBounds(10, 20, 610, 200);
		getContentPane().add(treeView);
		//ctrl.omplirArbre(top);
		
		button.setIcon(new ImageIcon(vistaModificarNomCat.class.getResource("/prop/icons/flecha.png")));
		button.setBounds(10, 416, 65, 35);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(vistaModificarNomCat.class.getResource("/prop/icons/tick.png")));
		button_1.setBounds(559, 416, 65, 35);
		contentPane.add(button_1);
		
		JLabel lblNewLabel = new JLabel("Indica:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(71, 274, 57, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom antic:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(167, 312, 77, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nom nou:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(167, 360, 65, 23);
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
}
