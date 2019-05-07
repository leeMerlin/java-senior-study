package com.soft1841.thread;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;

public class TraficLights extends JFrame {
	private JPanel contentPane; // �������
	private JLabel lblImage; // ͼƬ��ǩ

	public static void main(String[] args) {
		TraficLights frame = new TraficLights(); // ��������ͨ�ơ��������
		frame.setVisible(true); // ʹ����ͨ�ơ�����������
	}

	/**
	 * ��������
	 */
	public TraficLights() { // ����ͨ�ơ��Ĺ��췽��
		setResizable(false); // ���ɸı䴰��Ĵ�С
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���رյķ�ʽ
		setBounds(100, 100, 125, 278); // ���ô����С��λ��
		// �������
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setContentPane(contentPane);
		// ͼƬ���
		JPanel imagePane = new JPanel();
		imagePane.setBackground(Color.WHITE);
		imagePane.setBorder(new TitledBorder(null, "红绿灯", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(imagePane);
		imagePane.setLayout(new BorderLayout(0, 0));
		// ��ǩ
		lblImage = new JLabel("");
		lblImage.setBackground(Color.WHITE);
		lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("Green.png")));
		imagePane.add(lblImage, BorderLayout.CENTER);
		
		Thread thread = new TurnColor(lblImage);
		thread.start();
	}
}

class TurnColor extends Thread {
	private JLabel lblImage;
	public TurnColor(JLabel lblImage) { // ��ͼ���ǩΪ�����Ĺ��췽�������ù��췽����ʼ������
		this.lblImage = lblImage;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("Yellow.png"))); // �Ƶ�
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("Red.png"))); // ���
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("Green.png"))); // �̵�
		}
	}
}