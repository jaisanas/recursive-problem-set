import java.util.*;

class MemFib {
    static Map<Integer, Integer> mem;
    public static int parentFib(int n) {
        mem = new HashMap<>();
        mem.put(0,1);
        mem.put(1,1);
        return fib(n);
    }

    public static int fib(int n) {
        if(mem.containsKey(n)) {
            return mem.get(n);
        }

        int result = fib(n-1) + fib(n-2);
        mem.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(parentFib(5));
    }
}