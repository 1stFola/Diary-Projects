package MyersBriggs;

public class TestCode {


    public static void main(String[] args) {

        int temp = 180;

        if (temp > 90) {
            System.out.println("This porridge is too hot.");
            temp = temp - (temp > 150 ? 100 : 20);

        }
        else {
            if (temp > 70) {
                System.out.println("This porridge is too cold.");
                temp = temp + (temp < 50 ? 30 : 20);
            }
        }

        if (temp == 80) {
            System.out.println("This porridge is just right!");
        }
        if(temp == 100){
            System.out.println("This porridge is normal");
        }
        System.out.println(temp);

    }
}