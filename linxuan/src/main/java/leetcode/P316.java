package leetcode;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by linxuan on 3/9/16.
 */
public class P316 {
    public String removeDuplicateLetters(String s) {

        Stack<Character> stack = new Stack<Character>();
        int[] count = new int[26];
        boolean[] added = new boolean[26];

        for(char ch : s.toCharArray()){
            count[ch - 'a']++;
        }

        for(char ch : s.toCharArray()){
            count[ch - 'a']--;

            if(added[ch - 'a'])
                continue;

            while(!stack.empty() && (stack.peek() > ch) &&
                    (count[stack.peek() - 'a'] > 0))
                added[stack.pop() - 'a'] = false;

            stack.push(ch);
            added[ch - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        P316 obj = new P316();
//        Scanner test = new Scanner(System.in);
//        while(test.hasNext()){
//            System.out.println(test.next());
//        }
        obj.removeDuplicateLetters(new Scanner(System.in).nextLine());
    }
}
