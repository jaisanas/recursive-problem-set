class FindBinary {
    public String solve(int decimal, String result) {
        if(decimal == 0) {
            return result;
        }

        result = (decimal % 2) + result;
        return solve(decimal/2, result);
    }

    public static void main(String[] args) {
        FindBinary f = new FindBinary();
        String result = f.solve(138, "");
        System.out.println(result);
    }
}