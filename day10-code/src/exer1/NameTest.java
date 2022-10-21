package exer1;

import java.io.*;
import java.util.HashMap;

public class NameTest {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        BufferedReader br=null;
        try{
            br=new BufferedReader(new FileReader(new File("d:/name.txt")));
            String value=null;
            StringBuffer buffer = new StringBuffer();
            flag: while((value=br.readLine())!=null){
                char[] c=value.toCharArray();
                for (int i = 0; i < c.length; i++) {
                    if(c[i]!=' '){
                        buffer.append(String.valueOf(c[i]));
                    }else{
                        if(map.containsKey(buffer.toString())){
                            int count=map.get(buffer.toString());
                            map.put(buffer.toString(),count+1);
                        }else{
                            map.put(buffer.toString(),1);
                        }
                        buffer.delete(0,buffer.length());
                        continue flag;
                    }

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br!=null){
                try{
                    br.close();
                }catch (IOException e){
                    System.out.println("e.getMessage() = " + e.getMessage());
                }
            }
        }
    }
}
