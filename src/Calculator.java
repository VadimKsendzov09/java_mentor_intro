import java.util.Scanner;
import java.util.List;
import  java.util.Arrays;

public class Calculator {
    public static void main(String[] args)
    {
        System.out.println("Hi, Man! Enter digits");
        Scanner sc = new Scanner(System.in);

        int num_1 = 0;
        int num_2 = 0;
        int result = 0;


        String[][] src_template = new String[][]{
                {"1", "I"},
                {"2", "II"},
                {"3", "III"},
                {"4", "IV"},
                {"5", "V"},
                {"6", "VI"},
                {"7", "VII"},
                {"8", "VIII"},
                {"9", "IX"},
                {"10", "X"}
        };

        while(true) {



            String entered_line = sc.nextLine();
            String[] items = entered_line.split(" ");

            String item_0 = items[0];
            String item_1 = items[1];
            String item_2 = items[2];

            if (items.length != 3){
                throw new ArithmeticException("Enter only 3 items, please");
            }

            try {

                Integer.parseInt(items[0]);

            } catch (Exception e) {
                System.out.println("your 1 item is not digit");
            }

            try {

                Integer.parseInt(items[2]);

            } catch (Exception e) {
                System.out.println("your 3 item is not digit");
            }


            for (int i = 0; i < src_template.length; i++){


                if (Arrays.asList(src_template[i]).contains(item_0)){
                    num_1 = i + 1;
                }

                if (Arrays.asList(src_template[i]).contains(item_2)){
                    num_2 = i + 1;
                }
            }

            if (item_1.equals("+")){
                result = num_1 + num_2;
            } else if (item_1.equals("-")){
                result = num_1 - num_2;
            } else if (item_1.equals("*")){
                result = num_1 * num_2;
            } else if (item_1.equals("/")){
                result = num_1 / num_2;
            } else {
                break;
            }




            System.out.println("num_1 = " + num_1 + "  num_2 = " + num_2 + "  result = " + result);

            // create switch case

        }


    }
}
