package chapter18.Car_Picture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest {

   public static void main(String[] args) throws IOException {
         URL url=new URL("http://global-autonews.com/data/editor/1712/547134d6ff203f94c44dc2bcedf18fa4_1512475532_9036.jpg");
         URLConnection urlCon = url.openConnection();
         InputStream is=urlCon.getInputStream();
         BufferedInputStream br = new BufferedInputStream(is);
         File file = new File("Car.jpg");
         FileOutputStream fos = new FileOutputStream(file);
         BufferedOutputStream bos = new BufferedOutputStream(fos);
         
         byte[] buffer = new byte[1024];
         int size = 0;
         while((size = br.read(buffer))!=-1) {
            bos.write(buffer,0,size);
         }
         br.close();
         bos.close();
         System.out.println("이미지가 서버에서 로컬 컴퓨터로 복사되었어요");
   }
}
