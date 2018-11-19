public class FindSum {

    //I asserted that this is a solution with O(n)squared in terms of time complexity and O(1) in terms of space
    //because there is a set of nested for loops (time complexity) and no new variables (space used)
    //Manish showed me the following mathematical summary to explain this:
    //n(n+1) / 2 = nsquared +n / 2 or nsquared /2 = nsquared

    public static boolean findSum(int[] inputArray, int sum){

        for(int i = 0; i < inputArray.length -1; i++){
            for(int j = 1+i; j < inputArray.length; j ++) {
                //error in originally written code during discussion
                //by putting 1+i as the loop value for j, the secondary value to find the sum
                //need only be inputArray[j] NOT inputArray[j+i] as originally written
                //found during jUnit testing
                if(sum == inputArray[i] + inputArray[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
