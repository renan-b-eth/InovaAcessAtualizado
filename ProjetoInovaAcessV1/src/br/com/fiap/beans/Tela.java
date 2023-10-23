package br.com.fiap.beans;

import javax.swing.*;

import org.opencv.core.Core;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame implements ActionListener{
	
	/**
	 * TELA INICIAL
	 */
	
	
	private static final long serialVersionUID = 1L;
	JLabel lblLogo = new JLabel();
	JLabel lblLogo2 = new JLabel();
	JPanel pnlpainel = new JPanel();
	JButton btnSair = new JButton();
	private ImageIcon imagem = new ImageIcon(getClass().getResource("..//Imagens//imagem.png"));
	private JLabel lblLogo3 = new JLabel(imagem);
	
	
	public Tela() {
		//System.loadLibrary(Core.NATIVE_LIBRARY_NAME); //essa parte precisa pedir ajuda ao professor pois não atualiza a biblioteca
		//Configuração da tela inicial
		setTitle("InovaAcess - WEBCAM Mouse");
		setSize(800,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		
		//lblLogo.setIcon(new ImageIcon("C:\\Users\\logonrmlocal\\Desktop\\pasta2\\projetoInovaAcess\\InovaAcessBeta\\src\\imagens\\logo.png"));
		//pnlpainel.add(lblLogo);
		
		//Label titulo
		
		JLabel lblTitulo = new JLabel("WEBCAM");
		lblTitulo.setBounds(200, 200, 50, 50);
		
		//Configurações do botão
		
		JButton btnSair2 = new JButton("SAIR");
		btnSair2.setBounds((getX()-btnSair2.getX()/2), 380, 200, 50);
		btnSair2.setFont(new Font("Arial", Font.BOLD, 30));
		btnSair2.setForeground(new Color(20,20,20));
		btnSair2.setBackground(new Color(50,50,50));
		//Faz a ação do botão
		btnSair2.addActionListener(this);
		btnSair2.setVisible(true);
		
		JButton btnHabWeb = new JButton("Habilitar WebCam");
		btnHabWeb.setBounds((getX()-btnSair2.getX()/2)+100, 200, 300, 50);
		btnHabWeb.setFont(new Font("Arial", Font.BOLD, 20));
		btnHabWeb.setForeground(new Color(20,20,20));
		btnHabWeb.setBackground(new Color(32, 198, 122));
		//ação do actionlisterner nesse botão
		btnHabWeb.addActionListener(this::abrirWebcam);
		
		
		
		JButton btnDesCamera = new JButton("Desativar CameraMouse");
		btnDesCamera.setBounds((getX()-btnSair2.getX()/2)+100, 300, 300, 50);
		btnDesCamera.setFont(new Font("Arial", Font.BOLD, 20));
		btnDesCamera.setForeground(new Color(20,20,20));
		btnDesCamera.setBackground(new Color(161, 13, 13));
		//ação do actionlisterner nesse botão
		btnDesCamera.addActionListener(this::desativarWebcam);
		btnDesCamera.setVisible(true);
		
		
		//imagem
		lblLogo3.setVisible(false);
		lblLogo3.setBounds((getX()-lblLogo3.getX()),10,205,170);
		
		//ADD AS TELAS NO PROJETO
		add(btnSair2);
		add(btnHabWeb);
		add(btnDesCamera);
		add(lblTitulo);
		add(lblLogo3);
		add(pnlpainel);
		validate();
	}
	
	//Faz a ação do botao
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);	
	}
	
	public void abrirWebcam(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "abriu a webcam", "InovaAcess", JOptionPane.WARNING_MESSAGE);
		//imagem estatico apenas de demonstração
		lblLogo3.setVisible(true);
		WebCam webcam = new WebCam();
		webcam.setVisible(true);
		this.add(webcam);//adiciona no frame
		
	}
	
	public void desativarWebcam(ActionEvent e) {
		//aqui será para desativar o cameramouse, mas por agora está apenas uma imagem estatica
		lblLogo3.setVisible(false);
	}
	
}
