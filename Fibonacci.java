class Fibonacci {
    public int solve(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        return solve(n - 1) + solve(n - 2); 
    }
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int res = f.solve(8);
        System.out.println(res);
    }
}