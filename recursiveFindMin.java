public int findMin(int[] arr, int size) {
    if (size == 1) {
        return arr[size - 1];
    } else {
        int minSoFar = findMin(arr, size - 1);
        return Math.min(minSoFar, arr[size - 1]);
    }
}
