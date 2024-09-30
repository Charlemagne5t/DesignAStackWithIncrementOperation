class CustomStack {
    int[] stack;
    int count = 0;
    int top = -1;


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

    }

    public int pop() {
        if(top == -1) {
            return -1;
        }
        int res = stack[top];
        stack[top] = 0;
        top--;
        count--;

        return res;
    }

    public void increment(int k, int val) {
        for(int i = 0; i < Math.min(k, top + 1); i++) {
            stack[i] += val;
        }
    }
}
