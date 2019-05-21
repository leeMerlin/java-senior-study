import javax.swing.*;

public class WangYiCloud {
    private JPanel mainPanel;
    private JPanel leftpanel;
    private JButton 搜索Button;
    private JButton 发现Button;
    private JButton MVButton;
    private JButton 朋友Button;

    public static void main(String[] args) {
        JFrame frame = new JFrame("WangYiCloud");
        frame.setContentPane(new WangYiCloud().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
