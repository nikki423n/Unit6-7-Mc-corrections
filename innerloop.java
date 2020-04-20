// Unit 7 MC Q16 how many times inner loop of insertion sort
/*
 * How many times is the statement "possibleIndex--" line 10 of the method executed 
 * as a result of the call to "insertionSort"?
 */
public class innerloop
{
    public static void insertionSort(int[] elements)
    {
        int[] arr = {10, 8, 3, 4};
        insertionSort(arr);
        
        
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--; //line 10
            }
            elements[possibleIndex] = temp;
        }
    }
}    
//Wrong answer: 6 times -> the statement is executed each time an element is shifted to the right
/* Right answer: 5 times
 * 1. 8 inserted -> shifts 10 to the right
 * 2. 3 inserted -> shifts 8 + 10
 * 3. 4 inserted -> shifts 8 + 10
 * 5 shifts total
 * 
 */ 