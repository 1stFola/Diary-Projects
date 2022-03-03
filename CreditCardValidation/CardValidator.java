package CreditCardValidation;


/*Hans Luhn IBM - 1954
* 1 -> Double every second digit from right to left, IF doubling a digit result in a two-digits number,
*      add up the two digits to get a single-digit number
* 2 -> Now add all the single digit-numbers from step 1
* 3 -> Add all the digits in the odd places from right to left in the card number.
* 4 -> Sum up the results in steps 2 and 3.
* 5 -> If the result from step 4 is divisible by ten, the card number is valid. Otherwise,
*      it is invalid. for example, the number 4388576018402626 is invalid. But the
*      number - 4388576018410707
* 6 -> Write a program that prompts the user to enter a credit card number as an integer,
*      Display whether the number is Valid or Invalid. Design the program to use the following functions.
# 7 -> Return true if the card number is valid  -> isValid(number) :
# 8 -> Get the result from Step 2  -> sum0fDoubleEvenPlace(number) :
# 9 -> Return this number if it is a single digit, otherwise, return
#      The sum of the two digits  -> getDigit (number):
#10 -> Return sum of odd place digits in number  -> sumOfOddPlace(number):
#11 -> Return true if the digit d is a prefix for number  -> prefixMatched(number, d):
#12 -> Return the number of digits in d  -> getSize(d):
#13 -> Return the first k number of digits from number. If the number of digits
*      in number is less than k, return number. -> getPrefix(number, k):
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardValidator {

    public static List<String> visaCard = new ArrayList<>();
    public static List<String> masterCard = new ArrayList<>();
    public static List<String> discoverCard = new ArrayList<>();
    public static List<String> americanExpress = new ArrayList<>();


    public static boolean isValid(String number){
    if (getDigit(number) % 10 == 0){
        return true;
    }
        else return false;
    }

    public static int getDigit(String number){
        return sum0fDoubleEvenPlace(number) + sumOfOddPlace(number);
    }

    public static int sumOfOddPlace(String number) {
        int totalB = 0;
        String[] numStrArray = number.split("", -1);
        int[] numArray = new int[numStrArray.length];
        for (int i = 0; i < numArray.length; i++)
            numArray[i] = Integer.parseInt(numStrArray[i]);
        for (int j = numArray.length -1; j >= 0; j-=2) {
            int numX = numArray[j];
            totalB += numX;
            }
         return totalB;
    }

        public static int sum0fDoubleEvenPlace(String number){
        int totalA = 0;
        String[] numStr = new String[number.length()];
            for (int i = 0; i < number.length(); i++)
                numStr[i] = String.valueOf(number.charAt(i) - '0');
            for (int j = numStr.length-2; j >= 0; j -= 2){
                String num1 = numStr[j];
                int numb = Integer.parseInt(num1);
                int numbX = numb * 2;
                if (numbX > 9) {
                    int otherNum = numbX / 10;
                    int newNum = numbX % 10;
                    int numBXL = otherNum + newNum;
                    totalA += numBXL;
                }
                else totalA = numbX;
            }
            return totalA;
            }


    public static boolean prefixMatched(String number){
        String [] prefixList = {"4","5","6","37"};
        for (String s : prefixList) {
            if (s.equals(getPrefix(number)))
                System.out.println(s);
        } return true;
    }

    public static int getSize(String number){

    String numString = (number);
        return numString.length();
    }



    public static String getPrefix(String numString){
        String prefix = "";

        String[] card = new String[numString.length()];
        for (int i = 0; i < numString.length(); i++) {
            card[i] = String.valueOf(numString.charAt(i) - '0'); }

        if (card[0].equals("4")){
            visaCard.add(numString);
            prefix = card[0];
            return prefix;
        }
        if (card[0].equals("5")){
            masterCard.add(numString);
            prefix = card[0];
            return prefix;
        }
        if ( card[0].equals("6")){
            discoverCard.add(numString);
            prefix = card[0];
            return prefix;
        }
        if (card[0].equals("3") && card[1].equals("7")) {
            americanExpress.add(numString);
            prefix = card[0] + card[1];
        }
        return prefix;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter credit card number");
        int numberA = input.nextInt();

        System.out.println("Enter credit card number");
        int numberB = input.nextInt();

        String numStringA = Integer.toString(numberA);
        String numStringB = Integer.toString(numberB);

        String numString = numStringA.concat(numStringB);


        String result = getPrefix(numString);
        System.out.println(result);

        System.out.println("=============================================================");

        int size = getSize((numString));
        System.out.println(size);

        System.out.println("=============================================================");

//        boolean numPrefix = prefixMatched(numString);
//        System.out.println(numPrefix);
//        System.out.println("=============================================================");


//        boolean ValidCard = isValid(numString);

        if (isValid(numString)){
            System.out.println("Card is Valid");
        }else System.out.println("Invalid Card...! Try again");
    }
}

// 43885760 18410707
// 43885760 18402626