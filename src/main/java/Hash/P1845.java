package Hash;

import java.util.HashSet;

//프로그래머스 폰켓몬
public class P1845 {
    public static void main(String[] args){
        int[] nums = {3, 1, 2, 3};
        int answer = 0;
        int N = nums.length / 2;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }

        if(N < set.size()){
            answer = N;
        }
        else answer = set.size();
    }
}
/*
* 가장 많은 종류의 폰켓몬을 선택하는 방법이 여러가지인 경우에도
* 선택할 수 있는 폰켓몬 종류 개수의 최댓값 하나만 return 하면 되므로
* 고를 수 있는 폰켓몬 개수가 종류 개수보다 적으면 고를 수 있는 수로,
* 종류 갯수가 더 많으면 종류 갯수로 가면 됨
* 모자란 폰켓몬 고를 수 있는 수는 중복 폰켓몬이 하나 들어간다 치면 됨
*/
