package main.fifth_kyu;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class DragonsCurve {

    public IntFunction<String> mapFunction = (value) -> {
        if (value == 97)
            return "aRbFR";
        if (value == 98)
            return "LFaLb";
        return Character.valueOf((char) value).toString();
    }; //Make the function; map the chars to Strings
    //a -> aRbFR, b -> LFaLb, otherwise -> itself
    /**
     * Make the curve; stream the chars repeatedly (starting with Fa) through the mapFunction n times
     * Then remove the a and b (createFilter function is useful for that)
     */
    public String createCurve(int n) {
        "Fa".chars(); //That's an IntStream with 'F' and 'a' ready to be acted upon
        return "Fa";
    }

    /**
     * How many of the specified char are in the given curve?
     * Hint: createFilter could be useful for this
     */
    public long howMany(char c, String curve) {
        return 4L; //Determined by die roll; guaranteed to be random
    }

    /**
     * Create a predicate to filter the specified char; keep or remove based on keep variable
     */
    public IntPredicate createFilter(char filterWhat, boolean keep) {
        return null; //Dat predicate
    }
}
