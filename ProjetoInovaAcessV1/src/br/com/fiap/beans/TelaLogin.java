package br.com.fiap.beans;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaLogin extends JFrame implements ActionListener{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String loginPadrao = "admin@inovacess.io", senhaPadrao = "inovacess";
	private JTextField lblLogin, lblSenha;
	private JButton lblEntrar;
	//private ImageIcon imagem = new ImageIcon(getClass().getResource("logo.png"));
	//private JLabel lblLogo = new JLabel(imagem);

	public TelaLogin() {
		setTitle("InovaAcess - Login");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		
		lblLogin = new JTextField();
		lblLogin.setText("Digite seu email:");
		lblLogin.setBounds(100, 100, 300, 50);
		
		lblSenha = new JTextField();
		lblSenha.setText("Digite sua senha:");
		lblSenha.setBounds(100, 150, 300, 50);
		lblSenha.setVisible(true);
		
		lblEntrar = new JButton("Entrar");
		lblEntrar.setBounds(190, 250, 100, 50);
		lblEntrar.setVisible(true);
		
		lblEntrar.addActionListener(this); // coloca ação no botão no evento actionListener
		
		
		//add(lblLogo);
		add(lblSenha);
		add(lblLogin);
		add(lblEntrar);
		
	}
	
	public void abrirTela() {
		//abrir a tela
		Tela t = new Tela();		
	}
	
	//validarLogin
	public Tela validarLogin(String e, String s) {
		if(loginPadrao.equals(lblLogin.getText()) && senhaPadrao.equals(lblSenha.getText())) {
			abrirTela();
			setVisible(false);
		} else if(loginPadrao.isEmpty() && senhaPadrao.isEmpty()){
			JOptionPane.showMessageDialog(null, "Campos vazios, por favor preencha-os", "InovaAcess", JOptionPane.WARNING_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Login errado, Faça-o novamente.", "InovaAcess", JOptionPane.WARNING_MESSAGE);
		}
		return null;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		validarLogin(lblLogin.getText(), lblSenha.getText());
	}

}
