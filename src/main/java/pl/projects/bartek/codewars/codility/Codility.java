package pl.projects.bartek.codewars.codility;

import java.util.Arrays;

public class Codility {

    public int solution(int[] A) {

        Arrays.sort(A);
        int g = 0;
        if (A[A.length - 1] <= 0) {
            g = 1;
        } else {

            for (int i = 1; i < A.length +1; i++) {

                if (i >= A.length) {
                } else {
                    if (A[i] - A[i-1] > 1) {
                        g = A[i-1] + 1;
                        break;
                    } else {
                        int x = A[A.length-1];
                        g = x + 1;
                    }
                }
            }
        }
        return g;
    }
}



