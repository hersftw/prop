package prop.presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaMostrarJerarquia extends JFrame {

	private JPanel contentPane;

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
