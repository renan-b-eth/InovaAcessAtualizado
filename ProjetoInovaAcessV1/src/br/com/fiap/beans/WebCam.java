package br.com.fiap.beans;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

import javax.swing.JFrame;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;

public class WebCam extends JFrame implements Runnable {
	//variaveis do tipo OpenCV
	
	private VideoCapture video;
	private Mat frame;
	private BufferedImage buff;
	
	public WebCam() {
		frameInit();
		//System.loadLibrary(Core.NATIVE_LIBRARY_NAME); // carrega todas as bibliotecas do opencv assim que iniciar
		
		new Thread(this).start(); // 
	}
	
	@Override
	//desenha o componente do swing
	public void paintComponents(Graphics g) {
		//aqui é a recursividade
		super.paintComponents(g);
		
		if(buff == null) {
			return; // sai do metodo
		}
		// desenhar a imagem no painel
		g.drawImage(buff, 20, 20, buff.getWidth(), buff.getHeight(), null);
		
	}
	
	//metodo que captura as imagens
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.video = new VideoCapture(0); // 0 webcam principal 1 webcam secundaria
		this.frame = new Mat();
			if(video.isOpened()) { // webcam está gravando? se sim fará um loop
				while(true) {
					video.read(frame); // vai salvar os videos no frame
					if(!frame.empty()) { // verificar se o frame e não está vazio
						MatToBufferedImage(frame);
						this.repaint(); // repintar na tela toda vez;
					}
				}
			}
	}

	
	//metodo que converte a imagem em buffered image
	private void MatToBufferedImage(Mat mat) {

		int x = mat.width();
		int y = mat.height();
		int canal = mat.channels(); // canal apenas rgb tratamento se a camera for hexa é outro codigo
		
		byte[] source = new byte[x*y*canal]; // vetor do tamanho da imagem
		mat.get(0,0,source);
		buff = new BufferedImage(x, y, BufferedImage.TYPE_3BYTE_BGR);
		final byte[] saida = ((DataBufferByte) buff.getRaster().getDataBuffer()).getData();
		System.arraycopy(source, 0, saida, 0, source.length);
		
	}
	
}
