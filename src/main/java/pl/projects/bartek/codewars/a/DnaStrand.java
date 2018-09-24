package pl.projects.bartek.codewars.a;

public class DnaStrand {
    public static String makeComplement(String dna) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < dna.length(); i++) {

            String dnaChar = Character.toString(dna.charAt(i));

            if (dnaChar.equals("A")) {

                dnaChar = dnaChar.replace("A", "T");

            } else if (dnaChar.equals("T")) {
                dnaChar = dnaChar.replace("T", "A");

            } else if (dnaChar.equals("C")) {

                dnaChar = dnaChar.replace("C", "G");

            } else if (dnaChar.equals("G")) {

                dnaChar = dnaChar.replace("G", "C");

            }

            stringBuilder.append(dnaChar);

        }

        String dnaSuper = stringBuilder.toString();

        return dnaSuper;
    }
}