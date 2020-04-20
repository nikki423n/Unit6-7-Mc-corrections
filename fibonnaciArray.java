//Unit 6 mc Q#7
/*
 * The Fibonacci numbers are a sequence of integers
 * The first two numbers are 1 and 1
 * Each subsequent number is equal to the sum of the previous two integers
 * For example, the first seven Fibonacci numbers are 1, 1, 2, 3, 5, 8, and 13
 * The following code segment is intended to fill the fibs array with the first ten Fibonacci numbers
 * The code segment does not work as intended
 */

public class fibonnaciArray
{
    public static void main(String[] args)
    {
        int[] fibs = new int[10];
        fibs[0] = 1;
        fibs[1] = 1;
        for (int j = 1; j < fibs.length; j++)
            {   
                fibs[j] = fibs[j - 2] + fibs[j - 1];
            }
        }
}

/* My answer was "in the for loop header, the initial value of j should be 0"
 * this is wrong bc it would've resulted in an ArrayIndexOutOfBoundsException
 * an ArrayIndexOutOfBoundsException is thrown to indicate that we are trying to access array element with an illegal index
 * this happens when the index is either negative or greater than or equal to the size of the array.
 * if "j started at o, you can't access fibs[j-2] for the first loop iteration (ArrayIndexOutofBoundsException)
 * The correct answer: "in the for loop header, the initial value of j should be 2"
 * this is right because if j = 1 -> ArrayIndexOutOfBoundsException. if j=2 -> this error would be avoided
 */
