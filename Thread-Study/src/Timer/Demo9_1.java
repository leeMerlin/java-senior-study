package Timer;
import java.awt.*;
import javax.swing.*;
    public class Demo9_1 extends JFrame {
        MyPanel mp=null;
        public static void main(String[] args) {
            Demo9_1 demo = new Demo9_1();
        }
        public Demo9_1()
        {
            mp=new MyPanel();
            this.add(mp);
            this.setSize(300, 400);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(true);
        }
    }
    //定义一个吗panel、用于绘制和实现图像
    class MyPanel extends JPanel
    {
        //覆盖jpanel的paint方法
        //Graphics是汇入的中药类，你可以吧他理解成画笔
        public void paint(Graphics g)
        {
            //调用父类函数进行初始化，绝对不可少
            super.paint(g);
            //先画一个园
            g.drawOval(10, 10, 30, 30);


        }
    }

