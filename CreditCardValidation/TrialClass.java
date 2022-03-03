package CreditCardValidation;

import java.util.Arrays;

public class TrialClass {

    public static void main(String[] args) {
//        String[] numStrArray = new String[number.length()];

        String number = "4388576018410707";

            int totalB = 0;


        String data = "123456789";
        String[] numX = data.split("", -1);
        for (int i=0; i<numX.length; i++)
            System.out.println(numX[i]);

        System.out.println("Done");

    }
}


//        String[] numStrArray = new String[number.length()];



//            String[] numStrArray = new String[number.length()];
//            int[] numArray = new int[numStrArray.length];
//            for (int i = 0; i < numArray.length; i++)
//                numArray[i] = Integer.parseInt(numStrArray[i]);
//            for (int j = numArray.length -1; j >= 0; j-=2) {
//                int numX = numArray[j];
//                totalB += numX;
//            }
//        System.out.println(totalB);
//        }


