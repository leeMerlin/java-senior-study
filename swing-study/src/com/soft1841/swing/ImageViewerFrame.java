package com.soft1841.swing;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  ImageViewerFrame extends JFrame implements ActionListener {
    private JButton chooseBtn,nextBtn,preBtn;
    private JFileChooser fileChooser;
    private JPanel centerPanel,bottomPanel;
    private CardLayout cardLayout;

    public ImageViewerFrame(){
        init();
        setTitle("使用卡片布局实现多图浏览");
        setSize(900,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init() {
        chooseBtn = new JButton("选择图片");
        preBtn = new JButton("前一张");
        nextBtn = new JButton("后一张");
        bottomPanel.add(chooseBtn);
        bottomPanel.add(preBtn);
        bottomPanel.add(nextBtn);
        preBtn.addActionListener(this);
        nextBtn.addActionListener(this);
        chooseBtn.addActionListener(this);
        add(chooseBtn, BorderLayout.NORTH);

        centerPanel = new JPanel();
        cardLayout = new CardLayout();
        centerPanel.setLayout(cardLayout);
        centerPanel.setBackground(new Color(40,42,52));
        add(centerPanel);
    }


    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.frameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new ImageViewerFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chooseBtn){
            System.out.println();
        }
        if (e.getSource() ==  preBtn){

        }
    }
}