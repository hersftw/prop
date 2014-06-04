package prop.presentacio;
import prop.ctrldomini.*;
import prop.domini.llibre;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class vistaCMELlibre extends JFrame {
	private CtrlPresentacio cp;
	private JPanel contentPane;
	private JTextField textISBN1;
	private JTextField txtboxISBN;
	private JEditorPane editorPane;
	private JTextField textField;
	private JTextField tISBN;
	private JTextField ttitol;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField tautor;
	private JTextField textField_6;
	private JTextField teditorial;
	private JTextField tany;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField tcategoria;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JFrame frame1;
	private int isbn;
	private crtlLlibres jdj = new crtlLlibres();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaCMELlibre frame = new vistaCMELlibre();
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
	
	public vistaCMELlibre(CtrlPresentacio cpgeneral) {
		cp = cpgeneral;
		inicialitzarComponents();
	}
	/**
	 * Create the frame.
	 */
	
	public vistaCMELlibre() {
		jdj.afegirLlibre(123, "abc","abc" ,"abc", 123, "abc");
		setResizable(false);
		setTitle("Consulta/Modifica/Elimina Llibre");
		setMinimumSize(new Dimension(650, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textISBN1 = new JTextField();
		textISBN1.setText("ISBN:");
		textISBN1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textISBN1.setEditable(false);
		textISBN1.setColumns(10);
		textISBN1.setBorder(null);
		textISBN1.setBounds(89, 65, 43, 20);
		contentPane.add(textISBN1);
		
		txtboxISBN = new JTextField();
		txtboxISBN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtboxISBN.addActionListener(new ActionListener() {
			
			//@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println(txtboxISBN.getText());
				isbn = Integer.parseInt(txtboxISBN.getText());
				//System.out.println(isbn);
				//System.out.println(String.valueOf(isbn).length());
				if(String.valueOf(isbn).length() > 9) {
					JOptionPane.showMessageDialog(frame1,  "La mida màxima del ISBN és de 9 dígits");
				}
				else {
					if (!jdj.existeix(isbn)){
						JPanel panel = new JPanel();
						JOptionPane.showMessageDialog(panel, "El llibre no existeix en el sistema");
					}
					else {
						
				    	  llibre ll = jdj.consultarLlibre(isbn);
				    	  tISBN.setText(String.valueOf(isbn));
				    	  ttitol.setText(ll.getTitol());
				    	  tautor.setText(ll.getAutor());
				    	  teditorial.setText(ll.getEditorial());
				    	  tany.setText(String.valueOf(ll.getAny()));
				    	  tcategoria.setText(ll.getCategoria());
					}
				}
				
				
			}
		});
		txtboxISBN.setColumns(10);
		txtboxISBN.setBounds(142, 66, 376, 20);
		final String initialText = "Introdueix l'ISBN i prem enter";
		txtboxISBN.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtboxISBN.setText(initialText);
		txtboxISBN.addFocusListener(new java.awt.event.FocusAdapter() {
		    public void focusGained(java.awt.event.FocusEvent evt) {
		       if (txtboxISBN.getText().equals(initialText)) {
		    	   
		    	  //txtFfrded.selectAll();
		    	  txtboxISBN.setText("");
		    	  txtboxISBN.setFont(new Font("Tahoma", Font.PLAIN, 14));

		    	  
		    	  
		    	  
		    	  
		       }
		    }
		});
		contentPane.add(txtboxISBN);
		
		textField = new JTextField();
		textField.setText("ISBN:");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(220, 220, 220));
		textField.setBounds(142, 154, 43, 20);
		
		contentPane.add(textField);
		
		tISBN = new JTextField();
		tISBN.setColumns(10);
		tISBN.setBounds(210, 155, 259, 20);
		contentPane.add(tISBN);
		
		ttitol = new JTextField();
		ttitol.setColumns(10);
		ttitol.setBounds(210, 186, 259, 20);
		contentPane.add(ttitol);
		
		textField_3 = new JTextField();
		textField_3.setText("T\u00EDtol:");
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(new Color(220, 220, 220));
		textField_3.setBounds(142, 185, 43, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("Autor:");
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBackground(new Color(220, 220, 220));
		textField_4.setBounds(142, 216, 55, 20);
		contentPane.add(textField_4);
		
		tautor = new JTextField();
		tautor.setColumns(10);
		tautor.setBounds(210, 217, 259, 20);
		contentPane.add(tautor);
		
		textField_6 = new JTextField();
		textField_6.setText("Editorial:");
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBackground(new Color(220, 220, 220));
		textField_6.setBounds(142, 247, 55, 20);
		contentPane.add(textField_6);
		
		teditorial = new JTextField();
		teditorial.setColumns(10);
		teditorial.setBounds(210, 248, 259, 20);
		contentPane.add(teditorial);
		
		tany = new JTextField();
		tany.setColumns(10);
		tany.setBounds(210, 279, 259, 20);
		contentPane.add(tany);
		
		textField_9 = new JTextField();
		textField_9.setText("Any:");
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBorder(null);
		textField_9.setBackground(new Color(220, 220, 220));
		textField_9.setBounds(142, 278, 55, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("Categoria:");
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBorder(null);
		textField_10.setBackground(new Color(220, 220, 220));
		textField_10.setBounds(142, 309, 68, 20);
		contentPane.add(textField_10);
		
		tcategoria = new JTextField();
		tcategoria.setColumns(10);
		tcategoria.setBounds(210, 309, 259, 20);
		contentPane.add(tcategoria);
		
		editorPane = new JEditorPane();
		editorPane.setBackground(new Color(220, 220, 220));
		editorPane.setBounds(89, 131, 429, 237);
		contentPane.add(editorPane);
		
		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaGestionarLlibres panllibres = new vistaGestionarLlibres(cp);
				panllibres.setVisible(true);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(vistaCMELlibre.class.getResource("/prop/icons/flecha.png")));
		button.setBounds(10, 416, 65, 35);
		contentPane.add(button);
		
		button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						int isbn2 = Integer.parseInt(tISBN.getText());
						String titol = ttitol.getText();
						String autor = tautor.getText();
						String editorial = teditorial.getText();
						int any = Integer.parseInt(tany.getText());
						String categoria = tcategoria.getText();
						jdj.modificarLlibre(isbn, isbn2, titol, autor, editorial, any, categoria);
						tISBN.setText("");
						ttitol.setText("");
						tautor.setText("");
						teditorial.setText("");
						tany.setText("");
						tcategoria.setText("");		
						
			}
		});
		button_1.setIcon(new ImageIcon(vistaCMELlibre.class.getResource("/prop/icons/tick.png")));
		button_1.setBounds(559, 416, 65, 35);
		contentPane.add(button_1);
		
		button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jdj.eliminarLlibre(isbn);
				tISBN.setText("");
				ttitol.setText("");
				tautor.setText("");
				teditorial.setText("");
				tany.setText("");
				tcategoria.setText("");	
			}
		});
		button_2.setIcon(new ImageIcon(vistaCMELlibre.class.getResource("/prop/icons/Flaticon_48352.png")));
		button_2.setBounds(507, 416, 43, 35);
		contentPane.add(button_2);
	}
	
	public void inicialitzarComponents() {
		setResizable(false);
		setTitle("Consulta/Modifica/Elimina Llibre");
		setMinimumSize(new Dimension(650, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textISBN1 = new JTextField();
		textISBN1.setText("ISBN:");
		textISBN1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textISBN1.setEditable(false);
		textISBN1.setColumns(10);
		textISBN1.setBorder(null);
		textISBN1.setBounds(89, 65, 43, 20);
		contentPane.add(textISBN1);
		
		txtboxISBN = new JTextField();
		txtboxISBN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtboxISBN.addActionListener(new ActionListener() {
			
			//@Override
			public void actionPerformed(ActionEvent e) {
				crtlLlibres jdj = new crtlLlibres();
				//System.out.println(txtboxISBN.getText());
				isbn = Integer.parseInt(txtboxISBN.getText());
				//System.out.println(isbn);
				//System.out.println(String.valueOf(isbn).length());
				if(String.valueOf(isbn).length() > 9) {
					JOptionPane.showMessageDialog(frame1,  "La mida màxima del ISBN és de 9 dígits");
				}
				else {
					if (!jdj.existeix(isbn)){
						JPanel panel = new JPanel();
						JOptionPane.showMessageDialog(panel, "El llibre no existeix en el sistema");
					}
					else {
						
						llibre book = jdj.consultarLlibre(isbn);
						ttitol.setText(book.getTitol());
					}
				}
				
				
			}
		});
		txtboxISBN.setColumns(10);
		txtboxISBN.setBounds(142, 66, 376, 20);
		final String initialText = "Introdueix l'ISBN i prem enter";
		txtboxISBN.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtboxISBN.setText(initialText);
		txtboxISBN.addFocusListener(new java.awt.event.FocusAdapter() {
		    public void focusGained(java.awt.event.FocusEvent evt) {
		       if (txtboxISBN.getText().equals(initialText)) {
		    	   
		    	  //txtFfrded.selectAll();
		    	 /* txtboxISBN.setText("");
		    	  txtboxISBN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		    		int[] any = {2};
		    		StringBuilder titol, autor, editorial, categoria;
			    	//cp.consultarllibre(titol, autor, editorial, any, categoria);
			    	tISBN.setText(String.valueOf(isbn));
			    	ttitol.setText(titol.toString());
			    	tautor.setText(autor.toString());
			    	teditorial.setText(editorial.toString());
			    	tany.setText(String.valueOf(any[0]));
			    	tcategoria.setText(categoria.toString());*/
		    	  
		    	  
		    	  
		    	  
		       }
		    }
		});
		contentPane.add(txtboxISBN);
		
		textField = new JTextField();
		textField.setText("ISBN:");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(220, 220, 220));
		textField.setBounds(142, 154, 43, 20);
		
		contentPane.add(textField);
		
		tISBN = new JTextField();
		tISBN.setColumns(10);
		tISBN.setBounds(210, 155, 259, 20);
		contentPane.add(tISBN);
		
		ttitol = new JTextField();
		ttitol.setColumns(10);
		ttitol.setBounds(210, 186, 259, 20);
		contentPane.add(ttitol);
		
		textField_3 = new JTextField();
		textField_3.setText("T\u00EDtol:");
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(new Color(220, 220, 220));
		textField_3.setBounds(142, 185, 43, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("Autor:");
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBackground(new Color(220, 220, 220));
		textField_4.setBounds(142, 216, 55, 20);
		contentPane.add(textField_4);
		
		tautor = new JTextField();
		tautor.setColumns(10);
		tautor.setBounds(210, 217, 259, 20);
		contentPane.add(tautor);
		
		textField_6 = new JTextField();
		textField_6.setText("Editorial:");
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBackground(new Color(220, 220, 220));
		textField_6.setBounds(142, 247, 55, 20);
		contentPane.add(textField_6);
		
		teditorial = new JTextField();
		teditorial.setColumns(10);
		teditorial.setBounds(210, 248, 259, 20);
		contentPane.add(teditorial);
		
		tany = new JTextField();
		tany.setColumns(10);
		tany.setBounds(210, 279, 259, 20);
		contentPane.add(tany);
		
		textField_9 = new JTextField();
		textField_9.setText("Any:");
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBorder(null);
		textField_9.setBackground(new Color(220, 220, 220));
		textField_9.setBounds(142, 278, 55, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("Categoria:");
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBorder(null);
		textField_10.setBackground(new Color(220, 220, 220));
		textField_10.setBounds(142, 309, 68, 20);
		contentPane.add(textField_10);
		
		tcategoria = new JTextField();
		tcategoria.setColumns(10);
		tcategoria.setBounds(210, 309, 259, 20);
		contentPane.add(tcategoria);
		
		editorPane = new JEditorPane();
		editorPane.setBackground(new Color(220, 220, 220));
		editorPane.setBounds(89, 131, 429, 237);
		contentPane.add(editorPane);
		
		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaGestionarLlibres panllibres = new vistaGestionarLlibres(cp);
				panllibres.setVisible(true);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(vistaCMELlibre.class.getResource("/prop/icons/flecha.png")));
		button.setBounds(10, 416, 65, 35);
		contentPane.add(button);
		
		button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int isbn2 = Integer.parseInt(tISBN.getText());
				String titol = ttitol.getText();
				String autor = tautor.getText();
				String editorial = teditorial.getText();
				int any = Integer.parseInt(tany.getText());
				String categoria = tcategoria.getText();
				//cp.modificarLlibre(isbn, isbn2, titol, autor, editorial, any, categoria);
			}
		});
		button_1.setIcon(new ImageIcon(vistaCMELlibre.class.getResource("/prop/icons/tick.png")));
		button_1.setBounds(559, 416, 65, 35);
		contentPane.add(button_1);
		
		button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//cp.eliminarLlibre(isbn);
				tISBN.setText("");
				ttitol.setText("");
				tautor.setText("");
				teditorial.setText("");
				tany.setText("");
				tcategoria.setText("");	
			}
		});
		button_2.setIcon(new ImageIcon(vistaCMELlibre.class.getResource("/prop/icons/Flaticon_48352.png")));
		button_2.setBounds(507, 416, 43, 35);
		contentPane.add(button_2);
	}
}
