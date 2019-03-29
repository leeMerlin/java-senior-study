package soft1841;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/README.md");
        //判定如果file不存在，则创建新文件
        if (!file.exists()){
            file.createNewFile();
        }
    }
}
