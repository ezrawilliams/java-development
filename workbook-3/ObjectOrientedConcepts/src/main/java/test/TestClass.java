package test;

import com.pluralsight.Food;

public class TestClass {
    public static void main(String[] args) {
        Food myFood = new
                Food("rice",500,true,
                true,"white",false,3.00);
        /*
        I am unable to access the food attributes because they are
        default (package-private) so they are only accessible within
        the com.pluralsight package.
         */
    }
}
