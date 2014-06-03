package prop.presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaMostrarJerarquia extends JFrame {

	private JPanel contentPane;
	private static JTree arbre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the frame.
	 */
	public vistaMostrarJerarquia() {
		setTitle("Mostrar Jerarquia");
		setResizable(false);
		setMinimumSize(new Dimension(650, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		CtrlPresentacio ctrl = new CtrlPresentacio();
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Biblioteca");
		arbre = new JTree(top);
		arbre.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		JScrollPane treeView = new JScrollPane(arbre);
		treeView.setBounds(10, 20, 610, 360);
		add(treeView);
		ctrl.omplirArbre(top);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaMenuPrincipal panmostrar = new vistaMenuPrincipal();
				panmostrar.setVisible(true);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(vistaMostrarJerarquia.class.getResource("/prop/icons/flecha.png")));
		button.setBounds(10, 426, 65, 35);
		contentPane.add(button);
	}

}
