import java.lang.reflect.Array;

/***
 * Class holding algorithms
 * 
 * @author tai
 *
 */
public class Algorithms {
  private static int current; // stores current number
  private static int first;
  private static int last;
  private static int middle;
  private static int compareValue; // stores number to compare to current
  private static boolean result = false; // stores result


  /***
   * Sequential search method
   * 
   * @param test
   * @return
   */
  public static boolean sequentialSearch(int[] test) {


    for (int i = 0; i < test.length; i++) { // goes through each element + sets as current
      current = test[i]; // sets current to i value
      if (current > 0) { // if current is NOT negative...
        for (int j = 0; j < test.length; j++) { // goes through each member in the array
          compareValue = (int) Array.get(test, j);// sets compareValue to current j value
          if ((current - (current * 2)) == compareValue) {
            result = true; // result is true
            // System.out.println(result);
            return result; // return result
          }
        }
      }
    }
    return result; // return result
  }
  

  /***
   * Binary search method
   * 
   * @param test
   * @return
   */
  public static boolean binarySearch(int[] test) {


    for (int i = 0; i < test.length; i++) { // goes through each element + sets as current
      current = test[i];
      if (current > 0) { // if current is NOT negative...
        first = 0; // first is 0
        last = test.length - 1; // last is test length - 1

        while (first <= last) { // while first is less than last
          middle = (first + last) / 2; // find the middle of the array


          if (test[middle] == (current - (2 * current))) { // if that value equals the negative...
            return true; // return true
          } else if ((current - (2 * current)) < test[middle]) { // if that value is less than than
                                                                 // the negative...
            last = middle - 1; // make array smaller with the last being the middle
          } else {
            first = middle + 1; // make array smaller with the first being the middle
          }
        }


      }


    }

    return false;
  }


/***
 * 
 * Index search algorithm
 * 
 * @param test
 * @return
 */
  public static boolean indexSearch(int[] test) {


    for (int i = 0; i < test.length; i++) { // goes through each element + sets as current
      current = test[i]; // current is i in arraylist test
      if (current > 0) { // if current is NOT negative...
        first = 0; // first is 0
        last = test.length - 1; // last is the length - 1

        while (first != last) {
          if (test[first] + test[last] == 0) {
            // System.out.print("true");
            return true;
          } else if (test[first] + test[last] < 0) {
            first++; // add one to first
          } else {
            last--; // subtract one from last
          }
        }



      }
    }

    return false; // returns false
  }



}
