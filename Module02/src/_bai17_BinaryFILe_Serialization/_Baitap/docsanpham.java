package _bai17_BinaryFILe_Serialization._Baitap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class docsanpham {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Object obj = null;
        //đọc  file bawnfd objiectinout
        FileInputStream fif = new FileInputStream("sanpham.txt");
        ObjectInputStream ois= new ObjectInputStream(fif);
        // đọc đối tượng ra
      obj = ois.readObject();
        ois.close();
        fif.close();
        if(obj == null)
        {
            System.out.println(" rỗng");
        }
         else
        {
            System.out.println(obj);
        }
    }

}
