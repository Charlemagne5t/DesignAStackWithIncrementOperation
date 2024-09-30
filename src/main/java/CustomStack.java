import java.util.ArrayList;
import java.util.List;

class CustomStack {
    int[] stack;
    int count = 0;
    int top = -1;
    List<Integer> inc = new ArrayList<>();


    public CustomStack(int maxSize) {
        stack = new int[maxSize];

    }

    public void push(int x) {
        if(count == stack.length) {
            return;
        }

        count++;
        top++;
        stack[top] = x;
        inc.add(0);

    }

    public int pop() {
        if(top == -1) {
            return -1;
        }
        int res = stack[top];
        int add = inc.remove(inc.size() - 1);
        if(!inc.isEmpty()) {
            int newLast = inc.remove(inc.size() - 1) + add;
            inc.add(newLast);
        }
        stack[top] = 0;
        top--;
        count--;

        return res + add;
    }

    public void increment(int k, int val) {
        if(count == 0) {
            return;
        }
        int ind = Math.min(k - 1, inc.size() - 1);
        int old = inc.get(ind);
        inc.set(ind, old + val);
    }
}