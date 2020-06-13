package com.juvenxu.mvnbook.helloworld.string;

public class ReverseLeftWords {
    public static void main(String[] args) {
        String abcdefg = new ReverseLeftWords().reverseLeftWords("abcdefg", 2);
        System.out.println(abcdefg);
    }

    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        char[] newChars=new char[chars.length];
        for (int i=0;i<n;i++){
            newChars[newChars.length-n+i]=chars[i];
        }
        for (int i=n;i<chars.length;i++){
            newChars[i-n]=chars[i];
        }
        return new String(newChars);
    }
}
