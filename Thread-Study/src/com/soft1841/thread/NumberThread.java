package com.soft1841.thread;

import javax.swing.*;

public class NumberThread implements Runnable {
    private JLabel numLabe1;

    public void setNumLabe1(JLabel numLabe1) {
        this.numLabe1 = numLabe1;
    }

    private final Object lock = new Object();
    private boolean pause = false;

    //调用该方法实现线程暂停
    void pauseThread() {
        pause = true;
    }

    //调用该方法实现线程的暂停
    void resumeTheard() {
        pause = false;
        synchronized (lock) {
            lock.notify();
        }
    }

    //这个方法之能在run 方法中实现，不然会阻塞主线程，导致页面无响应
    void onPause() {
        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        int index = 0;
        while (true) {
            while (pause) {
                onPause();
            }
            try {
                numLabe1.setText(String.valueOf(index));

                Thread.sleep(500);
                ++index;
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public void resumeThread() {
        pause = false;
        synchronized (lock) {
            lock.notify();
        }
    }
}
