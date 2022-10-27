package methodsExercise;

import java.util.Scanner;

public class JF04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String  textInput = scanner.nextLine();
        boolean isValidLengthPass = isValidLength(textInput);
        if(!isValidLengthPass){
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean isValidContentPass =isValidContent(textInput);
        if (!isValidContentPass){
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isValidContentDigitsPass = isValidContentDigits(textInput);
        if(!isValidContentDigits(textInput)){
            System.out.println("Password must have at least 2 digits");
        }if(isValidLengthPass && isValidContentPass && isValidContentDigitsPass){
            System.out.println("Password is valid");
        }
    }
    private static boolean isValidLength (String  password){
        if (password.length() >= 6 && password.length() <= 10){
            return true;
        }else {
            return false;
        }
    }
    private static boolean isValidContent (String password){
        for (char symbol : password.toCharArray()) {
            if(!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }
    private static boolean isValidContentDigits(String password){
        int contentDigits = 0;
        for (char symbol : password.toCharArray()) {
            if(Character.isDigit(symbol)){
                contentDigits++;
            }
        }
       /* if(contentDigits >=2 ){
            return true;
        }else {
            return  false;
        }*/
        return contentDigits >= 2;
    }
}
