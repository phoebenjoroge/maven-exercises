import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Stringutils {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter anything: ");
        String userInput = input.nextLine();
//        System.out.println(StringUtils.isNumeric(userInput));
        if(StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is a number.");
        }
        System.out.println("Your input with changed case: " + StringUtils.swapCase(userInput));
        System.out.println("Your input in reverse: " + StringUtils.reverse(userInput));
    }
}
