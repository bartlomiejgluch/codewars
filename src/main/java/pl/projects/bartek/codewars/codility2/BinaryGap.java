package pl.projects.bartek.codewars.codility2;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryGap {

    public int solution(int N) {


        String binary = Integer.toBinaryString(N);

        char[] array1 = binary.toCharArray();

        int[] array1Int = new int[array1.length];

        for (int j = 0; j < array1.length; j++) {
            array1Int[j] = (int) array1[j];
        }

        ArrayList<Integer> arrayCount1 = new ArrayList<Integer>();

        int count = 0;
        int i = 0;

        for (int z = 0; z < array1Int.length; z++) {

            if (array1Int[z] == 48) {

                count++;

            }

            if (array1Int[z] == 49) {

                arrayCount1.add(count);

                count=0;
            }

        }

        if (arrayCount1.size() == 0) {
            return 0;
        } else {
            Collections.sort(arrayCount1);

            return arrayCount1.get(arrayCount1.size() - 1);
        }


    }


}
