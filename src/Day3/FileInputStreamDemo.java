package Day3;

import java.io.*;

public class FileInputStreamDemo {

    public  static void main(String[] args) throws Exception{
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("C://Users/sabdu/abc.txt"));
            fos = new FileOutputStream("C://Users/sabdu/abcd.txt");
            System.out.println("File is open");
            int i;
            while ((i = fis.read()) != -1) {
//                System.out.println((char) i);
                fos.write(i);
            }
        } catch (IOException e1){
            e1.printStackTrace();

        }
        finally {
            try {
                assert fis != null;
                fis.close();
                assert fos != null;
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileReader fr = null;
        FileWriter fw = null;
        fr = new FileReader("C://Users/sabdu/abcd.txt");
        fw = new FileWriter("C://Users/sabdu/abcde.txt");
        int ch;
        while((ch=fr.read())!=-1){
            fw.write(ch);
        }
        fr.close();
        fw.close();
    }
}
