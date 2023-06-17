class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length + arr2.length; i++) {
            if (i < arr1.length) {
                arr[i] = arr1[i];
            } else {
                arr[i] = arr2[i - arr1.length];
            }
        }
        
        Arrays.sort(arr);

        if (arr.length % 2 == 1) {
            return arr[arr.length / 2];
        } else {
            return (double) (arr[arr.length / 2] + arr[(arr.length - 1) / 2]) / 2;
        }
    }
}