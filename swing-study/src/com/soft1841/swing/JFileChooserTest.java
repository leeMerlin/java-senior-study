package com.soft1841.swing;

import javax.swing.*;

public class JFileChooserTest extends JFrame {
    private JButton chooseBtn;
    public JFileChooserTest() {
        init();
        setTitle("JFilechoosertest");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    private void init() {
        chooseBtn = new JButton();

    }


}
