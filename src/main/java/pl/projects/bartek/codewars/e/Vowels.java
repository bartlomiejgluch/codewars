package pl.projects.bartek.codewars.e;

public class Vowels {


    public static int getCount(String str) {
        int vowelsCount = 0;


        for (int i = 0; i < str.length(); i++) {
            String strLetter = Character.toString(str.charAt(i));
            strLetter = strLetter.toLowerCase();

            if (strLetter.equals("a") || strLetter.equals("e") || strLetter.equals("i") || strLetter.equals("o") || strLetter.equals("u") == true) {
                vowelsCount++;

            }
        }

        return vowelsCount;
    }


}
