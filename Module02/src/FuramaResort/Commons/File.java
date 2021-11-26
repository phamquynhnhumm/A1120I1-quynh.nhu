package FuramaResort.Commons;

import _bai17_BinaryFILe_Serialization._Baitap.FileUtil;
import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class File  {
    private static BufferedWriter bufferedWriter;
    private static BufferedReader bufferedReader;
    private static String path;

    // ghi file
    public static void writeFile(String[] content, Boolean append) {
        try {
            if(append)
            {
                bufferedWriter = new BufferedWriter(new FileWriter(path, true));

            }else {
                bufferedWriter = new BufferedWriter(new FileWriter(path, false));

            }
            //true ghi tiếp dòng mới, false ghi đè
            bufferedWriter.write(StingUtilss.concat(content,StingUtilss.COMMA));
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // đọc file
    }

    public static List<String> readFile() {
        List<String> arratContent = new ArrayList<String>();

        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                arratContent.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arratContent;
    }
     public  static  void setFullPathFile( String filename)
     {
         StringBuffer paths  = new StringBuffer("D:\\A112011PhamThiQuynhNhu\\Module02\\src\\FuramaResort\\Data\\");
         paths.append(filename);
         paths.append(StingUtilss.CSV);
        File.path = paths.toString();


     }
}
