package Learn_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=null;
        try {
            Properties pros=new Properties();
            fis=new FileInputStream("jdbc.properties");
            pros.load(fis);
            String name=pros.getProperty("name");
            String password=pros.getProperty("password");
            System.out.println("name = " + name);
            System.out.println("password = " + password);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try{
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
