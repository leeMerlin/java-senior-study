package com.soft1841.thread;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


class GetImageByNet extends Object implements Runnable{
    public static void main(String[] args)  {
        GetImageByNet getImageByNet = new GetImageByNet();
        getImageByNet.run();
    }
    @Override
    public void run(){
        try {
            URL url = new URL("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2148278032,3484437448&fm=26&gp=0.jpg");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5*1000);
            InputStream inStream = conn.getInputStream();
            ByteArrayOutputStream out1 = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = inStream.read(buffer)) != -1){
                out1.write(buffer,0,len);
            }
            inStream.close();
            byte[] data = out1.toByteArray();
            File imageFile = new File("F://1.jpg");
            OutputStream out2 = new FileOutputStream(imageFile);

            out2.write(data);
            out2.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}