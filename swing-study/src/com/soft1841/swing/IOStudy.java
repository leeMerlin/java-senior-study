package com.soft1841.swing;
/**
 * Txt文件阅读器窗体
 *
 * @author 李沛
 * 2019.4.1
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class IOStudy extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton confirmButton;
    private JPanel topPanel;
    private JTextField contentArea;


    public IOStudy() {
        init();
        setTitle("文本阅读");
        setSize(new Dimension(640, 480));
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void init() {
        inputField = new JTextField(20);
        confirmButton = new JButton("确定");
        topPanel = new JPanel();
        topPanel.add(inputField);
        topPanel.add(confirmButton);
        add(topPanel, BorderLayout.NORTH);
        contentArea = new JTextField();
        confirmButton.addActionListener(this);
        add(contentArea, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new IOStudy();
    }

    @Override
    public void actionPerformed(ActionEvent e) {



    }
}