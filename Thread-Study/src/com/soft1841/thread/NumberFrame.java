package com.soft1841.thread;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberFrame extends JFrame implements ActionListener {
    private JLabel numberlabel;
    private JButton pauseBtn, resumeBtn;
    private NumberThread numberThread;

    public NumberFrame() {
        this.numberlabel = numberlabel;
        init();
        setTitle("线程的暂停与恢复");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pauseBtn) {
        }
        numberThread.pauseThread();
        if (e.getSource() == resumeBtn) {
        }
        numberThread.resumeThread();
    }


    private void init() {
        pauseBtn = new JButton("暂停");
        resumeBtn = new JButton("恢复");
        pauseBtn.addActionListener(this);
        resumeBtn.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font = new Font("微软雅黑", Font.BOLD, 5);
        numberlabel.setFont(font);
        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 190));
        add(numberlabel);
        add(pauseBtn);
        add(resumeBtn);
        numberThread = new NumberThread();
        numberThread.setNumLabe1(numberlabel);
        Thread thread = new Thread(numberThread);
        thread.start();
    }
}





