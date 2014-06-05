package prop.presentacio;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaCanviarOrdre extends JFrame {

	private CtrlPresentacio cp;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static private JTree arbre;
	private DefaultTreeModel model;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaCanviarOrdre frame = new vistaCanviarOrdre();
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

	/**
	 * Create the frame.
	 */
	
	public vistaCanviarOrdre(CtrlPresentacio cpgeneral) {
		cp = cpgeneral;
		inicialitzarComponents();
	}
	
	public void inicialitzarComponents_old() {
		setTitle("Canviar Ordre [Categoria]\r\n");
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
		cp = new CtrlPresentacio();
		cp.ctrlCat.inicialitzarCategories();
		cp.ctrlCat.afegirCategoria("Ciencies", "Biblioteca");
		
		cp.ctrlCat.afegirCategoria("Informatica", "Ciencies");
		cp.ctrlCat.afegirCategoria("Java", "Informatica");
		cp.ctrlCat.afegirCategoria("Informatica", "Ciencies");
		cp.ctrlCat.afegirCategoria("C++", "Informatica");
		cp.ctrlCat.afegirCategoria("Arquitectura Computadors", "Informatica");
		cp.ctrlCat.afegirCategoria("Tecnologia", "Ciencies");
		cp.ctrlCat.afegirCategoria("Computadors", "Tecnologia");
		cp.ctrlCat.afegirCategoria("Art", "Biblioteca");
		cp.ctrlCat.afegirCategoria("Gastronomia", "Biblioteca");
		
		

		
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Biblioteca");
		model = new DefaultTreeModel(top);
		arbre = new JTree(model);
		arbre.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		JScrollPane treeView = new JScrollPane(arbre);
		treeView.setBounds(10, 20, 610, 200);
		getContentPane().add(treeView);
		cp.omplirArbre2(arbre, model);
		//cp.ctrlCat.mostrarCategories();
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arbre.removeAll();
				model.reload();
				String cat1 = textField.getText();
				String cat2 = textField_1.getText();
				cp.canviarCategories(cat1, cat2);
				DefaultMutableTreeNode root = (DefaultMutableTreeNode)model.getRoot();
			
				root.removeAllChildren();
				cp.omplirArbre2(arbre, model);
				cp.ctrlCat.mostrarCategories();
				
				
			}
		});
		button_1.setIcon(new ImageIcon(vistaGestionarEstructura.class.getResource("/prop/icons/tick.png")));
		button_1.setBounds(559, 416, 65, 35);
		contentPane.add(button_1);
		
		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaGestionarCategoria gestcat = new vistaGestionarCategoria(cp);
				gestcat.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(vistaGestionarLlibres.class.getResource("/prop/icons/flecha.png")));
		btnNewButton_2.setBounds(10, 416, 65, 35);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Indica:");
		lblNewLabel.setBounds(71, 274, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Categoria 1:");
		lblNewLabel_1.setBounds(152, 312, 80, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("Categoria 2:");
		label.setBounds(152, 360, 80, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(242, 312, 249, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(242, 360, 249, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}

	
	
	public void inicialitzarComponents() {
		setTitle("Canviar Ordre [Categoria]\r\n");
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
		
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Biblioteca");
		model = new DefaultTreeModel(top);
		arbre = new JTree(model);
		arbre.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		JScrollPane treeView = new JScrollPane(arbre);
		treeView.setBounds(10, 20, 610, 200);
		getContentPane().add(treeView);
		cp.omplirArbre2(arbre, model);
		//cp.ctrlCat.mostrarCategories();
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arbre.removeAll();
				model.reload();
				String cat1 = textField.getText();
				String cat2 = textField_1.getText();
				cp.canviarCategories(cat1, cat2);
				DefaultMutableTreeNode root = (DefaultMutableTreeNode)model.getRoot();
			
				root.removeAllChildren();
				cp.omplirArbre2(arbre, model);
				//cp.ctrlCat.mostrarCategories();
				
				
			}
		});
		button_1.setIcon(new ImageIcon(vistaGestionarEstructura.class.getResource("/prop/icons/tick.png")));
		button_1.setBounds(559, 416, 65, 35);
		contentPane.add(button_1);
		
		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//vistaGestionarCategoria gestcat = new vistaGestionarCategoria(cp);
				//gestcat.setVisible(true);
				//dispose();
				cp.mostraGestioCategories();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(vistaGestionarLlibres.class.getResource("/prop/icons/flecha.png")));
		btnNewButton_2.setBounds(10, 416, 65, 35);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Indica:");
		lblNewLabel.setBounds(71, 274, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Categoria 1:");
		lblNewLabel_1.setBounds(152, 312, 80, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("Categoria 2:");
		label.setBounds(152, 360, 80, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(242, 312, 249, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(242, 360, 249, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
