package pl.projects.bartek.codewars.f;

import java.util.ArrayList;

public class LongestConsec {


    public static String longestConsec(String[] strarr, int k) {
        String solution = "";
        ArrayList arrayList = new ArrayList();


        if (strarr.length == 0 || k > strarr.length || k <= 0) {

            return "";

        } else {

            for (int i = 0; i < strarr.length; i++) {


                   arrayList.add(strarr[i]);

                }


        }


        return solution;
    }


}


