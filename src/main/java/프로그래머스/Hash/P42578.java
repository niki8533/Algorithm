package 프로그래머스.Hash;

import java.util.HashMap;

//프로그래머스 의상
public class P42578 {
    public static void main(String[] args){
        String[][] clothes = {{"a", "A"}, {"b", "B"}, {"c", "C"}}	;
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0 ; i < clothes.length ; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }

        for(String key : map.keySet()){
            answer = answer * (map.get(key)+1);
        }

        answer = answer - 1;

        System.out.println(answer);
    }
}
/*
* 한번 입을때 두종류씩만 입는게 아니라
* 세종류, 네종류도 이렇게 입어서
* 안입는 경우도 조합을 해줘야함
* 입는 경우만 조합하고 하나씩 입는 경우만 따로 더해주는 방법을 처음에 했는데
* 종류가 늘어나는거에 대해 생각을 안해서 탈락임
* */
