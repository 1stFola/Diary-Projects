package MyersBriggs;

import java.util.Scanner;

public class MyerBriggsQuiz {

    public static void main(String[] args) {

        String question0 = "WHEN YOU GO SOMEWHERE FOR THE DAY, WOULD YOU RATHER \nA. PLAN WHAT YOU WILL DO AND WHEN, OR\nB. JUST GO!!";
        String question1 = "IF YOU WERE A TEACHER, WOULD YOU RATHER TEACH \nA.	FACTS-BASED COURSES, OR\nB.	COURSES INVOLVING OPINION OR THEORY?";
        String question2 = "ARE YOU USUALLY\nA.	A “GOOD MIXER” WITH GROUPS OF PEOPLE, OR\nB.	RATHER QUIET AND RESERVED?";
        String question3 = "DO YOU MORE OFTEN LET\nA.	YOUR HEART RULE YOUR HEAD. OR\nB.	YOUR HEAD RULE YOUR HEART?";
        String question4 = "IN DOING SOMETHING THAT MANY OTHER PEOPLE DO, WOULD YOU RATHER\nA.	INVENT A WAY OF YOUR OWN, OR\nB.	DO IT IN THE ACCEPTED WAY?";
        String question5 = "AMONG YOUR FRIENDS ARE YOU\nA.	FULL OF NEWS ABOUT EVERYBODY, OR\nB.	ONE OF THE LAST TO HEAR WHAT IS GOING ON?";
        String question6 = "DOES THE IDEA OF MAKING A LIST OF WHAT YOU SHOULD GET DONE OVER A WEEKEND\nA.	HELP YOU, OR\nB.	STRESS YOU, OR\nC.	POSITIVELY DEPRESS YOU?";
        String question7 = "WHEN YOU HAVE A SPECIAL JOB TO DO, DO YOU LIKE TO\nA.	ORGANIZE IT CAREFULLY BEFORE YOU START, OR\nB.	FIND OUT WHAT IS NECESSARY AS YOU GO ALONG?";
        String question8 = "DO YOU TEND TO HAVE\nA.	BROAD FRIENDSHIPS WITH MANY DIFFERENT PEOPLE, OR\nB.	DEEP FRIENDSHIP WITH VERY FEW PEOPLE?";
        String question9 = "DO YOU ADMIRE MORE THE PEOPLE WHO ARE\nA.	NORMAL-ACTING TO NEVER MAKE THEMSELVES THE CENTER OF ATTENTION, OR\nB.	TOO ORIGINAL AND INDIVIDUAL TO CARE WHETHER THEY ARE THE CENTER OF ATTENTION OR NOT";
        String question10 = "DO YOU PREFER TO\nA.	ARRANGE PICNICS, PARTIES ETC, WELL IN ADVANCE, OR\nB.	BE FREE TO DO WHATEVER TO LOOKS LIKE FUN WHEN THE TIME COMES?";
        String question11 = "DO YOU USUALLY GET ALONG BETTER WITH\nA.	REALISTIC PEOPLE, OR\nB.	IMAGINATIVE PEOPLE?";
        String question12 = "WHEN YOU ARE WITH THE GROUP OF PEOPLE, WOULD YOU USUALLY RATHER\nA.	JOIN IN THE TALK OF THE GROUP OR\nB.	STAND BACK AND LISTEN FIRST?";
        String question13 = "IS IT A HIGHER COMPLIMENT TO BE CALLED\nA.	A PERSON OF REAL FEELING, OR\nB.	A CONSISTENTLY REASONABLE PERSON?";
        String question14 = "IN READING FOR PLEASURE, DO YOU\nA.	ENJOY ODD OR ORIGINAL WAYS OF SAYING THINGS, OR\nB.	LIKE WRITERS TO SAY EXACTLY WHAT THEY MEAN?";
        String question15 = "DO YOU\nA.	TALK EASILY TO ALMOST ANYONE FOR AS LONG AS YOU HAVE TO, OR\nB.	FIND A LOT TO SAY ONLY TO CERTAIN PEOPLE OR UNDER CERTAIN CONDITIONS?";
        String question16 = "DOES FOLLOWING A SCHEDULE\nA.	APPEAL TO YOU, OR\nB.	CRAMP YOU?";
        String question17 = "WHEN IT IS SETTLED WELL IN ADVANCE THAT YOU WILL DO A CERTAIN THING AT A CERTAIN TIME,DO YOU FIND IT\nA.	NICE TO BE ABLE TO PLAN ACCORDINGLY, OR\nB.	A LITTLE UNPLEASANT TO BE TIED DOWN?";
        String question18 = "ARE YOU MORE SUCCESSFUL\nA.	AT FOLLOWING A CAREFULLY WORKED OUT PLAN, OR\nB.	AT DEALING WITH THE UNEXPECTED AND SEEING QUICKLY WHAT SHOULD BE DONE?";
        String question19 = "WOULD YOU RATHER BE CONSIDERED\nA.	A PRACTICAL PERSON, OR\nB.	AN OUT-OF-THE-BOX-THINKING PERSON?";
        String question20 = "IN A LARGE GROUP, DO YOU MORE OFTEN\nA.	INTRODUCE OTHERS, OR\nB.	GET INTRODUCED?";
        String question21 = "DO YOU USUALLY\nA.	VALUE EMOTION MORE THAN LOGIC, OR\nB.	VALUE LOGIC MORE THAN FEELINGS?";
        String question22 = "WOULD YOU RATHER HAVE AS A FRIEND\nA.	SOMEONE WHO IS ALWAYS COMING UP WITH NEW IDEAS, OR\nB.	SOMEONE WHO HAS BOTH FEET ON THE GROUND?";
        String question23 = "CAN THE NEW PEOPLE YOU MEET TELL WHAT YOU ARE INTERESTED IN\nA.	RIGHT AWAY,\nB.	ONLY AFTER THEY REALLY GET TO KNOW YOU?";
        String question24 = "(ON THIS QUESTION ONLY, IF TWO ANSWERS ARE TRUE, CHOOSE BOTH)\nIN YOUR DAILY WORK, DO YOU\nA.	USUALLY PLAN YOUR WORK SO YOU WON’T NEED TO WORK UNDER PRESSURE, OR\nB.	RATHER ENJOY AN EMERGENCY THAT MAKES YOU WORK AGAINST TIME, OR\nC.	HATE TO WORK UNDER PRESSURE?";
        String question25 = "DO YOU USUALLY\nA.	SHOW YOUR FEELINGS FREELY, OR\nB.	KEEP YOUR FEELINGS TO YOURSELF?";
        String question26 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	SCHEDULED\nB.	UNPLANNED";
        String question27 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	STATEMENT\nB.	CONCEPT";
        String question28 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	CALM\nB.	LIVELY";
        String question29 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	FACTS\nB.	IDEAS";
        String question30 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	RESERVED\nB.	TALAKATIVE";
        String question31 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	JUSTICE\nB.	MERCY";
        String question32 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	QUIET\nB.	HEARTY";
        String question33 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	ANALYZE\nB.	SYMPATHIZE";
        String question34 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	FASCINATING\nB.	SENSIBLE";
        String question35 = "WHICH ONE OF THESE APPEALS MORE TO YOU?A.	CONVINCING\nB.	TOUCHING";
        String question36 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	CREATE\nB.      MAKE";
        String question37 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	FIRM-MINDED\nB.	WARM HEARTED";
        String question38 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	IMAGINATIVE\nB.	MATTER-OF-FACT";
        String question39 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	DETERMINED\nB.	DEVOTED";
        String question40 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	FEELING\nB.	THINKING";
        String question41 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	BENEFITS\nB.	BLESSINGS";
        String question42 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	GENTLE\nB.	FIRM";
        String question43 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	LITERAL\nB.	FIGURATIVE";
        String question44 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA. PEACEMAKER\nB. JUDGE";
        String question45 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	SYSTEMATIC\nB.	CASUAL";
        String question46 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	ANTICIPATION\nB.  COMPASSION";
        String question47 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA. SYSTEMATIC\nB. SPONTANEOUS";
        String question48 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	CERTAINTY\nB.	THEORY";
        String question49 = "WHICH ONE OF THESE APPEALS MORE TO YOU?\nA.	HARD\nB.	SOFT";


    MyerBriggsQuestions[] myerBriggsQuestions = {

            new MyerBriggsQuestions(question0,"a","b","c"),
            new MyerBriggsQuestions(question1,"a","b","c"),
            new MyerBriggsQuestions(question2,"a","b","c"),
            new MyerBriggsQuestions(question3,"a","b","c"),
            new MyerBriggsQuestions(question4,"a","b","c"),
            new MyerBriggsQuestions(question5,"a","b","c"),
            new MyerBriggsQuestions(question6,"a","b","c"),
            new MyerBriggsQuestions(question7,"a","b","c"),
            new MyerBriggsQuestions(question8,"a","b","c"),
            new MyerBriggsQuestions(question9,"a","b","c"),
            new MyerBriggsQuestions(question10,"a","b","c"),
            new MyerBriggsQuestions(question11,"a","b","c"),
            new MyerBriggsQuestions(question12,"a","b","c"),
            new MyerBriggsQuestions(question13,"a","b","c"),
            new MyerBriggsQuestions(question14,"a","b","c"),
            new MyerBriggsQuestions(question15,"a","b","c"),
            new MyerBriggsQuestions(question16,"a","b","c"),
            new MyerBriggsQuestions(question17,"a","b","c"),
            new MyerBriggsQuestions(question18,"a","b","c"),
            new MyerBriggsQuestions(question19,"a","b","c"),
            new MyerBriggsQuestions(question20,"a","b","c"),
            new MyerBriggsQuestions(question21,"a","b","c"),
            new MyerBriggsQuestions(question22,"a","b","c"),
            new MyerBriggsQuestions(question23,"a","b","c"),
            new MyerBriggsQuestions(question24,"a","b","c"),
            new MyerBriggsQuestions(question25,"a","b","c"),
            new MyerBriggsQuestions(question26,"a","b","c"),
            new MyerBriggsQuestions(question27,"a","b","c"),
            new MyerBriggsQuestions(question28,"a","b","c"),
            new MyerBriggsQuestions(question29,"a","b","c"),
            new MyerBriggsQuestions(question30,"a","b","c"),
            new MyerBriggsQuestions(question31,"a","b","c"),
            new MyerBriggsQuestions(question32,"a","b","c"),
            new MyerBriggsQuestions(question33,"a","b","c"),
            new MyerBriggsQuestions(question34,"a","b","c"),
            new MyerBriggsQuestions(question35,"a","b","c"),
            new MyerBriggsQuestions(question36,"a","b","c"),
            new MyerBriggsQuestions(question37,"a","b","c"),
            new MyerBriggsQuestions(question38,"a","b","c"),
            new MyerBriggsQuestions(question39,"a","b","c"),
            new MyerBriggsQuestions(question40,"a","b","c"),
            new MyerBriggsQuestions(question41,"a","b","c"),
            new MyerBriggsQuestions(question42,"a","b","c"),
            new MyerBriggsQuestions(question43,"a","b","c"),
            new MyerBriggsQuestions(question44,"a","b","c"),
            new MyerBriggsQuestions(question45,"a","b","c"),
            new MyerBriggsQuestions(question46,"a","b","c"),
            new MyerBriggsQuestions(question47,"a","b","c"),
            new MyerBriggsQuestions(question48,"a","b","c"),
            new MyerBriggsQuestions(question49,"a","b","c"),

    };

    takeQuiz(myerBriggsQuestions);


}

    public static void takeQuiz(MyerBriggsQuestions[] myerBriggsQuestions ) {
        int E = -4;
        int I = -7;
        int S = -6;
        int N = -13;
        int T = -4;
        int F = -14;
        int J = -5;
        int P = -4;
        Scanner scan = new Scanner(System.in);


        for (MyerBriggsQuestions myerBriggsQuestion : myerBriggsQuestions) {
            System.out.println("PLEASE CHOOSE THE RIGHT ANSWER FROM THE BELOW OPTIONS\n" + myerBriggsQuestion.questionPrompt);
            String answerChoice = scan.nextLine();
            for (int i = 0; i < myerBriggsQuestions.length; i++) {
                switch (i) {
                    case 2, 5, 8, 12, 15, 20, 23, 25 -> {
                        if (answerChoice.equalsIgnoreCase(myerBriggsQuestion.answersA)) {
                            E += 2;
                        }
                    }
                    case 28, 35, 42 -> {
                        if (answerChoice.equalsIgnoreCase(myerBriggsQuestion.answersB)) {
                            E += 2;
                        }
                    }
                }
                switch (i) {
                    case 28, 35, 42 -> {
                        if (answerChoice.equalsIgnoreCase(myerBriggsQuestion.answersA)) {
                            I += 2;
                        }
                    }
                    case 2, 5, 8, 12, 15, 20, 23, 25 -> {
                        if (answerChoice.equalsIgnoreCase(myerBriggsQuestion.answersB)) {
                            I += 2;
                        }
                    }
                }
                switch (i) {
                    case 1, 9, 11, 19, 27, 34, 41, 47 -> {
                        if (answerChoice.equalsIgnoreCase(myerBriggsQuestion.answersA)) {
                            S += 2;
                        }
                    }
                    case 4, 14, 22, 30, 37, 44 -> {
                        if (answerChoice.equalsIgnoreCase(myerBriggsQuestion.answersB)) {
                            S += 2;
                        }
                    }
                }
                switch (i) {
                    case 4, 14, 22, 30, 37, 44 -> {
                        if (answerChoice.equalsIgnoreCase(myerBriggsQuestion.answersA)) {
                            N += 2;
                        }
                    }
                    case 1, 9, 11, 19, 27, 34, 41, 47 -> {
                        if (answerChoice.equalsIgnoreCase(myerBriggsQuestion.answersB)) {
                            N += 2;
                        }
                    }
                }
                switch (i) {
                    case 29, 31, 36, 38, 43, 45, 48, 49 -> {
                        if (answerChoice.equalsIgnoreCase(myerBriggsQuestion.answersA)) {
                            T += 2;
                        }
                    }
                    case 1, 9, 11, 19, 27, 34, 41, 47 -> {
                        if (answerChoice.equalsIgnoreCase(myerBriggsQuestion.answersB)) {
                            T += 2;
                        }
                    }
                }
                switch (i) {
                    case 1, 9, 11, 19, 27, 34, 41, 47 -> {
                        if (answerChoice.equalsIgnoreCase(myerBriggsQuestion.answersA)) {
                            F += 2;
                        }
                    }
                    case 29, 31, 36, 38, 43, 45, 48, 49 -> {
                        if (answerChoice.equalsIgnoreCase(myerBriggsQuestion.answersB)) {
                            F += 2;
                        }
                    }
                }
                switch (i) {
                    case 0, 6, 7, 10, 16, 17, 18, 24, 26, 33, 40 -> {
                        if (answerChoice.equalsIgnoreCase(myerBriggsQuestion.answersA)) {
                            J += 2;
                        }
                    }
                }
                switch (i) {
                    case 0, 6, 7, 10, 16, 17, 18, 24, 26, 33, 40 -> {
                        if (answerChoice.equalsIgnoreCase(myerBriggsQuestion.answersB)) {
                            P += 2;
                        }
                    }
                }
            }
        }
            System.out.println("The value of E is: " + (E/20) + "\nThe value of I is: " + (I/20) +
                    "\nThe value of S is: " + (S/20) + "\nThe value of N is: " + (N/20) + "\nThe value of T is: " + (T/20)
                    + "\nThe value of F is: " + (F/20) + "\nThe value of J is: " + (J/20) + "\nThe value of P is: " + (P/20));
        System.out.println();
        System.out.println("""
                IN CASE OF A TIE BETWEEN THE VALUES 
                1)  between E & I, select I
                2)	between S & N, select N
                3)	between T & F, male will select ‘T’ & females ‘F’
                4)	between J & P, select P
                IF THERE'S NO TIE BETWEEN THE VALUES, SEE YOUR PERSONALITY TYPE BELOW
                """);

        System.out.print("Your personality type is: ");
        if (E > I){
            System.out.print("E");
        }else System.out.print("I");
        if (S > N ) {
            System.out.print("S");
        }else System.out.print("N");
        if (T > F ) {
            System.out.print("T");
        }else System.out.print("F");
        if (J > P ) {
            System.out.print("J");
        }else System.out.println("P");



        }

    }


