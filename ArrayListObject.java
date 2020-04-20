
import java.util.ArrayList;

//Unit 7 Q#2 create ArrayList onject to hold integers
/*code suposed to create an ArrayList named numbers that can be used to store Integer values
 * which of the following can be used to replace the missing code
 * I. new ArrayList()
 * II. new ArrayList<Integer>
 * III. new ArrayList<Integer>()
 */

public class ArrayListObject
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList();
    }
}
/* my wrong answer: "III only"
 * the answer itself is not wrong, however there could be one more possible answer choice
 * this statement declares an ArrayList object that can contain elements only of type integer
 * statement I also works because it declares an ArrayList object that contains Integer objects
 * I and III are both right
 * II is wrong because it doesn't have (); the call to an ArrayList constructor must have ()
 */
