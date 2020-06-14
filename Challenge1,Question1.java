import java.util.Random;

class Main {
    static void findPairs(int[] testArray, int targetSum) {

      //For loop seen below counts all the possible values for the testArray
      for(int i = 0; i < testArray.length - 1; i++) { //Starts at less than the array's length and counts up
        for(int p = i + 1; p < testArray.length; p++) { //Starts at one before i and counts up
          if (testArray[i] + testArray[p] == targetSum) { 
            //If int "p" and "i" equals to the target sum at its testArray[position], then it is a pair
            System.out.println("The pair (" + testArray[i] + ", " + testArray[p] + ") equals to " + targetSum);
          }
        }
      }
    }
   public static void main(String[] args) {

      findPairs(new int[]{2, 4, 5, 1, 3, 5, 4}, 6);
      findPairs(new int[]{1,4,2},5);
    
   }
}