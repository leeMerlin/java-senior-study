package Timer.Clock;


import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class myWindow {
    public static void
    run(final JFrame f, final int width, final int height){
        SwingUtilities.invokeLater(new Runnable(){

            public void run(){

                f.setTitle("myDesign");
                //窗口退出行为
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //设置窗口大小不可变
                f.setResizable(true);
                //设置窗口打开居中
                f.setLocationRelativeTo(null);
                //窗口大小
                f.setSize(500, 350);
                //展示窗口
                f.setVisible(true);
            }
        });
    }

}