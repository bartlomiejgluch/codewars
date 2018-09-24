package pl.projects.bartek.codewars.d;

public class Counter {


    public int countSheeps(Boolean[] arrayOfSheeps) {

        int count = 0;
        int i;

        for (i = 0; i < arrayOfSheeps.length; i++) {

            try {

                if (arrayOfSheeps[i] == true) {
                    count++;
                }
            } catch (NullPointerException e) {
                System.out.println(e);
            } finally {

            }
        }
        return count;
    }

}
