package hw8.roman;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RomanNumeralsTest {

    private int input;
    private String output;


    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1, "I"},
                {4, "IV"},
                {6, "VI"},
                {13, "XIII"},
                {39, "XXXIX"},
                {44, "XLIV"},
                {55, "LV"},
                {78, "LXXVIII"},
                {89, "LXXXIX"},
                {100, "C"},
                {1001, "MI"},
                {1055, "MLV"},
        });
    }

    public RomanNumeralsTest(int input, String output) {
        this.input = input;
        this.output = output;
    }


    @Test
    public void test() {
        assertEquals(output, RomanNumerals.convert(input));
    }

}
