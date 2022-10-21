package Test;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class method_interfaces_test {
    @Test
    public void test1(){
        happyTime(478.93,money-> System.out.println("price: "+money));
        Consumer<String> con1=str-> System.out.println(str);
        con1.accept("400");
        con1=System.out::println;
        con1.accept("beijing");
    }
    public void happyTime(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }
    @Test
    public void test2(){
        List<String> list = Arrays.asList("北京","天津","京都","京东","京城");
        System.out.println("filterString(list,s -> s.contains(\"京\")) = " + filterString(list, s -> s.contains("京")));


    }
    public List<String> filterString(List<String> list, Predicate<String> predicate){
        ArrayList<String> filterList=new ArrayList<>();
        for(String s:list){
            if(predicate.test(s)){
                filterList.add(s);
            }
        }
        return filterList;
    }

    @Test
    public void test3(){

    }
    String minWindow(String s, String t){
        HashMap<Character, Integer> need=new HashMap<>();
        HashMap<Character, Integer> window=new HashMap<>();
        for(char c : t.toCharArray()){
            if(!need.containsKey(c)){
                need.put(c,0);
            }else{
                int i=need.get(c);
                need.put(c,i+1);
            }
        }
        int left=0, right=0;
        int valid=0;
        int start=0, len=Integer.MAX_VALUE;
        while(right<s.length()){
            char c=s.charAt(right);
            right++;
            if(need.get(c)!=0){
                if(!window.containsKey(c)){
                    window.put(c,0);
                }else{
                    int i = window.get(c);
                    window.put(c,i+1);
                }
            }
            while(valid==need.size()){
                if(right-left<len){
                    start=left;
                    len=right-left;
                }
                char d=s.charAt(left);
                left++;
                if(need.get(d)!=0){
                    if(window.get(d)==need.get(d)){
                        valid--;
                        window.put(c,window.get(c)-1);
                    }
                }
            }
        }
        return len==Integer.MAX_VALUE?"":s.substring(start,len);
    }
}






















