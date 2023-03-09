class Palindrome {
    public boolean solve(String s, int i, int j) {
        if(i > j) {
            return true;
        }

        return (solve(s, i+1, j-1) && (s.charAt(i) == s.charAt(j)));
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        boolean res = p.solve("nangis", 0, 4);
        System.out.println("***************");
        System.out.println(res);
        System.out.println("***************");
    }
}