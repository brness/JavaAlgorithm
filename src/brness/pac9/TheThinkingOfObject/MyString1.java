package brness.pac9.TheThinkingOfObject;

public class MyString1 {
    private int length;
    private String str;


    public MyString1(char[] chars){
        str=new String(chars);
        length=chars.length;
    }

    public int length(){
        return length;
    }

    public char charAt(int index){
        char[] s=str.toCharArray();
        return s[index];
    }

    public String getStr() {
        return str;
    }

    public MyString1 substring(int begin, int end){
        char[] s1=new char[end-begin+1];
        for(int i=0;i<=end-begin;i++){
            s1[i]=str.charAt(begin+i);
        }

        return new MyString1(s1);
    }

    public boolean equals(MyString1 s){
        if(s.length!=length)
            return false;
        for(int i=0;i<length;i++){
            if(this.charAt(i)!=s.charAt(i))
                return false;
        }
        return true;
    }

}
