package Socket;

import java.io.*;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("10.40.133.7",1912);
        System.out.println("成功连上服务器");
        File file = new File("E:/bg.jpg");
        byte[] b = new byte[(int) file.length()];
        InputStream is = new FileInputStream(file);
        is.read(b);
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
    bos.write(b);
    is.close();
    bos.close();
    }
}
