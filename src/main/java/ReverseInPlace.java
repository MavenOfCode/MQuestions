import java.util.Arrays;

public class ReverseInPlace {

    public static char[] reverseArray(char[] inputArray){
        for(int i = 0; i < inputArray.length /2; i ++){
            char temp = inputArray[i];

            //with testing, originally written solution was getting out of bounds exception due
            //last character for swap being inputArray.length
            //first tried just less 1, but that didn't account for iteration from both sides
            //of the array, but subtracting both 1 and i from the other element being swapped
            //test passes
            inputArray[i] = inputArray[inputArray.length - 1-  i];
            inputArray[inputArray.length - 1- i] = temp;
        }
        return inputArray;
    }
}
