public int recursiveBinarySearch(int[] a, int target, int low, int high) {
    if (low > high) {
        return -1; 
    }

    int mid = low + (high - low) / 2;

    if (a[mid] == target) {
        return mid; 
    } else if (a[mid] < target) {
        return recursiveBinarySearch(a, target, mid + 1, high); 
    } else {
        return recursiveBinarySearch(a, target, low, mid - 1); 
    }
}
