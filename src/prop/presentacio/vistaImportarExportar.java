package prop.presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.UIManager;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

public class vistaImportarExportar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaImportarExportar frame = new vistaImportarExportar();
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
	public vistaImportarExportar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnImportar = new JTextPane();
		txtpnImportar.setBackground(UIManager.getColor("Button.background"));
		txtpnImportar.setEditable(false);
		txtpnImportar.setText("Importar:");
		txtpnImportar.setBounds(110, 173, 63, 21);
		contentPane.add(txtpnImportar);
		
		JTextPane txtpnE = new JTextPane();
		txtpnE.setBackground(UIManager.getColor("Button.background"));
		txtpnE.setEditable(false);
		txtpnE.setText("Exportar:");
		txtpnE.setBounds(110, 221, 63, 21);
		contentPane.add(txtpnE);
		
		textField = new JTextField();
		textField.setBounds(199, 173, 199, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 221, 199, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnImportar = new JButton("");
		btnImportar.addActionListener(new ActionListener() { //boto importar
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser jfile = new JFileChooser();
				jfile.showOpenDialog(null);
				jfile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				File file = jfile.getSelectedFile();
				textField.setText(file.getAbsolutePath().toString());
			}
		});
		btnImportar.setIcon(new ImageIcon(vistaImportarExportar.class.getResource("/com/sun/java/swing/plaf/gtk/icons/Directory.gif")));
		btnImportar.setBounds(412, 170, 95, 25);
		contentPane.add(btnImportar);
		
		JButton btnExportar = new JButton("");
		btnExportar.addActionListener(new ActionListener() { //boto exportar
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfile2 = new JFileChooser();
				jfile2.showOpenDialog(null);
				jfile2.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				File file2 = jfile2.getCurrentDirectory();
				textField_1.setText(file2.getAbsolutePath().toString());
			}
		});
		btnExportar.setIcon(new ImageIcon(vistaImportarExportar.class.getResource("/com/sun/java/swing/plaf/gtk/icons/Directory.gif")));
		btnExportar.setBounds(412, 217, 95, 25);
		contentPane.add(btnExportar);
		
		JButton button = new JButton("");
		button.setBounds(553, 435, 63, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(45, 435, 63, 25);
		contentPane.add(button_1);
	}
}
