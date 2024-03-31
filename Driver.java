import java.util.Arrays;
import java.util.Random;

public class Driver {
  private static int min = -50;
  private static int max = 100;
  private static int num;
  private static Random rand;
  private static int[] test;
  private static int startingNum;
  private static int numExperiments = 100;



  /***
   * Generates an array of n integers
   * 
   * @param n
   * @return
   */
  public static int[] generateArray(int n) {
    num = n; // num is n
    int checkZero; // create checkZero
    final int[] result = new int[n]; // create int array result with length n
    rand = new Random(); // create new instance of random
    for (int i = 0; i < n; i++) {
      checkZero = min + rand.nextInt(max); // checkZero is the min plus a random number
      if (checkZero == 0) { // if chexckZero is 0...
        while (checkZero == 0) { // while checkZero is 0...
          checkZero = min + rand.nextInt(max);
        }

      }
      result[i] = checkZero; // element i in result is checkZero
    }

    Arrays.sort(result); // sort array result
    return result; // return array result
  }

  /***
   * Turns array into string
   * 
   * @param array
   * @return
   */
  public static String toString(int[] array) {
    String theArray = "This is the array: ";
    for (int i = 0; i < array.length; i++) {
      theArray += array[i] + " ";
    }
    return theArray; // returns array as string

  }



  /***
   * My main class
   * 
   * @param args
   */
  public static void main(String[] args) {


    // Algorithm #1 - Sequential Algorithm

    System.out.println(" Sequential Search Algorithim: ");


    for (int i = 1; i <= 24; i += i) { // cycle through all test cases
      startingNum = 50000 * (i); // create arrays starting at 50000
      test = generateArray(startingNum); // generate random array of startingNum ints
      long startTime = System.currentTimeMillis(); // start timer

      for (int ex = 0; ex < numExperiments; ex++) { // cycle through all experiments

        Algorithms.sequentialSearch(test); // run test

      }

      long endTime = System.currentTimeMillis(); // end timer
      System.out.println(" " + num + " " + ((endTime - startTime) / (double) numExperiments)); // find
                                                                                               // average
                                                                                               // time
    }

    // Algorithm #2 - Binary Algorithm
    System.out.println(" Binary Search Algorithim: ");

    for (int i = 1; i <= 24; i += i) { // cycle through all test cases
      startingNum = 50000 * (i); // create arrays starting at 50000
      test = generateArray(startingNum); // generate random array of startingNum ints
      long startTime = System.currentTimeMillis(); // start timer

      for (int ex = 0; ex < numExperiments; ex++) { // cycle through all experiments

        Algorithms.binarySearch(test); // run test

      }

      long endTime = System.currentTimeMillis(); // end timer
      System.out.println(" " + num + " " + ((endTime - startTime) / (double) numExperiments)); // find
                                                                                               // average
                                                                                               // time
    }


    // Algorithm #3 - Index Algorithm
    System.out.println(" Index Search Algorithim: ");

    
    for (int i = 1; i <= 24; i += i) { // cycle through all test cases
      startingNum = 50000 * (i); // create arrays starting at 50000
      test = generateArray(startingNum); // generate random array of startingNum ints
      long startTime = System.currentTimeMillis(); // start timer

      for (int ex = 0; ex < numExperiments; ex++) { // cycle through all experiments

        Algorithms.indexSearch(test); // run test

      }

      long endTime = System.currentTimeMillis(); // end timer
      System.out.println(" " + num + " " + ((endTime - startTime) / (double) numExperiments)); // find
                                                                                               // average
                                                                                               // time
    }



  }

}


