public class MaxSumK {

    public static int findMaxSum(int[] inputArray, int kElements) {
        int maxSum = 0;
        int kSum = 0;
        if (inputArray.length == 0) {
            return 0;
        }
        if (inputArray.length < 1) {
            return inputArray[0];
        }

        //correction based on jUnit testing - added i less than OR EQUAL to inputArray.length - kElements
        //interview had only less than which ends up skipping the last element needed
        for (int i = 0; i <= inputArray.length - kElements; i++) {

            for (int j = 0; j < kElements; j++) {
                kSum += inputArray[j + i];
            }
            maxSum = Math.max(maxSum, kSum);

            //correction based on jUnit testing - add this resetting of the kSum variable back to zero so it could
            // check for each kth continuous sub array sum and not cumulative of all sub array sums.
            kSum = 0;
        }
        return maxSum;
    }
}