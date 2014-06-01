package prop.presentacio;

import prop.ctrldomini.ctrlCategories;
import prop.ctrldomini.ctrlPersistencia;
import prop.presentacio.CtrlPresentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class vistaCrearCategoria extends JFrame implements TreeSelectionListener {

	private static JTree arbre;
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

	/**
	 * Create the frame.
	 */
	public vistaCrearCategoria() {
		setMinimumSize(new Dimension(650, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		CtrlPresentacio ctrl = new CtrlPresentacio();
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Biblioteca");
		arbre = new JTree(top);
		arbre.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		JScrollPane treeView = new JScrollPane(arbre);
		treeView.setBounds(20, 20, 300, 200);
		add(treeView);
		ctrl.omplirArbre(top);
		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			int x = 10;
			int y = 10;
			public void actionPerformed(ActionEvent e) {
				System.out.println(arbre.getTopLevelAncestor());
				//JLabel label = new JLabel("pene");
				//label.setBounds(x, y, 50, 50);
				//getContentPane().add(label);
				//getContentPane().repaint();
				//System.out.println(getContentPane().getComponentCount());
				//y+=20;
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
