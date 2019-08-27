package brness.pac22.SetAndMap;

import java.util.Map;
import java.util.TreeMap;

public class CountOccurrenceofWords {
    public static void main(String[] args) {
        String text="Good morning. Have a good day."+"Have a good class. Have fun!";
        Map<String,Integer> map=new TreeMap<>();
        String[] word=text.split("[ \n\t\r,.?!(){};:]");
        for (int i=0;i<word.length;i++){
            String key=word[i].toLowerCase();

            if(key.length()>0){
                if(map.get(key)==null){
                    map.put(key,1);
                }
                else {
                    int value=map.get(key);
                    value++;
                    map.put(key,value);//由于是一样的key，所以map会自动更新value
                }
            }
        }
        System.out.println(map+"\n");
    }
}
