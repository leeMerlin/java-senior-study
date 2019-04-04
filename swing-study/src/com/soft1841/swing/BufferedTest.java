package com.soft1841.swing;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) throws IOException {
        //定义字符串组
        String conten[] = {"你不喜欢我","我一点都不介意",
                                                       "因为我活下来","不是为了取悦你"};
        //创建文件夹
        File file = new File("Word,txt");
        try {
            //创建FileWriter类对象
            FileWriter fw = new FileWriter(file);
            //创建BufferedWriter类对象
            BufferedWriter bufw = new BufferedWriter(fw);
            //遍历循环数组
            for (int k = 0; k < conten.length; k++) {
                //将字符串数组中元素写到磁盘中
                bufw.write(conten[k]);
                //将数组中的单个元素以单行的形式写入文件
                bufw.newLine();
            }
            bufw.close();
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            FileReader fr = new FileReader(file);
            //创建Buffered类对象
            BufferedReader bufr = new BufferedReader(fr);
            String s = null;
            int i = 0;
            //如果文件的文本行数不为null，则进入循环
            while ((s = bufr.readLine()) != null) {
                i++;
                System.out.println("第" + i + "行：");
            }
            bufr.close();
            fr.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

            }
        }
