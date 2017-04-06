package GetOffer;

import java.util.Stack;

/**
 * Created by linxuan on 11/02/2017.
 */
public class P07QueueByTwoStack<E> {

    private Stack<E> stack1;
    private Stack<E> stack2;

    public E deleteHead(){
        if(stack2.empty()){
            while(!stack1.empty())
                stack2.push(stack1.pop());
        }
        if(!stack2.empty()) stack2.pop();
        return null;
    }

    public void appendTail(E item){
        stack1.push(item);
    }

    public static void main(String[] args) {
//        stack1 = new Stack<E>()
        P07QueueByTwoStack obj = new P07QueueByTwoStack();
        obj.stack1 = new Stack();
        obj.stack2 = new Stack();
        for (int i = 1; i < 4; i++) {
            obj.stack1.push(i);
        }
        obj.deleteHead();
        obj.deleteHead();
        obj.appendTail(4);
        obj.deleteHead();
    }
}
