import java.util.*;

class FreqStack {
    private Map<Integer, Integer> freq;
    private Map<Integer, Deque<Integer>> group;
    private int maxFreq;

    public FreqStack() {
        freq = new HashMap<>();
        group = new HashMap<>();
        maxFreq = 0;
    }

    public void push(int val) {
        int f = freq.getOrDefault(val, 0) + 1;
        freq.put(val, f);

        group.computeIfAbsent(f, k -> new ArrayDeque<>()).push(val);

        if (f > maxFreq) maxFreq = f;
    }

    public int pop() {
        Deque<Integer> stack = group.get(maxFreq);
        int x = stack.pop();
        freq.put(x, freq.get(x) - 1);

        if (stack.isEmpty()) {
            group.remove(maxFreq);
            maxFreq--; // since the current max stack is empty
        }

        return x;
    }
}