package Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution{
    public int openLock(String[] deadends,String target){
        if("0000".equals(target)){
            return 0;
        }
        Set<String> dead=new HashSet<>();
        for(String deadend:deadends){
            dead.add(deadend);
        }
        if(dead.contains("0000")){
            return -1;
        }
        int step=0;
        Queue<String> queue = new LinkedList<String>();
        queue.offer("0000");
        Set<String> seen=new HashSet<String>();
        seen.add("0000");


        return 0;
    }
}
public class LockTest {

}
