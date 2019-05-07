package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client3 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1", 10086);
        System.out.println("成功连接上服务器！");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println("服务器给您发送了一条消息："+s);
        bufferedReader.close();
        bufferedReader.close();
    }
}
