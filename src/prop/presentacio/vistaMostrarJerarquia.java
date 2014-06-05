package prop.presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaMostrarJerarquia extends JFrame {
	private CtrlPresentacio cp;
	private JPanel contentPane;
	private static JTree arbre;
	DefaultMutableTreeNode top;
	DefaultTreeModel model;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaMostrarJerarquia frame = new vistaMostrarJerarquia();
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
	
	public vistaMostrarJerarquia(CtrlPresentacio cpgeneral) {
		cp = cpgeneral;
		inicialitzarComponents();
	}
	/**
	 * Create the frame.
	 */
	public void inicialitzarComponents() {
		setTitle("Mostrar Jerarquia");
		setResizable(false);
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
				//vistaMenuPrincipal panmostrar = new vistaMenuPrincipal();
				//panmostrar.setVisible(true);
				//dispose();
				cp.mostraPrincipal();
			}
		});
		button.setIcon(new ImageIcon(vistaMostrarJerarquia.class.getResource("/prop/icons/flecha.png")));
		button.setBounds(10, 426, 65, 35);
		contentPane.add(button);
	}

}
