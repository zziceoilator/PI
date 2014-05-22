

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class VentanaPrincipal extends JFrame {

	private JTextField textNombre;
	private JTextField textPrimerApellido;
	private JTextField textSegundoApellido;
	private JTextField textTelefono;
	private JTextField textDescripcion;
	private JPanel contentPane;
	
	Citas ci;
	VentanaCrearCita vcc;
	int estado = 0;
	
	public VentanaPrincipal() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCita = new JMenu("Cita");
		menuBar.add(mnCita);
		
		JMenuItem mntmCrearCita = new JMenuItem("Crear Cita");
		mntmCrearCita.setIcon(new ImageIcon("C:\\Users\\Edgar\\Desktop\\PI\\mas.jpg"));
		mnCita.add(mntmCrearCita);
		mntmCrearCita.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//panelVisible(CrearCita);
				
				JOptionPane.showMessageDialog(contentPane, "Completa todos los campos", "Informacion", JOptionPane.INFORMATION_MESSAGE);

				vcc = new VentanaCrearCita();
				
				/*
				 				
				 if( arg0.getSource() == PanelCentral ) {
					 
				 }
Manel ¡¡¡ Repintar elcuadro con el nuevo panel.
				contentPane.updateUI();
				contentPane.repaint();
				
				repaint();
				

				 */
			}
		});
		
		
		JMenuItem mntmEliminarCita = new JMenuItem("Eliminar Cita");
		mntmEliminarCita.setIcon(new ImageIcon("C:\\Users\\Edgar\\Desktop\\PI\\menos.jpg"));
		mnCita.add(mntmEliminarCita);
		
		JMenu mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		JMenuItem mntmPorNombre = new JMenuItem("Por Nombre");
		mntmPorNombre.setIcon(new ImageIcon("C:\\Users\\Edgar\\Desktop\\PI\\lupa.jpeg"));
		mnConsulta.add(mntmPorNombre);
		
		
		

		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		menuBar.add(mntmSalir);
		mntmSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int var = JOptionPane.showConfirmDialog(null, "¿Estas seguro de que quieres salir?");
				if(var == 0){
					System.exit(0);
					
				}
				
			}
		});
		//Este Es el panel principal
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Panel en blanco.		
				JPanel PanelCentral = new JPanel();
				contentPane.add(PanelCentral);
				PanelCentral.setLayout(new GridLayout(1, 0, 0, 0));
		
				
		/*		
		//Panel para la creacion de citas		
				JPanel CrearCita = new JPanel();
				//PanelCentral.add(CrearCita);
				CrearCita.setLayout(new GridLayout(0, 2, 0, 0));
				CrearCita.setVisible(true);
				
				JTextPane txtpnNombre = new JTextPane();
				txtpnNombre.setEditable(false);
				CrearCita.add(txtpnNombre);
				txtpnNombre.setText("Nombre");
				
				textNombre = new JTextField();
				CrearCita.add(textNombre);
				textNombre.setColumns(10);
				
				JTextPane txtpnPrimerApellido = new JTextPane();
				txtpnPrimerApellido.setEditable(false);
				txtpnPrimerApellido.setText("Primer Apellido");
				CrearCita.add(txtpnPrimerApellido);
				
				textPrimerApellido = new JTextField();
				CrearCita.add(textPrimerApellido);
				textPrimerApellido.setColumns(10);
				
				JTextPane txtpnSegundoApellido = new JTextPane();
				txtpnSegundoApellido.setEditable(false);
				CrearCita.add(txtpnSegundoApellido);
				txtpnSegundoApellido.setText("Segundo Apellido");
				
				textSegundoApellido = new JTextField();
				CrearCita.add(textSegundoApellido);
				textSegundoApellido.setColumns(10);
				
				JTextPane txtpnTelefono = new JTextPane();
				txtpnTelefono.setEditable(false);
				txtpnTelefono.setText("Telefono");
				CrearCita.add(txtpnTelefono);
				
				textTelefono = new JTextField();
				CrearCita.add(textTelefono);
				textTelefono.setColumns(10);
				
				JTextPane txtpnDescripcion = new JTextPane();
				txtpnDescripcion.setEditable(false);
				txtpnDescripcion.setText("Descripcion");
				CrearCita.add(txtpnDescripcion);
				
				textDescripcion = new JTextField();
				CrearCita.add(textDescripcion);
				textDescripcion.setColumns(10);
				
				JButton btnCrearLaCita = new JButton("Crear La Cita");
				btnCrearLaCita.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

					int telef = Integer.parseInt(textTelefono.getText());
					ci = new Citas(textNombre.getText(), textPrimerApellido.getText(), textSegundoApellido.getText(), textDescripcion.getText(), telef);
						
					}
				});
				CrearCita.add(btnCrearLaCita);
				*/
	}

	

				
	}
