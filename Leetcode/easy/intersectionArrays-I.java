static String intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> arr1 = new HashSet<Integer>();
    HashSet<Integer> arr2 = new HashSet<Integer>();

    for (int i : nums1) {
        arr1.add(i);
    }

    for (int i : nums2) {
        if (arr1.contains(i)) {
            arr2.add(i);
        }
    }

    int[] ans = new int[arr2.size()];
    int index = 0;
    for (int i : arr2) {
        ans[index] = i;
        index++;
    }

    return Arrays.toString(ans);
}