package com.soft1841.thread.homework;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
public class homeworkFrame extends JFrame implements ActionListener {
    private int width;
    private int height;
    private TimerTask imgTask;
    private Timer timer;
    private String[] imgs = {"E:/img/1.png", "E:/img/2.png", "E:/img/3.png" };
    private Panel topPanel, leftPanel, cardPanel2, cardPanel, cardPanel3, cardPanel4;
    private JMenu m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11;
    private JMenu n1, n2, n3;
    private JButton  preButton, nextButton, firstButton, lastButton;
    private CardLayout card;

    public homeworkFrame () {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.width;
        height = screenSize.height;
        init();
        setTitle("【百度贴吧】，打造一流的中文社区");
        setSize(width, height);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void init () {
        //设置布局
        setLayout(null);
        topPanel = new Panel();
        topPanel.setBounds(0, 0, 1920, 1020);
        topPanel.setLayout(null);
        add(topPanel);
        //设置顶部
        JLabel imgLabel = new JLabel();
        URL url = homeworkFrame.class.getResource("/img/head.png");
        Icon icon = new ImageIcon(url);
        imgLabel.setIcon(icon);
        imgLabel.setBounds(0, 50, 1980, 200);
        //菜单
        m1 = new JMenu("                        首页");
        m2 = new JMenu("     娱乐明星");
        m3 = new JMenu("     爱综艺");
        m4 = new JMenu("     追剧狂");
        m5 = new JMenu("     看电影");
        m6 = new JMenu("     体育");
        m7 = new JMenu("     小说");
        m8 = new JMenu("     生活家");
        m9 = new JMenu("      闲·趣");
        m10 = new JMenu("     游戏");
        m11 = new JMenu("     动漫宅");
        JMenuBar m = new JMenuBar();
        m.add(m1);
        m.add(m2);
        m.add(m3);
        m.add(m4);
        m.add(m5);
        m.add(m6);
        m.add(m7);
        m.add(m8);
        m.add(m9);
        m.add(m10);
        m.add(m11);
        m.setBounds(0, 0, 1980, 50);
        Font font1 = new Font("仿宋", Font.BOLD, 20);
        n1 = new JMenu("爱综艺");
        n2 = new JMenu("追剧狂");
        n3 = new JMenu("游戏");
        n1.setFont(font1);
        n2.setFont(font1);
        n3.setFont(font1);
        m8.add(n1);
        m8.add(n2);
        m8.add(n3);
        Font font = new Font("微软雅黑", Font.CENTER_BASELINE, 22);
        m1.setFont(font);
        m2.setFont(font);
        m3.setFont(font);
        m4.setFont(font);
        m5.setFont(font);
        m6.setFont(font);
        m7.setFont(font);
        m8.setFont(font);
        m9.setFont(font);
        m10.setFont(font);
        m11.setFont(font);
        //轮播照片
        JLabel bgLabel = new JLabel();
        topPanel.add(bgLabel);
        bgLabel.setBounds(500, 120, 1920, 700);
        CarouselThread ct = new CarouselThread();
        ct.setBgLabel(bgLabel);
        imgTask = new TimerTask() {
            @Override
            public void run () {
                int i = 0;
                int len = imgs.length - 1;
                while (true) {
                    try {
                        File file = new File(imgs[i]);
                        InputStream inputStream = new FileInputStream(file);
                        byte[] bytes = new byte[(int) file.length()];
                        inputStream.read(bytes);
                        Icon icon = new ImageIcon(bytes);
                        bgLabel.setIcon(icon);
                        try {
                            Thread.sleep(6000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        i++;
                        if (i == len) {
                            i = 0;
                        }
                    } catch (IOException e) {
                        System.out.println("IO异常");
                    }
                }
            }
        };
        timer = new Timer();
        timer.schedule(imgTask, 0, 3000);
        //左边竖型导航条
        CardLayout card = new CardLayout();
        leftPanel = new Panel();
//        leftPanel.setLayout(card);
        leftPanel.setBounds(100, 300, 180, 650);
        JButton firstButton = new JButton("赵丽颖刘诗诗粉丝battle");
        firstButton.setFont(font1);
        firstButton.addActionListener(this);
        JButton j2 = new JButton("复联4票房破20亿");
        j2.addActionListener(this);
        j2.setFont(font1);
        JButton j3 = new JButton("潘粤明恋情");
        j3.addActionListener(this);
        j3.setFont(font1);
        JButton nextButton = new JButton("108个城市网友性格报告");
        nextButton.addActionListener(this);
        nextButton.setFont(font1);
        JButton j6 = new JButton("刘诗雯2次11-0夺冠");
        nextButton.addActionListener(this);
        j6.setFont(font1);
        JButton j7 = new JButton("章子怡二胎");
        j7.addActionListener(this);
        j7.setFont(font1);
        JButton j8 = new JButton("高铁晚点乘客训哭车长");
        j8.addActionListener(this);
        j8.setFont(font1);
        JButton preButton = new JButton("仁济医院冲突");
        preButton.addActionListener(this);
        preButton.setFont(font1);
        JButton lastButton = new JButton("工资卡欠999亿");
        lastButton.addActionListener(this);
        lastButton.setFont(font1);
        JButton j11 = new JButton("配角更难忘");
        j11.setFont(font1);
        firstButton.setFocusPainted(false);
        firstButton.setBorderPainted(false);
        j2.setFocusPainted(false);
        j2.setBorderPainted(false);
        j3.setFocusPainted(false);
        j3.setBorderPainted(false);
        nextButton.setFocusPainted(false);
        nextButton.setBorderPainted(false);
        j6.setFocusPainted(false);
        j6.setBorderPainted(false);
        j7.setFocusPainted(false);
        j7.setBorderPainted(false);
        j8.setFocusPainted(false);
        j8.setBorderPainted(false);
        preButton.setFocusPainted(false);
        preButton.setBorderPainted(false);
        lastButton.setFocusPainted(false);
        lastButton.setBorderPainted(false);
        j11.setFocusPainted(false);
        j11.setBorderPainted(false);
        firstButton.setPreferredSize(new Dimension(180, 60));
        j2.setPreferredSize(new Dimension(180, 60));
        j3.setPreferredSize(new Dimension(180, 60));
        nextButton.setPreferredSize(new Dimension(180, 60));
        j6.setPreferredSize(new Dimension(180, 60));
        j7.setPreferredSize(new Dimension(180, 60));
        j8.setPreferredSize(new Dimension(180, 60));
        preButton.setPreferredSize(new Dimension(180, 60));
        lastButton.setPreferredSize(new Dimension(180, 60));
        j11.setPreferredSize(new Dimension(180, 60));
        //右边部分

//总体增加展示
        topPanel.add(imgLabel);
        leftPanel.add(firstButton);
        leftPanel.add(j2);
        leftPanel.add(j3);
        leftPanel.add(nextButton);
        leftPanel.add(j6);
        leftPanel.add(j7);
        leftPanel.add(j8);
        leftPanel.add(preButton);
        leftPanel.add(lastButton);
        leftPanel.add(j11);
        topPanel.add(leftPanel);
        topPanel.add(m);

    }

    public static void main (String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new homeworkFrame();
    }

    @Override
    public void actionPerformed (ActionEvent e) {

        }

    }
