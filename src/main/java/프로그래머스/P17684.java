package 프로그래머스;

//카카오 블라인드 채용 [3차]압축

import java.util.*;

public class P17684 {
    public static void main(String[] args){
        String msg = "TOBEORNOTTOBEORTOBEORNOT";
        int[] answer ={};

        List<Integer> ans = new ArrayList<>();
        List<String> dict = new ArrayList<>();

        char c = 'A';
        for(int i = 0 ; i < 26 ; i++){
            dict.add(String.valueOf(c));
            c++;
        }

        int i = 0;
        while(i < msg.length()){
            int temp = 0;
            String s = "";
            for(int j = i+1 ; j <msg.length()+1 ; j++){
                s = msg.substring(i, j);
                if(dict.contains(s)){
                    System.out.println(s);
                    temp = dict.indexOf(s) + 1;
                } else {
                    System.out.println(temp + " " + s);
                    ans.add(temp);
                    dict.add(s);
                    i = j - 1;
                    break;
                }

                if(j == msg.length()){
                    ans.add(temp);
                    i = msg.length();
                }
            }
        }

        answer = new int[ans.size()];
        for(int k = 0 ; k < ans.size() ; k++){
            answer[k] = ans.get(k);
        }
    }
}
