package Principal;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class Nav extends JPanel {
	public Logo logo;
	public JMenuBar navegacion;
	public JMenu Producto,Producto2,Producto3,Producto4,Producto5,Producto6,Producto7;
	public Usuario usuario;
	
	public Nav() {
		this.setLayout(new BorderLayout());
		this.setBounds(0, 0, 1000, 50);
		
		this.logo = new Logo();
		
		this.navegacion = new JMenuBar();
		
		this.usuario = new Usuario("Marcos");
		
		this.add(logo,BorderLayout.WEST);
		this.add(navegacion,BorderLayout.CENTER);
		this.add(usuario,BorderLayout.EAST);
	}

}
