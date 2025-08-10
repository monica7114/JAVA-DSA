public boolean increasingTriplet(int[] nums) {
    int first = Integer.MAX_VALUE;
    int second = Integer.MAX_VALUE;

    for (int num : nums) {
        if (num <= first) {
            first = num; // new smallest number
        } else if (num <= second) {
            second = num; // new second smallest
        } else {
            return true; // found num > second, so triplet exists
        }
    }
    return false;
}
