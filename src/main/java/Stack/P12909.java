package Stack;

import java.util.Stack;

//프로그래머스 올바른 괄호
public class P12909 {
    public static void main(String[] args){
        String s = ")()(";
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);

            if(c == '('){
                stack.add(c);
            } else if(c == ')'){
                if(stack.isEmpty()){
                    answer = false;
                    break;
                } else if(stack.peek() == '('){
                    stack.pop();
                }
            }
        }

        if(stack.size() != 0){
            answer = false;
        }

        System.out.println(answer);
    }
}
/*
* 워낙 고전 문제라 이지했다 그죠?
*/