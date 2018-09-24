package pl.projects.bartek.codewars.b;


class Solution {

    static String toCamelCase(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        boolean helpVariable = false;

        for (int i = 0; i < s.length(); i++) {

            String sChar = Character.toString(s.charAt(i));

            if (Character.isUpperCase(s.charAt(i)) == true) {

            } else {

                sChar = sChar.toLowerCase();
            }

            if (helpVariable == true) {
                sChar = sChar.toUpperCase();

            }

            helpVariable = false;

            if (sChar.equals("-") || sChar.equals("_")) {

                helpVariable = true;
            } else {
                stringBuilder.append(sChar);
            }

        }

        String sSuper = stringBuilder.toString();

        return sSuper;
    }
}
