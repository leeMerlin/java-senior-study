package com.soft1841.thread;

import javax.swing.*;

public class CarouselFrame extends JFrame {
    JLabel bgLabel;

    public void init() {
        bgLabel = new JLabel();
        CarouselThread carouselThread = new CarouselThread();
        carouselThread.setBglabel(bgLabel);
        add(bgLabel);
        Thread thread = new Thread(carouselThread);
        thread.start();

    }
    public CarouselFrame(){
        init();
        setTitle("图片轮播");
        setSize(1920,1080);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args) {
        new CarouselFrame();
    }
}
