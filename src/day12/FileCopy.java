package day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args)throws IOException {
        File mkdirs = new File("D:\\目录\\目录的目录\\目录的目录的目录");
        mkdirs.mkdirs();
        File musicCopy = new File("D:\\abc.flac");
        musicCopy.createNewFile();
        FileInputStream input = new FileInputStream("D:\\MUSIC\\安静-周杰伦.flac");
        FileOutputStream output = new FileOutputStream("D:\\复制文件.flac");
        int length = input.available();
        byte[] size = new byte[length];
        input.read(size);
        output.write(size);
        output.close();
        input.close();
    }

}
