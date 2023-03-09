class SumNaturalNumber {
    public int solve(int num, int sum) {
        if(num == 0) {
            return sum;
        }
        sum = sum + num;
        return solve(num - 1, sum);
    }
    public static void main(String[] args) {
        int num = 10;
        SumNaturalNumber s = new SumNaturalNumber();
        int res = s.solve(10, 0);
        System.out.println(res);
    }
}