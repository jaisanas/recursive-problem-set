class BinarySearch {
    public int solve(int[] A, int left, int right, int x) {
        if(left >  right) {
            return -1;
        }

        int m = (left + right)/2;
        if(A[m] == x) {
            return m;
        }

        if(A[m] > x) {
            return solve(A, left, m-1, x);
        }

        return solve(A, left, m+1, x);
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 5};
        BinarySearch b = new BinarySearch();
        int res = b.solve(A, 0, 4, 3);
        System.out.println(res);
    }
}