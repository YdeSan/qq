package nioDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class OutIn {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("b.txt");

        FileChannel Inch = fis.getChannel();
        FileChannel Outch = fos.getChannel();

        //复制
        Outch.transferFrom(Inch,0,Inch.size());

        fis.close();
        fos.close();
    }
}
