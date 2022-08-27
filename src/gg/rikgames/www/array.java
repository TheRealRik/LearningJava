package gg.rikgames.www;

import com.sun.source.doctree.UnknownInlineTagTree;

public class array {
    public static void main(String[] args) {
        double[] testScore = {48.30, 45.2, 70.0, 85.50, 95.45, 78.45, 66.35, 25.26, 35.24, 48.12, 49.78};
       String[] rikMCC = {
                "Dream",
                "Sapnap",
                "Skeppy",
                "BadBoyHelo",
                "TheRealRik [Admin]",
                "FireIndex [Admin2]"
        };

        int arrayIndex = 0;

        while (arrayIndex < testScore.length) {
            if (testScore[arrayIndex] > 80) {
                System.out.println("Good Score: " + testScore[arrayIndex]);
            } else if (testScore[arrayIndex] > 50 && testScore[arrayIndex] < 80) {
                System.out.println("Average Score: " + testScore[arrayIndex]);
            } else {
                System.out.println("Bad Score: " + testScore[arrayIndex]);
            }
            arrayIndex++;
        }

        System.out.println("-------------------------------------------");

        for (int i = 0; i < rikMCC.length; i++){
            System.out.println(rikMCC[i]);
        }

        System.out.println("-------------------------------------------");

        for (String myString : rikMCC) {
            System.out.println(myString);
        }
    }
}