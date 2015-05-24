package hw8.roman;

import java.util.LinkedHashMap;


public class RomanNumerals {

    public static void main(String[] args) {
        System.out.println(convert(3999));
    }

    public static String convert(int number) {

        StringBuilder sb = new StringBuilder();

        for (Integer key : lettersMap().keySet()) {
            while (number >= key) {
                sb.append(lettersMap().get(key));
                number -= key;
            }
        }
        return sb.toString();
    }

    public static LinkedHashMap<Integer, String> lettersMap() {
        LinkedHashMap<Integer, String> lettersMap = new LinkedHashMap<>();

        lettersMap.put(1000, "M");
        lettersMap.put(900, "CM");
        lettersMap.put(500, "D");
        lettersMap.put(400, "CD");
        lettersMap.put(100, "C");
        lettersMap.put(90, "XC");
        lettersMap.put(50, "L");
        lettersMap.put(40, "XL");
        lettersMap.put(10, "X");
        lettersMap.put(9, "IX");
        lettersMap.put(5, "V");
        lettersMap.put(4, "IV");
        lettersMap.put(1, "I");

        return lettersMap;
    }

}
