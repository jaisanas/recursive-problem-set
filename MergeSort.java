class MergeSort {
    public void mergeSort(int[] data, int start, int end) {
        if(start < end) {
            int mid = (start + end)/2;
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    public void merge(int[] data, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while(i <= mid && j <= end) {
            if(data[i] <= data[j]) {
                temp[k++] = data[i++];
            } else {
                temp[k++] = data[j++]; 
            }
        }

        while(i <= mid) {
            temp[k++] = data[i++];
        }

        while(j <= end) {
            temp[k++] = data[j++];
        }

        for(int a = start; a <= end; a++) {
            data[a] = temp[a - start];
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{1, 4, 2, 3};
        MergeSort ms = new MergeSort();
        ms.mergeSort(data, 0, data.length - 1);
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}