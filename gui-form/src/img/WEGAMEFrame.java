package img;

import javax.swing.*;

public class WEGAMEFrame {
    private JPanel mainPanel;
    private JButton 篮球Button;
    private JButton 英雄联盟Button;
    private JButton 星际战甲Button;
    private JButton 飞车Button;
    private JButton 地下城与勇士Button;

    public static void main(String[] args) {
        JFrame frame = new JFrame("WEGAMEFrame");
        frame.setContentPane(new WEGAMEFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
