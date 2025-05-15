package 프로그래머스.Hash;

import java.util.*;

//프로그래머스 전화번호 목록
public class P42577 {
    public static void main(String[] args){
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean answer = true;

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0 ; i < phone_book.length ; i++){
            map.put(phone_book[i], phone_book[i].length());
        }

        for(int i = 0 ; i < phone_book.length ; i++){
            for(int j = 0 ; j < phone_book[i].length() ; j++){
                String temp = phone_book[i].substring(0, j);
                if(map.containsKey(temp)){
                    answer = false;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
/*
* 처음에 배열을 길이가 짧은 순으로 정렬해서
* 다른 문자열 시작이 그 짧은거랑 같으면 false를 반환하게하려고 했는데
* 길이순서로 배열 정렬하는 방법도 모르겠고
* 시간복잡도도 길거 같아서 HashMap으로 해결함
* */
