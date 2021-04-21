package Day07File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class mainCode {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        String path = file.getPath();
        String name = file.getName();
        System.out.println(path+name);
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream("fos.txt",true);
       byte[] b ="你好".getBytes();
        fos.write(b);
        fos.close();
    }
}
