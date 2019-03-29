package soft1841;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.SQLOutput;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要写入文件内容");
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        File file = new File("E:/Hello.txt");
        Writer out = new FileWriter(file);
        out.write(chars);
        out.close();


    }
}

