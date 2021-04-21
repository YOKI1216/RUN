package Day07File;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class test {
    public int a= 0;

    public static void main(String[] args) throws IOException {
        File name1 = new File("test.txt");
        name1.createNewFile();
        FileOutputStream test = new FileOutputStream("test.txt",true);
        test one = new test();
        test.inclass two = one.new inclass();
        two.Inclass();
    }

    public class inclass{
        public  void Inclass(){
            System.out.println("内部类运行了");
        }
    }

}
