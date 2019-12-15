package nioDemo;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class nioOut {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("a.txt");
        FileChannel ch = fos.getChannel();
        ByteBuffer all = ByteBuffer.allocate(1024);
        String str="nnnnn的四大干阿顺丰到付nn";
        all.put(str.getBytes());
        all.flip();
        ch.write(all);
        fos.close();
    }
}
