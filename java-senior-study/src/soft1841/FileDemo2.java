package soft1841;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File folder = new File("E://Hello.txt");
        if (!folder.exists()){
            folder.mkdirs();
          File file = new File( folder+ "/" + "hello.txt");
          if (!file.exists());
           file.createNewFile();
        }
    }
}
