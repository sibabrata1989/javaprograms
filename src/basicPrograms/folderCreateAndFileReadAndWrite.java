package basicPrograms;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class folderCreateAndFileReadAndWrite {

    private void folderCreate(String path)
    {
        File filePath = new File(path);
        if(!Files.exists(Paths.get(path)))
        {
            filePath.mkdir();
        }
    }

    private void writeFile(String fileName, String content)
    {
        String directory = System.getProperty("user.home");
        String abPath = directory+File.separator+fileName;
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream(abPath);
            fileOutputStream.write(content.getBytes());
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void readFile(String fileName)
    {
        String directory = System.getProperty("user.home");
        String abPath = directory+File.separator+fileName;

        try {
            FileInputStream fileInputStream = new FileInputStream(abPath);
            int ch = fileInputStream.read();
            while(ch!=-1)
            {
                System.out.print((char)ch);
                ch = fileInputStream.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] arg)
    {
        folderCreateAndFileReadAndWrite fc = new folderCreateAndFileReadAndWrite();
        //fc.folderCreate(System.getProperty("user.home"));
        fc.writeFile("testfile.txt","Siba likes to play badminton");
        fc.readFile("testfile.txt");
    }
}
