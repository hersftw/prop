package prop.presentacio;

import prop.ctrldomini.ctrlPersistencia;
import prop.presentacio.CtrlPresentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaCrearCategoria extends JFrame {

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			int x = 10;
			int y = 10;
			public void actionPerformed(ActionEvent e) {
				
				//JLabel label = new JLabel("pene");
				//label.setBounds(x, y, 50, 50);
				//getContentPane().add(label);
				//getContentPane().repaint();
				//System.out.println(getContentPane().getComponentCount());
				//y+=20;
			}
		});
		btnNewButton.setBounds(123, 92, 97, 25);
		getContentPane().add(btnNewButton);
	}
}
