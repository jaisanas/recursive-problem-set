class TailedFactorial {
    public int factorial(int n, int a) {
        if(n <= 1) {
            return a;
        } else {
            return factorial(n - 1, a * n);
        }
    }

    public static void main(String[] args) {
        TailedFactorial t = new TailedFactorial();
        int res = t.factorial(5, 1);
        System.out.println(res);
    }
}