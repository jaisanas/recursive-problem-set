class NonTailedFactorial {
    public int factorial(int n) {
        if(n <= 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        NonTailedFactorial n = new NonTailedFactorial();
        int res = n.factorial(5);
        System.out.println(5);  
    }
}