package com.soft1841.thread;

import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ComponentPaintFrame extends JFrame {
    private JPanel jPanel;
    private JButton jButton;
    public ComponentPaintFrame(){
        init();
        setTitle("组件绘制");
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void init(){
        //创建JPanel对象的同时，将背景图绘制上去
        JPanel jPanel = new JPanel() {
            protected void paintComponent(Graphics g) {
                try {
                    BufferedImage bg = ImageIO.read(new File("E:/bg.jpg"));
                    g.drawImage(bg,0,0,getWidth(),getHeight(),null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER,200,200));
        add(jPanel);
        JButton jButton = new JButton(){
            protected void paintComponent(Graphics g){
                try {
                    BufferedImage bg = ImageIO.read(new File("E:/JButton.jpg"));
                    g.drawImage(bg,0,0,getWidth(),getHeight(),null);
                    g.drawString("按钮",55,18);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        jButton.setPreferredSize(new Dimension(150,36));
        //不获取焦点
        jButton.setFocusPainted(false);
        //背景透明
        jButton.setContentAreaFilled(false);
        //无边框
        jButton.setBorderPainted(false);
        jPanel.add(jButton);
    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new ComponentPaintFrame();
    }
}
