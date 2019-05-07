package Timer;

import javax.swing.*;

public class AutomaticTyping implements Runnable{
    int x = 1350;
    int y = 1080;
    private JFrame frame;

    public static void main(String[] args){
        ATy aty = new ATy();
    Thread t = new Thread(aty);
    t.start();
    }

    @Override
    public void run() {

    }
}
class ATy implements Runnable{ String wenben ="少壮不努力，老大敲代码";
public void run(){
    for(int i=0; i<wenben.length();i++) {
        System.out.println(wenben.charAt(i));
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}}




