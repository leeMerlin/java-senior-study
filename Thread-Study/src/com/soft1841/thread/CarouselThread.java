package com.soft1841.thread;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class  CarouselThread implements Runnable{
    //准备图片路径数据
    private String[] imgs = {"E:/carousel/1.jpg","E:/carousel/2.jpg","E:/carousel/3.jpg","E:/carousel/4.jpg","E:/carousel/5.jpg",};
    //定义一个图片标签
    public void setBglabel(JLabel bglabel) {this.bglabel = bglabel;}
    private JLabel bglabel;

    public void main(String[] args) {
        this.bglabel = bglabel;
    }

    @Override
    public void run() {
        int i = 0;
        int len = imgs.length - 1;
        while (true){
            //通过路径定义File对象
            try {
                File file = new File(imgs[i]);
                InputStream inputStream = new FileInputStream(file);
                byte[] bytes = new byte[(int) file.length()];
                inputStream.read(bytes);
                Icon icon = new ImageIcon(bytes);
                bglabel.setIcon(icon);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
                if (i == len) {
                    i = 0;
                }
            }catch (IOException e ){
                System.out.println("IO异常");
            }
        }
    }
}
