package soft1841;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        //指定源文件
        File src = new File("D:/dd.jpeg");
        //获取源文件名
        String srcName = src.getName();
        //定位.的位置


        //指定目标文件
        File dest = new File("E/dd.jpeg");
        //创建一个字节数组，大小为源文件，长度转换成int
        byte[] bytes = new byte[(int) src.length()];
        //创建字节输入流
        InputStream in =new FileInputStream(src);
        //源文件读入字节数组
        in.read(bytes);
        //创建字节输出流
        OutputStream out = new FileOutputStream(dest);
        //将字节流输出
        out.write(bytes);
        //关闭输入输出流
        out.close();
        in.close();




    }
}
