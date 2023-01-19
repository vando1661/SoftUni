package exam.Final;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JF0402FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+(?<productName>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 1; i <= n; i++) {
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            if(matcher.find()) {
                String productName = matcher.group("productName");
                StringBuilder productNum = new StringBuilder();
                for (int index = 0; index < productName.length(); index++) {
                    char currentSymbol = productName.charAt(index);
                    if(Character.isDigit(currentSymbol)){
                        productNum.append(currentSymbol);
                    }
                }
                if(productNum.toString().equals("")){
                    System.out.println("Product group: 00");
                }else {
                    System.out.printf("Product group: %s%n", productNum);
                }
            }
            else {
                System.out.println("Invalid barcode");
            }

        }
    }
}
