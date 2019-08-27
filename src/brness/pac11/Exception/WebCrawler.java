package brness.pac11.Exception;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a URL:");
        String url=input.nextLine();
        crawler(url);
    }

    public static void crawler(String startingURL){
        ArrayList<String> listofPendingURLs=new ArrayList<>();
        ArrayList<String> listofTraversedURLs=new ArrayList<>();

        listofPendingURLs.add(startingURL);
        while (!listofPendingURLs.isEmpty()&&listofTraversedURLs.size()<=100){
            String urlString=listofPendingURLs.remove(0);
            if(!listofTraversedURLs.contains(urlString)){
                listofTraversedURLs.add(urlString);
                System.out.println("Crawl "+urlString);

                for(String s:getSubURLs(urlString)){
                    if(!listofTraversedURLs.contains(s))
                        listofPendingURLs.add(s);
                }
            }
        }
    }

    public static ArrayList<String> getSubURLs(String urlString){
        ArrayList<String> list=new ArrayList<>();

        try{
            URL url=new URL(urlString);
            Scanner input=new Scanner(url.openStream());
            int current=0;
            while (input.hasNext()){
                String line=input.nextLine();
                current=line.indexOf("http://"+current);
                while (current>0){
                    int endIndex=line.indexOf("\"",current);
                    if(endIndex>0){
                        list.add(line.substring(current,endIndex));
                        current=line.indexOf("http://",endIndex);
                    }
                    else
                        current=-1;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
}
